<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   <%@ page isELIgnored="false" %>
   <%@page isELIgnored="false" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital Management System</title>
 <link href="jsp/assets/css/a.css"  rel="stylesheet" type="text/css" />
</head>
<body>
<jsp:include page="Home1.jsp" />
<div id="invalid"><h4>${invalid}</h4>
<div class="admin_login">
<h4 >Admin Login Page</h4>
<div class="sav">
<form:form action="admin_logined"  method="post"  modelAttribute="admin_login">

<table  >
<tr><td>Admin login Id</td></tr>
<tr><td><input type="text"   name="login"  required="required"> </td></tr>

<tr><td>Password</td></tr>
<tr><td><input type="password"   name="password"  required="required"> </td></tr>
<tr><td> <input  type="submit"  value="Submit" class="green"></td> </tr>
</table>

</form:form>

</div>
</div>
</div>
<div class="back_button">
<a href="home" ><button>Back to Home</button> </a>
</div>
</body>
</html>