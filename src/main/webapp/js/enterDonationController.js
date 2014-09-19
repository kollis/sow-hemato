'use strict';

angular.module('hematoApp.controllers')
  .controller('enterDonationController', ['$scope', '$http', function($scope, $http) {
	  
	  $scope.data = {};
	  $scope.data.donationDetails = {};
	  
	  //$("#datepicker").datepicker();
	 
	  $scope.submitDonation = function() {		  
		  
		  console.debug("mobileNumber:", $scope.data.donationDetails.mobileNumber);
		  
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
		  
	  };
	  
  }]);