'use strict';

angular.module('hematoApp.controllers', [])
  .controller('registerDonorController', ['$scope', '$http',  function($scope, $http) {
	  
	  $scope.data = {};
	  $scope.data.donorDetails = {};
	  
	  $scope.submitRegistration = function() {		  
		  alert("in submitRegistration:" + $scope.data.donorDetails.zipcode);
		  
		  console.debug("gender:", $scope.data.donorDetails.gender);
		  console.debug("bloodGroup:", $scope.data.donorDetails.bloodGroup);
		  
		  $http({
	          url: 'api/registerDonor',
	          method: "POST",
	          data: $scope.data.donorDetails
	      }).success(function(data, status, headers, config) {
	          console.debug("in success of registerDonor");
	      }).error(function(data, status, headers, config) {
	    	  console.debug("in failure of registerDonor");
	      });
		  
	  };
	  
  }]);