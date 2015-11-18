/**
 * 
 */
$(function(){
	$("#check_analyse").click();
	$("#graph1").attr("class","nav");
});
function subTitleCtrl($scope){
	$scope.spans=[{name:"首页"},{name:"&raquo;"},{name:"统计分析"},{name:"&raquo;"},{name:"汇总表一"}];
}
function contentCtrl($scope){
	$scope.stitle="安定区人民法院（2015）年第5次评查";
	$scope.title = [
	{name:"序号"},
	{name:"案号"},
	{name:"案件名称"},
	{name:"案由"},
	{name:"承办人"},
	{name:"承办庭"},
	{name:"评查日期"},
	{name:"评审分值"}];
	$scope.content = [
	          		{t1:"<input type='checkbox'>",t2:'1',t3:"（2015）年定西民初字第00312号",t4:"张三与李四民事纠纷",t5:"民事财产纠纷",t6:"楼凌风",t7:"民二庭",t8:"2013-04-21",t9:"76"},
	          		{t1:"<input type='checkbox'>",t2:'1',t3:"（2015）年定西民初字第00312号",t4:"张三与李四民事纠纷",t5:"民事财产纠纷",t6:"楼凌风",t7:"民二庭",t8:"2013-04-21",t9:"76"},
	          		{t1:"<input type='checkbox'>",t2:'1',t3:"（2015）年定西民初字第00312号",t4:"张三与李四民事纠纷",t5:"民事财产纠纷",t6:"楼凌风",t7:"民二庭",t8:"2013-04-21",t9:"76"}
	          	];
}
