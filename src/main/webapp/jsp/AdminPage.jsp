<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hospital Management System</title>
</head>
<body>
<jsp:include page="Home1.jsp" />
<h1 align="center">Hospital Admin</h1>

<tr><th ><input style="width: 50%; align-items: center;"  type="text"   name=" " id="myInput" placeholder="Enter Doctor Name"  onkeyup="searchFun()"> </th>
 </tr>
 <br>
 <tr></tr>
<table border="3" id="table">
<tr align="center"  id="hel"><th style="width: 10%">Id</th><th style="width: 10%">Age</th><th style="width: 10%">data_of_birth</th><th style="width: 10%">email_id</th><th style="width: 10%">first_name</th><th style="width: 10%">Gender</th><th style="width: 10%">last_name</th>
<th style="width: 10%">login_id</th><th style="width: 10%">mobile_no</th><th style="width: 10%">password</th> </tr>
	
<c:forEach  items="${list}"  var="list1" > 
<tr >
<th> <c:out value=" ${list1.id }" /></th>
<th> <c:out value=" ${list1.age}" /></th>
<th> <c:out value=" ${list1.data_of_birth }" /></th>
<th> <c:out value=" ${list1.email_id }" /></th>
<th> <c:out value=" ${list1.first_name }" /></th>
<th> <c:out value=" ${list1.gender}" /></th>
<th> <c:out value=" ${list1.last_name }" /></th>
<th> <c:out value=" ${list1.login_id}" /></th>
<th> <c:out value=" ${list1.mobile_no }" /></th>
<th> <c:out value=" ${list1.password }" /></th>

<th><a href="Edit/${list1.id}">Edit</a></th>
<th><a href="Delete/${list1.id}">Delete</a></th>
</tr>
</c:forEach>

</table>
<script>
const searchFun()=()=>{

	let filter = document.getElementById('myInput').value.toUpperCase();
	let table=document.getElementById('table');
	let tr=table.getElementsByTagName('tr');
	for(var i=0; i<tr.length ;i++)
		{ 
		let th=tr[i].getElementsByTagName('th')[4];

if(th){
	let textvalue=th.textContent || th.innerHTML;
	if(textvalue.toUpperCase().indexOf(filter) > -1){
            tr[i].style.display = "";
		}
	else {
            tr[i].style.display= "none";
		}
  }
		
		}
}
</script>

</body>
</html>