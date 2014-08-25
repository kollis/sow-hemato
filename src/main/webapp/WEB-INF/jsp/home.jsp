<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>

<div id="container" style="width:100%">

	<div id="header" style="width:100%;background-color:#FFA500;">
		<h1 style="margin-bottom:0;text-align: center">Welcome to Hemato</h1>
		
		<div id="details">
			<p style="margin-top:0px;margin-bottom:0px;"> ${user.name}; Member Number:${user.memberNumber} </p>
			<p style="margin-top:0px;margin-bottom:0px;"> ${user.street},${user.city}, ${user.zipcode} </p><br/>
			<p style="margin-top:0px;margin-bottom:0px;"> <a href='<c:url value="j_spring_security_logout"/>'>Logout</a> </p>
		</div>
		
	</div>

	<div id="menu" style="background-color:#FFD700;height:500px;width:10%;float:left;">
		<p><a href="borrowBook.htm">Borrow a book</a></p>
		<p><a href="requestPass.htm">Request a pass</a></p>
		<p>Change details</p>
		<p>Library Events</p>
	</div>

	<div id="content" style="background-color:#EEEEEE;height:500px;width:90%;float:left;">
		Content goes here
	</div>

	<div id="footer" style="background-color:#FFA500;clear:both;text-align:center;">
		Copyright © Hemato Inc
	</div>
	
</div>

</body>
</html>