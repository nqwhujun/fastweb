/**
 * Created by xnnie on 15-4-1.
 */
var topicModule = angular.module('Topic', ['ngRoute','TopicMeta','baseTable']);
var stormModule = angular.module('Storm', ['ngRoute']);
var clogging = angular.module('portal', ['ngRoute','Topic','Storm']);
clogging.config(['$routeProvider',
    function ($routeProvider) {

        $routeProvider
            .when(
            '/storm', {
                templateUrl: 'app/partials/storm.html',
                reloadOnSearch: false
            }).otherwise({
                templateUrl: 'app/partials/topic.html',
                reloadOnSearch: false
            });
    }]);

