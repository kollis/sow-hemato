<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Hemato</title>
  <link rel="stylesheet" href="css/main.css">
  <link rel="stylesheet" href="css/app.css"/>
  <script src="js/modernizr-2.6.2.js"></script>
</head>

<body>

<div id="container" style="width:100%">

	<div id="header" style="width:100%;background-color:#FFA500;">
		<h1 style="margin-bottom:0;text-align: center">Welcome to Hemato1</h1>
		
		<div id="details">
			<p style="margin-top:0px;margin-bottom:0px;"> ${user.name}; Member Number:${user.memberNumber} </p>
			<p style="margin-top:0px;margin-bottom:0px;"> ${user.street},${user.city}, ${user.zipcode} </p><br/>
			<p style="margin-top:0px;margin-bottom:0px;"> <a href='<c:url value="j_spring_security_logout"/>'>Logout</a> </p>
		</div>
		
	</div>

	<div id="menu" style="background-color:#FFD700;height:500px;width:10%;float:left;">
		<p><a href="#/view1">Borrow a book</a></p>
		<p><a href="#/view2">Request a pass</a></p>
		<p><a href="sample1.htm">Change details</a></p>
		<p>Library Events</p>
	</div>

	<div id="content" style="background-color:#EEEEEE;height:500px;width:90%;float:left;">
		Content goes here
		 <div ng-view></div>
	</div>

	<div id="footer" style="background-color:#FFA500;clear:both;text-align:center;">
		Copyright © Hemato Inc
	</div>
	
</div>

  <script src="js/angular.js"></script>
  <script src="js/angular-route.js"></script>
  <script src="js/app.js"></script>
  <script src="js/services.js"></script>
  <script src="js/controllers-sow.js"></script>
  <script src="js/filters.js"></script>
  <script src="js/directives.js"></script>

</body>
</html>