'use strict';


// Declare app level module which depends on filters, and services
angular.module('hematoApp', [
  'ngRoute',
  'hematoApp.filters',
  'hematoApp.services',
  'hematoApp.directives',
  'hematoApp.controllers'
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/registerDonor', {templateUrl: 'partials/registerDonor.jsp', controller: 'registerDonorController'});
  $routeProvider.when('/displaySupplies', {templateUrl: 'partials/displaySupplies.jsp', controller: 'displaySuppliesController'});
  $routeProvider.otherwise({redirectTo: '/registerDonor'});
}]);
