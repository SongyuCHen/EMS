/**
 * 
 */
var detail;
$(function(){
	$("#check_analyse").click();
	$("#graph1").attr("class","nav");
	$("tbody tr").click(function(){
		window.location.href="caseList.jsp";
	});
});
function subTitleCtrl($scope){
	$scope.spans=[{name:"首页"},{name:"&raquo;"},{name:"统计分析"},{name:"&raquo;"},{name:"汇总表一"}];
}
function contentCtrl($scope){
	$scope.stitle="安定区人民法院";
	$scope.title = [
	{name:"质量登记"},
	{name:"数量"}];
	$scope.content = [
	          		{t1:"优秀",t2:'40'},
	          		{t1:"良好",t2:'15'},
	          		{t1:"合格",t2:'20'},
	          		{t1:"存在一定问题",t2:'10'},
	          		{t1:"存在较多问题",t2:'2'}
	          		
	          	];
	
	$('#container').highcharts({
        chart: {
            type: 'pie',
            options3d: {
                enabled: true,
                alpha: 45,
                beta: 0
            }
        },
        title: {
            text: $scope.stitle
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                depth: 35,
                dataLabels: {
                    enabled: true,
                    format: '{point.name}'
                }
            }
        },
        series: [{
            type: 'pie',
            name: '占比重',
            data: [
                ['优秀', 40],
                ['良好', 15],
                ['合格', 20],
                ['存在一定问题', 10],
                ['存在较多问题', 2]
            ]
        }]
    });
	
}
