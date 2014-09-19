<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!--[if lt IE 7]>      <html lang="en" ng-app="hematoApp" class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html lang="en" ng-app="hematoApp" class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html lang="en" ng-app="hematoApp" class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en" ng-app="hematoApp" class="no-js"> <!--<![endif]-->

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Hemato</title>
  <link rel="stylesheet" href="css/jquery-ui/jquery-ui.css">
  <link rel="stylesheet" href="css/main.css">
  <link rel="stylesheet" href="css/app.css"/>
  <script src="js/modernizr-2.6.2.js"></script>
</head>

<body>
  
  <!--[if lt IE 7]>
      <p class="browsehappy">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
  <![endif]-->

<div id="container" style="width:100%">

	<div id="header" style="width:100%;background-color:#FFA500;">
	 	<h1 style="margin-bottom:0;text-align: center">Welcome to Hemato</h1>
		
		<div id="details">
			<p style="margin-top:0px;margin-bottom:0px;"> ${user.name}; Member Number:${user.memberNumber} </p>
			<p style="margin-top:0px;margin-bottom:0px;"> ${user.street},${user.city}, ${user.zipcode} </p>
			<p style="margin-top:0px;margin-bottom:0px;"> <a href='<c:url value="j_spring_security_logout"/>'>Logout</a> </p><br/>
	  </div>	
	</div>

	<div id="menu" style="background-color:#FFD700;height:600px;width:10%;float:left;">
		<p><a href="#/registerDonor">Register Donor</a></p>
		<p><a href="#/enterDonation">Enter Donation</a></p>
		<p><a href="#/displaySupplies">Display Supplies</a></p>
		<p><a href="#/view3">Find Match</a></p>
	</div>

	<div id="content" style="background-color:#EEEEEE;height:600px;width:90%;float:left;">
		 <div ng-view></div>
	</div>

	<div id="footer" style="background-color:#FFA500;clear:both;text-align:center;">
		Copyright � Hemato Inc
	</div>
	
</div>

  <!-- In production use:
  <script src="//ajax.googleapis.com/ajax/libs/angularjs/x.x.x/angular.min.js"></script>
  -->
  <script src="js/jquery.js"></script>
  <script src="js/jquery-ui.js"></script>
  <script src="js/angular.js"></script>
  <script src="js/angular-route.js"></script>
  <script src="js/app.js"></script>
  <script src="js/services.js"></script>
  <script src="js/registerDonorController.js"></script>
  <script src="js/enterDonationController.js"></script>
  <script src="js/displaySuppliesController.js"></script>
  <script src="js/filters.js"></script>
  <script src="js/directives.js"></script>
</body>
</html>
