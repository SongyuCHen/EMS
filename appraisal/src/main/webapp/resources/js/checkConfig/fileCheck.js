var detail;
$(function(){
	$("#check_config").click();
	$("#file_check").attr("class","nav");
});

function subTitleCtrl($scope){
	$scope.spans=[{name:"首页"},{name:"&raquo;"},{name:"评查配置"},{name:"&raquo;"},{name:"文书评查"}];
}
function contentCtrl($scope){
	$scope.stitle="文书评查";
	$scope.title = [
	{name:"序号"},
	{name:"评查项目"},
	{name:"分值"}];
	$scope.content = [
	          		{t1:"1",t2:'没有按照法院诉讼文书样式制作',t3:"10"},
	          		{t1:"2",t2:'叙述事实不清',t3:"5~10"}
	          	];
}
