<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
  <head>
     <title>
        Custom Login Form
     </title>
  </head>
  <body>
     <h3>My Custom Login Page</h3>
     <form:form action="${pageContext.request.contextPath}/authenticateTheUser"
        method="POST">
        <p>
           User name:<input type="text" name="username"/>
        </p>
         <p>
          Password  :<input type="password" name="password"/>
        </p>
        <input type="submit" value="Login"/>
        </form:form>
  </body>
</html>