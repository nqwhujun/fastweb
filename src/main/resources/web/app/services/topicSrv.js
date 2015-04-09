/**
 * Created by xnnie on 15-4-1.
 */
angular.module("TopicMeta", [])
    .factory("TopicMetaService", [
        '$http', function ($http) {

            var options = {
                method: 'GET',
                url: CONFIG.URL + '/topics'
            };

            var data= [
                                   {"name":1,"type":920102,"person":"aa","businessUnit":"11","lastVersion":2,"status":1},
                                   {"name":2,"type":920102,"person":"aa","businessUnit":"11","lastVersion":2,"status":1},
                                   {"name":3,"type":920102,"person":"aa","businessUnit":"2","lastVersion":2,"status":1},
                                   {"name":4,"type":920102,"person":"aa","businessUnit":"2","lastVersion":2,"status":1},
                                   {"name":5,"type":920102,"person":"aa","businessUnit":"2","lastVersion":2,"status":1},
                                   {"name":6,"type":920102,"person":"aa","businessUnit":"2","lastVersion":2,"status":1},
                                   {"name":7,"type":920102,"person":"aa","businessUnit":"2","lastVersion":2,"status":1},
                                   {"name":8,"type":920102,"person":"aa","businessUnit":"2","lastVersion":2,"status":1}];
        	return data;

        }]
);