angular.module("homeModule")
.factory("Home", ["$resource", function($resource) {
	return {
		news : $resource("/api/home/news")
	}
}]);

