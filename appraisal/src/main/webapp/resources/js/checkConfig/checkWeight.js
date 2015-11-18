var detail;
$(function(){
	$("#check_config").click();
	$("#check_weight").attr("class","nav");
});

function subTitleCtrl($scope){
	$scope.spans=[{name:"首页"},{name:"&raquo;"},{name:"评查配置"},{name:"&raquo;"},{name:"评查权重"}];
}
function contentCtrl($scope){
	$scope.stitle="评查权重";
	$scope.title = [
	{name:"评查分项"},
	{name:"权重"}];
	$scope.content = [
	          		{t1:"案件实体裁判",t2:'40'},
	          		{t1:"案件程序方面",t2:'40'},
	          		{t1:"法律文书",t2:'20'}
	          	];
}
