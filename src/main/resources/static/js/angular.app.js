var app = angular.module('app', []);
app.controller('postController', function($scope, $http, $location) {
    $scope.submitForm = function(){
        var url = $location.absUrl() + "create-customer";

        // Configure text return
        var config = {
            headers : {
                'Accept': 'text/plain'
            }
        }

        // Prepare data
        var data = {
            firstName : $scope.firstName,
            lastName : $scope.lastName,
            age : $scope.age
        };

        // Do POST to remote-server
        $http.post(url, data, config).then(function (message) {
            $scope.returnMessage = message.data;
        }, function error(response) {
            $scope.returnMessage = "Error";
        });

        // Reset input data in view
        $scope.firstName = "";
        $scope.lastName = "";
        $scope.age = "";
    }
});

app.controller('getController', function ($scope, $http, $location) {
    $scope.getFunction = function () {
        var url = $location.absUrl() + "get-all-customers";

        $http.get(url).then(function (response) {
            $scope.customers = response.data;
        }, function error(response) {
            $scope.returnMessage = "Error";
        });
    }
});