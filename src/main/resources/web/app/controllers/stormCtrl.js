/**
 * Created by xnnie on 15-4-1.
 */

stormModule.controller('stormListCtrl', function($scope,$http) {

    $scope.url=CONFIG.URL;
    $scope.topics=[
        {"name":920101,"type":920102,"person":"aa","businessUnit":"11","lastVersion":2,"status":1},
        {"name":920101,"type":920102,"person":"aa","businessUnit":"11","lastVersion":2,"status":1},
        {"name":920101,"type":920102,"person":"aa","businessUnit":"2","lastVersion":2,"status":1},
        {"name":920101,"type":920102,"person":"aa","businessUnit":"2","lastVersion":2,"status":1},
        {"name":920101,"type":920102,"person":"aa","businessUnit":"2","lastVersion":2,"status":1}];

    $scope.init=function(){
        var options = {
            method: 'GET',
            url: $scope.url + '/topics'
        };


    };

    $scope.init();



});

