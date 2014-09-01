<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Twitter Bootstrap 3 Fluid Layout Example</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<style type="text/css">

.top10 { margin-top:10px; }
.top30 { margin-top:30px; }
.bottom10 { margin-bottom:10px; }

</style>

</head>
<body>

<div class="container">

<div class="row">

<div class="col-xs-10">
 
     <div class="top30">
     
     		

       <form class="form-horizontal">
       
           <div class="form-group">
            <div class="col-xs-8">
                <h4 class="text-center">Please enter donor details</h4>
            </div>
            </div>
       
        <div class="form-group">
            <label for="firstName" class="control-label col-xs-2">First Name</label>
            <div class="col-xs-5">
                <input type="text" class="form-control" id="firstName">
            </div>
        </div>
        
         <div class="form-group">
            <label for="lastName" class="control-label col-xs-2">Last Name</label>
            <div class="col-xs-5">
                <input type="text" class="form-control" id="lastName">
            </div>
        </div>
        
         <div class="form-group">
         	<label for="gender" class="control-label col-xs-2">Gender</label>
	        <div>
			   <label class="checkbox-inline">
			      <input type="radio" id="gender1" value="male"> Male
			   </label>
			   <label class="checkbox-inline">
			      <input type="radio" id="gender2" value="female"> Female
			   </label>
			</div>
		 </div>
        
        <div class="form-group">
            <label for="bloodGroup" class="control-label col-xs-2">Blood Group</label>
            <div class="col-xs-2">
                <select class="form-control">
                	 <option value="">Select</option>
			         <option value="A+">A+</option>
			         <option value="A-">A-</option>
			         <option value="B+">B+</option>
			         <option value="B-">B-</option>
			         <option value="O+">O+</option>
			         <option value="O-">O-</option>
      			</select>
            </div>
       </div>
        
       <div class="form-group">
            <label for="mobileNumber" class="control-label col-xs-2">Mobile Phone</label>
            <div class="col-xs-5">
                <input type="text" class="form-control" id="mobileNumber">
            </div>
       </div>
       
        <div class="form-group">
            <label for="email" class="control-label col-xs-2">Email</label>
            <div class="col-xs-5">
                <input type="email" class="form-control" id="email">
            </div>
        </div>
        
         <div class="form-group">
            <label for="street" class="control-label col-xs-2">Street</label>
            <div class="col-xs-5">
                <input type="text" class="form-control" id="street">
            </div>
        </div>
        
        <div class="form-group">
            <label for="city" class="control-label col-xs-2">City</label>
            <div class="col-xs-5">
                <input type="text" class="form-control" id="city">
            </div>
        </div>
       
       <div class="form-group">
            <label for="zipcode" class="control-label col-xs-2">Zipcode</label>
            <div class="col-xs-5">
                <input type="text" class="form-control" id="zipcode">
            </div>
        </div>
       
        <div class="form-group">
            <div class="col-xs-offset-2 col-xs-10">
                <button type="submit" class="btn btn-primary">Register</button>
            </div>
        </div>
    </form>
   </div>
</div>


</div>

</div>

</body>
</html>                                		