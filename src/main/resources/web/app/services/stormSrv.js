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
                                   {"name":920101,"type":920102,"person":"aa","businessUnit":"11","lastVersion":2,"status":1},
                                   {"name":920101,"type":920102,"person":"aa","businessUnit":"11","lastVersion":2,"status":1},
                                   {"name":920101,"type":920102,"person":"aa","businessUnit":"2","lastVersion":2,"status":1},
                                   {"name":920101,"type":920102,"person":"aa","businessUnit":"2","lastVersion":2,"status":1},
                                   {"name":920101,"type":920102,"person":"aa","businessUnit":"2","lastVersion":2,"status":1}];
        	return data;

        }]
);