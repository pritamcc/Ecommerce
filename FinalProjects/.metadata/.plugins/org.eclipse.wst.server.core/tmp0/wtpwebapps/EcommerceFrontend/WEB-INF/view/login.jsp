<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Playfair+Display" rel="stylesheet">

<meta charset="ISO-8859-1">
<title>Login</title>
<style>
    body{
  background: #00589F;
  filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#00589F', endColorstr='#0073CF', GradientType=0);
  background: -webkit-linear-gradient(to bottom, #00589F 50%, #0073CF) !important;
  background: -moz-linear-gradient(to bottom, #00589F 50%, #0073CF) !important;
  background: -ms-linear-gradient(to bottom, #00589F 50%, #0073CF) !important;
  background: -o-linear-gradient(to bottom, #00589F 50%, #0073CF) !important;
  background: linear-gradient(to bottom, #00589F 50%, #0073CF) !important;
  color: white;
 
 }
div.well{
  height: 250px;
} 

.Absolute-Center {
  margin: auto;
  position: absolute;
  top: 0; left: 0; bottom: 0; right: 0;
}

.Absolute-Center.is-Responsive {
  width: 50%; 
  height: 50%;
  min-width: 200px;
  max-width: 400px;
  padding: 40px;
}

#logo-container{
  margin:0% 0% 0% 20%;
  margin-bottom: 10px;
}

</style>
<script src="https://use.fontawesome.com/512e7150fb.js"></script>
</head>
<body>
<div class="content">
     <div class="container-fluid container">
  <div class="row">
    <div class="Absolute-Center is-Responsive">
      <div id="logo-container">
      <img src="D:\Projects\Ecommerce\src\main\resources\images\logo.png" class="img-fluid" width=50% height=25% > 
      </div>
      <div class="col-sm-12 col-md-10 col-md-offset-1">
        <form action="" id="loginForm" >
          <div class="form-group input-group">
            <span class="input-group-addon"><i class="fa fa-user" aria-hidden="true"></i></span>
            <input class="form-control" type="text" name='username' placeholder="username" required="required"/>          
          </div>
          <div class="form-group input-group">
            <span class="input-group-addon"><i class="fa fa-unlock-alt" aria-hidden="true"></i></span>
            <input class="form-control" type="password" name='password' placeholder="password" required="required"/>     
          </div>
          <div class="checkbox">
            <label>
              <input type="checkbox"> I agree to the <a href="#">Terms and Conditions</a>
            </label>
          </div>
          <div class="form-group">
            <button type="button" class="btn btn-def btn-block">Login</button>
          </div>
          <div class="form-group text-center">
            <a href="#">Forgot Password</a>&nbsp;|&nbsp;<a href="#">Support</a>
          </div>
        </form>        
      </div>  
    </div>    
  </div>
</div>
</div>               
</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</html>
