'use strict';

angular.module('hematoApp.controllers')
  .controller('displaySuppliesController', ['$scope', '$http', function($scope, $http) {
	  
 $scope.suppliesReport = null;
	  
	  $http({
          url: 'TestServlet',
          method: "POST"
      }).success(function(data, status, headers, config) {
    	  $scope.suppliesReport = data;
          console.debug("in success of TestServlet in MyCtrl4:", data);
      }).error(function(data, status, headers, config) {
    	  console.debug("in failure of TestServlet in MyCtrl4");
      });

  }]);