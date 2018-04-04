var app = angular.module("springDemo", []);
app.controller("AppCtrl", function ($scope, $http) {
    $scope.exchanges = [];
    $http.get('http://localhost:8080/api/exchange').then(function (response) {
        $scope.exchanges = response.data;
    })
});