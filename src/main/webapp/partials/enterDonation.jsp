<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Hemato - Blood Donation</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="css/jquery-ui/jquery-ui.css">
  <script src="js/jquery.js"></script>
  <script src="js/jquery-ui.js"></script>
  <script>
	  $(function() {
	    $("#donationDate").datepicker();
	  });
  </script>

<style type="text/css">

.top10 { margin-top:10px; }
.top30 { margin-top:30px; }
.bottom10 { margin-bottom:10px; }
.error {color:red;}

</style>


</head>
<body>

<div class="container">

<div class="row">

<div class="col-xs-10">
 
     <div class="top30">
     
       <form class="form-horizontal" data-ng-submit='submitDonation()'>
       
       	<div class="form-group">
            <div class="col-xs-8">
                <h4 id="donationEntrySuccessMsg" class="text-center" style="color:green;display:none;">Donation successfully updated</h4>
            </div>
         </div>
       
           <div class="form-group">
            <div class="col-xs-8">
                <h4 class="text-center">Please enter donation details</h4>
            </div>
            </div>
       
        <div class="form-group">
            <label for="mobileNumber" class="control-label col-xs-2">Phone Number</label>
            <div class="col-xs-5">
                <input type="text" class="form-control" id="mobileNumber" data-ui-mask="999-999-9999" data-ng-model="data.donationDetails.mobileNumber">
                <p class="error" data-ng-show="data.donationDetails.errors.mobileNumber == 1">Please enter a valid mobile number</p>
            </div>
        </div>
        
         <div class="form-group">
            <label for="donationAmount" class="control-label col-xs-2">Amount of Blood Donated</label>
            <div class="col-xs-5">
                <input type="text" class="form-control" id="donationAmount" data-ui-mask="9.999" data-ng-model="data.donationDetails.amount">
                <p class="error" data-ng-show="data.donationDetails.errors.amount == 1">Please enter a valid Amount</p>
            </div>
        </div>
        
         <div class="form-group">
            <label for="bloodBank" class="control-label col-xs-2">Blood Bank</label>
            <div class="col-xs-5">
                <input type="text" class="form-control" id="bloodBank" data-ng-model="data.donationDetails.bloodBank">
            </div>
        </div>
        
         <div class="form-group">
            <label for="donationDate" class="control-label col-xs-2">Donation Date</label>
            <div class="col-xs-5">
                <input type="text" class="form-control" id="donationDate" data-ng-model="data.donationDetails.donationDate">
            </div>
        </div>
        
        <div class="form-group">
            <div class="col-xs-offset-2 col-xs-10">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </div>
    </form>
   </div>
</div>

</div>

</div>

</body>
</html>                                		