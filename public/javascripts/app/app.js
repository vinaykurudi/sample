/**
 * 
 */
'use strict';

angular.module("homeModule", []);

var webApp = angular.module('webApp', [
	'ngRoute',
	'ngResource',
	'ui.bootstrap',
	'homeModule'
]);

webApp.config(['$routeProvider', function($routeProvider) {
	return $routeProvider.
		when("/", {templateUrl: '/views/home/home', controller: 'HomeCtrl'}).
		when("/test", {templateUrl: '/views/home/test', controller: 'HomeCtrl'}).
		otherwise({redirectTo: '/'});
}]);

