var homeModule = angular.module("homeModule");

homeModule.controller("HomeCtrl", ["$scope", "Home","$http", function($scope, Home,$http) {
	$scope.data = [];
	$scope.selectedRecord = undefined;
	
	Home.news.get(function(response){
		 $scope.news = response;
	});
	
	$scope.loadAutoCompleteData = function(){
		$http.get('/api/home/loadValues', {
		 }).then(function(response){
			 $scope.data = response.data;
		 });
	}
	$scope.loadAutoCompleteData();
	
	$scope.getTestData = function(){
		return  $scope.data;
	}
	
}]);
