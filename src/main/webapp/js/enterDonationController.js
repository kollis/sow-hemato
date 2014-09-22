'use strict';

angular.module('hematoApp.controllers')
  .controller('enterDonationController', ['$scope', '$http', function($scope, $http) {
	  
	  function isNullOrEmpty(str) {
		 if (null == str || '' == str) {
			 return true;
		 } 
		 return false;
	  }
	  ;
	  $scope.data = {};
	  $scope.data.donationDetails = {};
	  $scope.data.donationDetails.errors = {};
	   
	  $scope.submitDonation = function() {		  
		  
		  $scope.data.donationDetails.errors = {};
		  
		  console.debug("mobileNumber:", $scope.data.donationDetails.mobileNumber);
		  console.debug("amount:", $scope.data.donationDetails.amount);
		  
		  if (isNullOrEmpty($scope.data.donationDetails.mobileNumber) || $scope.data.donationDetails.mobileNumber.length != 10) {
			  console.debug("not a valid phone number");
			  $scope.data.donationDetails.errors.mobileNumber = 1;
		  }
		  
		  if (isNullOrEmpty($scope.data.donationDetails.amount) || $scope.data.donationDetails.amount.length != 4) {
			  console.debug("not a valid amount");
			  $scope.data.donationDetails.errors.amount = 1;
		  } else {
			  $scope.data.donationDetails.amount = $scope.data.donationDetails.amount.substr(0,1) + '.' + $scope.data.donationDetails.amount.substr(1);
			  console.debug("amount:", $scope.data.donationDetails.amount);
		  }
		  
		  if ($scope.data.donationDetails.errors.length == 0) 
          {
			  $http({
		          url: 'api/registerDonation',
		          method: "POST",
		          data: $scope.data.donationDetails
		      }).success(function(data, status, headers, config) {
		          console.debug("in success of registerDonation");
		          $scope.data.donationDetails = {};
		          $("#donationEntrySuccessMsg").fadeIn(3000).fadeOut(9000);
		      }).error(function(data, status, headers, config) {
		    	  console.debug("in failure of registerDonation");
		      });
          }	  
	  };
	  
  }]);