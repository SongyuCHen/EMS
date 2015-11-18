function subTitleCtrl($scope){
	$scope.spans=[{name:"首页"},{name:"&raquo;"},{name:"评查任务"},{name:"&raquo;"},{name:"评查列表"}];
}

function tableCtrl($scope){
	$scope.title = [
	{name:"序号"},
	{name:"评查名称"},
	{name:"评查项目"},
	{name:"案卷筛选条件"},
	{name:"开始日期"},
	{name:"结束日期"}];
	
	$scope.content = [
		{t1:"<input type='checkbox'>",t2:'1',t3:"2015年第5次评查",t4:"庭审/文书/审判流程/卷宗",t5:"民事二审案件",t6:"2013-04-21",t7:"2014-09-18"},
		{t1:"<input type='checkbox'>",t2:'1',t3:"2015年第5次评查",t4:"庭审/文书/审判流程/卷宗",t5:"民事二审案件",t6:"2013-04-21",t7:"2014-09-18"}
	];
}

$(function(){
	$("#check_task").click();
	$("#check_list").attr("class","nav");
});