/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2017-11-30 10:13:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\t\r\n");
      out.write("\t<html>\r\n");
      out.write("\t   <head>\r\n");
      out.write("\t       <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t       \r\n");
      out.write("\t      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\">\r\n");
      out.write("\t       <meta charset=\"ISO-8859-1\">\r\n");
      out.write("\t       \r\n");
      out.write("\t       <style type=\"text/css\">\r\n");
      out.write("\t            \r\n");
      out.write("\t              /*logo  */\r\n");
      out.write("\t              .div {\r\n");
      out.write("\t                   display: block;\r\n");
      out.write("\t                   margin: 0px 0px 0px 50px;\r\n");
      out.write("\t                   width: 40%;\r\n");
      out.write("\t                    }\r\n");
      out.write("\t\r\n");
      out.write("                 .carousel1 {\r\n");
      out.write("\t                    \r\n");
      out.write("\t                     height:65%;\r\n");
      out.write("\t\t\t\t\t\t width:100%\r\n");
      out.write("\t                   }  \r\n");
      out.write("\t                   \r\n");
      out.write("\t                   .choice{\r\n");
      out.write("\t                    \r\n");
      out.write("\t                      border:1px solid Red;    \r\n");
      out.write("\t                      height:35%;\r\n");
      out.write("\t                      width:25%;\r\n");
      out.write("\t                      margin:-1% 2% 0% 4%;\r\n");
      out.write("\t                   }\r\n");
      out.write("\t                   \r\n");
      out.write("\t                   .image\r\n");
      out.write("\t                      {\r\n");
      out.write("\t                   \r\n");
      out.write("\t                   \r\n");
      out.write("\t                        }\r\n");
      out.write("\r\n");
      out.write("\t       </style>\r\n");
      out.write("\t   </head>\r\n");
      out.write("\t   <title>\r\n");
      out.write("\t     Watches\r\n");
      out.write("\t   </title> \r\n");
      out.write("\t  \r\n");
      out.write("\t    \r\n");
      out.write("\t   <body>      \r\n");
      out.write("\t   <!--  logo -->\r\n");
      out.write("\t    <div class=\"container-fluid div\">\r\n");
      out.write("\t      <img src=\"D:\\Projects\\Ecommerce\\src\\main\\resources\\images\\logo.png\" class=\"img-fluid\"  >    \r\n");
      out.write("\t   </div> \r\n");
      out.write("       <div>\r\n");
      out.write("\t     <a href=\"login\">Login</a>&nbsp;&nbsp;<a href=\"registrationForm\">Register</a>\r\n");
      out.write("\t\t \r\n");
      out.write("\t   </div>\r\n");
      out.write("\t     <!--         Navigation   -->\r\n");
      out.write("\t\t <nav class=\"navbar-fixed-top\">\r\n");
      out.write("\t     <div class=\"container-fluid border border-primary \">\r\n");
      out.write("\t              <ul class=\"nav justify-content-center navbar-light bg-light \">\r\n");
      out.write("\t                  <li class=\"nav-item\">\r\n");
      out.write("\t                   <a class=\"nav-link active\" href=\"#\">Home</a>\r\n");
      out.write("\t                   </li>\r\n");
      out.write("\t                   <li class=\"nav-item\">\r\n");
      out.write("\t                   <a class=\"nav-link\" href=\"#\">Watches</a>\r\n");
      out.write("\t                   </li>\r\n");
      out.write("\t                   <li class=\"nav-item\">\r\n");
      out.write("\t                   <a class=\"nav-link\" href=\"#\">Accesories</a>\r\n");
      out.write("\t                   </li>\r\n");
      out.write("\t                   <li class=\"nav-item\">\r\n");
      out.write("\t                   <a class=\"nav-link \" href=\"#\">Contact-us</a>\r\n");
      out.write("\t                   </li>\r\n");
      out.write("\t                  \r\n");
      out.write("\t               </ul>\r\n");
      out.write("\t    </div>     \r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\r\n");
      out.write("\t     <br/>\r\n");
      out.write("<div class=\"container-fluid\">\t     \r\n");
      out.write("\t<div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("  <ol class=\"carousel-indicators\">\r\n");
      out.write("    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("    <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n");
      out.write("  </ol>\r\n");
      out.write("  <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("    <div class=\"carousel-item active\">\r\n");
      out.write("      <img class=\"d-block img-fluid\" src=\"D:\\Projects\\Ecommerce\\src\\main\\webapp\\WEB-INF\\resources\\images\\Rado.jpg\" height=\"8000\" width=\"1800\" alt=\"First slide\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img class=\"d-block img-fluid\" src=\"D:\\Projects\\Ecommerce\\src\\main\\webapp\\WEB-INF\\resources\\images\\Rado2.jpg\"  height=\"8000\" width=\"1800\" alt=\"Second slide\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"carousel-item\">\r\n");
      out.write("      <img class=\"d-block img-fluid\" src=\"D:\\Projects\\Ecommerce\\src\\main\\webapp\\WEB-INF\\resources\\images\\Watch_finder_5_0.jpg\"  height=\"8000\" width=\"1800\" alt=\"Third slide\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("    <span class=\"sr-only\">Previous</span>\r\n");
      out.write("  </a>\r\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("    <span class=\"sr-only\">Next</span>\r\n");
      out.write("  </a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<hr>\r\n");
      out.write("  <div style=\"background-color:#E2E3E4\">\r\n");
      out.write("\t<div class=\"container\" >\r\n");
      out.write("\t   <img src=\"D:\\Projects\\Ecommerce\\src\\main\\resources\\images\\men.jpg\"  class=\"image img-thumbnail\" height=\"35%\" width=\"30%\">\r\n");
      out.write("\t    &nbsp;&nbsp;&nbsp;<img src=\"D:\\Projects\\Ecommerce\\src\\main\\resources\\images\\women.jpg\"  class=\"image img-thumbnail\" height=\"35%\" width=\"30%\">\r\n");
      out.write("\t\t &nbsp;&nbsp;&nbsp;<img src=\"D:\\Projects\\Ecommerce\\src\\main\\resources\\images\\kid.jpg\"  class=\"image img-thumbnail\" height=\"35%\" width=\"30%\">\r\n");
      out.write("       <div class=\"middle\">\r\n");
      out.write("       <div class=\"text\">Men</div>\r\n");
      out.write("       </div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"container-fluid\" style=\"background-color:#003366\" >\r\n");
      out.write("\t   Information\r\n");
      out.write("\t   \r\n");
      out.write("\t</div>\r\n");
      out.write("\t  \r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script> \r\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" ></script>\r\n");
      out.write("\t\r\n");
      out.write("\t</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
