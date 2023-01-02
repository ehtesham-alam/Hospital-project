<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link href="jsp/assets/css/admin.css"  rel="stylesheet" type="text/css" />
<title>Hospital management System</title>
</head>
<body>
<script type="text/javascript">

function openPage(pageName, elmnt, color) {
	  // Hide all elements with class="tabcontent" by default */
	  var i, tabcontent, tablinks;
	  tabcontent = document.getElementsByClassName("tabcontent");
	  for (i = 0; i < tabcontent.length; i++) {
	    tabcontent[i].style.display = "";
	  }

	  // Remove the background color of all tablinks/buttons
	  tablinks = document.getElementsByClassName("list");
	  for (i = 0; i < tablinks.length; i++) {
	    tablinks[i].style.backgroundColor = "";
	  }

	  // Show the specific tab content
	  document.getElementById(pageName).style.display = "";

	  // Add the specific color to the button used to open the tab content
	  elmnt.style.backgroundColor = color;
	}

	// Get the element with id="defaultOpen" and click on it
	document.getElementById("defaultOpen").click();



</script>
 <jsp:include page="Home1.jsp" />
 <button class="list"  onclick="openPage('Doctor list',this,'green' )" id="defaultOpen">Doctor List</button>
 <button class="list"   onclick="openPage('Patient list',this,'red' )">Patient List</button>
 <button class="list"  onclick="openPage('Doctor Registration',this, 'yellow')">Doctor Registration</button>
 
 <div id="Doctor list"  class="tabcontent">
 
 <p>Doctor list......</p>
 </div>
 <div  id="Patient list"  class="tabcontent"> 
 <p>Patient list......</p>
 </div>
  <div  id="Doctor Registration" class="tabcontent"> 
 <p>Doctor Registration......</p>
 </div>

</div>
</div>
</body>
</html>