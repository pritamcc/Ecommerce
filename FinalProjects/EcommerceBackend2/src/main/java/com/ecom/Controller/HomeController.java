package com.ecom.Controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ecom.DAO.ProductDAO;
import com.ecom.Model.Product;

@Controller
public class HomeController {
	private Path path;

	@Autowired
	private ProductDAO productDAO;

	@RequestMapping("/")
	public String Display() {
		return "index";
	}

	@RequestMapping("/listProduct")
	public String listProduct(Model theModel) {
		List<Product> theproducts = productDAO.getAllProduct();
		theModel.addAttribute("products", theproducts);

		return "productDetail";
	}

	/*
	 * @RequestMapping("/listProduct/viewProduct/{id}") public String
	 * viewProduct(@PathVariable String id,Model model) { Product product =
	 * productDAO.getProductbyId(id); model.addAttribute(product);
	 * 
	 * return "viewProduct"; }
	 */

	@RequestMapping("/listProduct/viewProduct")
	public String viewProduct(@RequestParam("productId") int theId, Model model) {
		Product product = productDAO.getProductbyId(theId);

		model.addAttribute("products", product);

		return "viewProduct";
	}

	@RequestMapping("/admin")
	public String adminPage() {
		return "admin";
	}

	@RequestMapping("/admin/productInventory")
	public String productInventory(Model model) {
		List<Product> theproducts = productDAO.getAllProduct();
		model.addAttribute("products", theproducts);

		return "productInventory";
	}

	@RequestMapping("/admin/productInventory/addProduct")
	public String getProductForn(Model theModel) {
		Product theProduct = new Product();

		theModel.addAttribute("addproduct", theProduct);
		return "productform";
	}

	@PostMapping(value = "/admin/productInventory/addProduct")
	public String addProducts(@ModelAttribute("addproduct") Product theProduct, HttpServletRequest request) {
		productDAO.addProducts(theProduct);

		MultipartFile productImage = theProduct.getProductImage();
		if (productImage != null && !productImage.isEmpty()) {
			Path path = Paths.get("D:/FinalProjects/EcommerceFrontend2/src/main/webapp/WEB-INF/resource/images/"
					+ theProduct.getId() + ".png");
			try {
				productImage.transferTo(new File(path.toString()));
			} catch (IllegalStateException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		/*
		 * MultipartFile productImage = theProduct.getProductImage(); String
		 * rootDirectory =
		 * request.getSession().getServletContext().getRealPath("/"); path =
		 * Paths.get(rootDirectory,"\\WEB-INF\\resource\\images"+theProduct.
		 * getId()+"png"); if(productImage != null && !productImage.isEmpty())
		 * try{ productImage.transferTo(new File(path.toString()));
		 * }catch(Exception e) { e.printStackTrace(); throw new
		 * RuntimeException("Product image saving Failed",e); }
		 */

		return "redirect:/admin/productInventory";
	}
	
	 @RequestMapping("/admin/productInventory/editProduct/{id}")
	 public String editProduct(@PathVariable("id") int theId,Model model)
	 {
		 Product product = productDAO.getProductbyId(theId);
		 
		 model.addAttribute(product);
		 return "editProduct";
	 }
	 
	 @PostMapping(value="/admin/productInventory/editProduct")
	 public String editProduct(@ModelAttribute("product") Product product,Model model,HttpServletRequest request)
	 {
		MultipartFile productImage = product.getProductImage();
		
		Path path = Paths
				.get("D:/FinalProjects/EcommerceFrontend2/src/main/webapp/WEB-INF/resource/images/" + product.getId() + ".png");
		 if(productImage != null && !productImage.isEmpty())
		    {
			   try{
				   productImage.transferTo(new File(path.toString()));
			   }catch(Exception e)
		        {
		         throw new RuntimeException("Product image saving failed"+e);
		        }
		    }
		       productDAO.editProduct();
			return "redirect:/admin/productInventory";
		
		}

	@RequestMapping("/admin/productInventory/deleteProduct")
	public String deleteProduct(@RequestParam("productId") int theId) {
		Path path = Paths
				.get("D:/FinalProjects/EcommerceFrontend2/src/main/webapp/WEB-INF/resource/images/" + theId + ".png");
		if (Files.exists(path))
			try {
				Files.delete(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
		productDAO.deleteProduct(theId);

		return "redirect:/admin/productInventory";
	}

}
