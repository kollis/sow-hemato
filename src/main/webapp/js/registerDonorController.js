'use strict';

angular.module('hematoApp.controllers', [])
  .controller('registerDonorController', ['$scope', function($scope) {
	  
	  $scope.data = {};
	  $scope.data.donorDetails = {};
	  
	  $scope.submitRegistration = function() {		  
		  alert("in submitRegistration:" + $scope.data.donorDetails.zipcode);
	  };
	  
  }]);