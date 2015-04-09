/**
 * Created by xnnie on 15-3-31.
 */
topicModule.controller('topicListCtrl', function($scope,$filter,$http,$compile,TopicMetaService,baseTableService) {

   $scope.url=CONFIG.URL;


   $scope.init=function(){
       $scope.dataList = TopicMetaService;
       $scope.table=baseTableService.getCustomizedTable($scope,$filter);
   };

    $scope.init();

    $scope.popShowUpload=function(){
        var modal = $('#modal');
        modal.find('.modal-dialog').css('width', '');
        var html = "<div style='border-bottom: 1px solid #808080; display:block' class='popupLogList'>" +"</div>";
        var element = angular.element(html);
        $compile(element)($scope);
        var modalBody = modal.find(".modal-body-inner");
        modalBody.empty();
        modalBody.append(element);
        modal.modal({keyboard: true});
    };



});

