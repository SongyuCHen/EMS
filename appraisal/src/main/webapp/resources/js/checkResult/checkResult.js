var detail;
$(function(){
	$("#check_task").click();
	$("#check_result").attr("class","nav");
	$("tbody tr").click(function(){
	    var y = $(this).offset().top;
	    $(".sm-modal").css("top",(y+40)+"px");
	    $(".sm-modal").show();
	    detailCtrl.updateDetail;
	});
});
  function confirm1(){
      $(".sm-modal").hide();
  }
function subTitleCtrl($scope){
	$scope.spans=[{name:"首页"},{name:"&raquo;"},{name:"评查任务"},{name:"&raquo;"},{name:"评查结果"}];
}

function contentCtrl($scope){
	$scope.stitle="(2015)年第5次评查";
	$scope.checkItem = [
	   {name:'审判流程评查',value:"op1",check:"true"},
	   {name:'庭审评查',value:"op2",check:""},
	   {name:'文书评查',value:"op3",check:""},
	   {name:'卷宗装订评查',value:"op4",check:""},
	   {name:'定罪量刑',value:"op5",check:""},
	   {name:'社会效果',value:"op6",check:""}
	];
	$scope.checkEvid ="民事";
	$scope.title = [
	{name:"序号"},
	{name:"案号"},
	{name:"案件名称"},
	{name:"案由"},
	{name:"承办人"},
	{name:"承办庭"},
	{name:"立案日期"},
	{name:"评审状态"}];
	$scope.content = [
	          		{t1:"<input type='checkbox'>",t2:'1',t3:"（2015）年定西民初字第00312号",t4:"张三与李四民事纠纷",t5:"民事财产纠纷",t6:"楼凌风",t7:"民二庭",t8:"2013-04-21",t9:"未评查"},
	          		{t1:"<input type='checkbox'>",t2:'1',t3:"（2015）年定西民初字第00312号",t4:"张三与李四民事纠纷",t5:"民事财产纠纷",t6:"楼凌风",t7:"民二庭",t8:"2013-04-21",t9:"未评查"},
	          		{t1:"<input type='checkbox'>",t2:'1',t3:"（2015）年定西民初字第00312号",t4:"张三与李四民事纠纷",t5:"民事财产纠纷",t6:"楼凌风",t7:"民二庭",t8:"2013-04-21",t9:"未评查"}
	          	];
}

var detailCtrl = function($scope){
	var updateDetail = function() {
	    $scope.detail = [
	                     {name:'审判流程评查',value:"80"},
	                     {name:'庭审评查',value:"75"},
	                     {name:'文书评查',value:"60"},
	                     {name:'卷宗装订评查',value:"93"},
	                     {name:'定罪量刑',value:""},
	                     {name:'社会效果',value:""}
	            ];
	};
	updateDetail();
}

function show_detail(){
	window.location.href="resultDetail.jsp";
}
