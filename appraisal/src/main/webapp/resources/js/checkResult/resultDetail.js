/**
 * 
 */
$(function(){
	$("#check_task").click();
	$("#check_result").attr("class","nav");
});
function subTitleCtrl($scope){
	$scope.spans=[{"name":"首页"},{"name":"&raquo;"},{"name":"评查任务"},{"name":"&raquo;"},{"name":"评查结果"}];
}
function contentCtrl($scope){
	$scope.stitle="(2015)年第5次评查";
	$scope.content =  [
	    {"id":"trial_process","total":"90","item":[{"name":"卷宗装订有问题","score":"3"},{"name":"卷宗封皮与内容不一致","score":"5"},{"name":"卷宗目录结构不符合规定","score":"2"}]},
	    {"id":"dossier_check","total":"80","item":[{"name":"卷宗装订有问题","score":"3"},{"name":"卷宗封皮与内容不一致","score":"5"},{"name":"卷宗目录结构不符合规定","score":"2"}]},
	    {"id":"file_check","total":"60","item":[{"name":"卷宗装订有问题","score":"3"},{"name":"卷宗封皮与内容不一致","score":"5"},{"name":"卷宗目录结构不符合规定","score":"2"}]},
	    {"id":"trial_check","total":"50","item":[{"name":"卷宗装订有问题","score":"3"},{"name":"卷宗封皮与内容不一致","score":"5"},{"name":"卷宗目录结构不符合规定","score":"2"}]}
	];
}
$(function(){
	$(".tab span").click(function(){
		var id = $(this).attr("data-id");
		$(".detail_data").hide();
		$("#"+id).show();
		$(".tab .nav").attr("class","");
		$(this).attr("class","nav");
	});
	var id = $(".tab .nav").attr("data-id");
	$("#"+id).show();
});