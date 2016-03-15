/**
 * Created by zxyu on 15-10-17.
 */

$(function(){
    $("#search_require .arrow").click(function(){
        toggle_search__require_list();
    });
});
function toggle_search__require_list(){
    $("#search_require .search_body").slideToggle(300);
    if($("#search_require .arrow").attr('data-show') == 'no'){
        $("#search_require .arrow").attr('data-show','yes');
    }else{
        $("#search_require .arrow").attr('data-show','no');
    }
}
$(function(){
	$("#check_task").click();
	$("#start_check").attr("class","nav");
});

function subTitleCtrl($scope){
	$scope.spans=[{name:"首页"},{name:"&raquo;"},{name:"评查任务"},{name:"&raquo;"},{name:"发起评查"}];
}

var tableCtrl_1 = function($scope,$http){
	$scope.th = [
	        	{name:"序号"},
	        	{name:"案号"},
	        	{name:"当事人"},
	        	{name:"案由"},
	        	{name:"立案日期"},
	        	{name:"结案日期"},
	        	{name:"承办人"}];
	$scope.content = "";
	/*$scope.content = [
	          		{t1:"<input type='checkbox' ng-checked='selectAll'>",t2:'1',t3:"（2013）临刑初字第146号",t4:"安永得",t5:"抢劫",t6:"2013-04-21",t7:"2014-09-18",t8:"曹永德"},
	          	];*/
	$scope.searchAJ = function(){
		$.ajax({url:"/search_aj.do",data:{
			"property":$("#property").val(),
			"process":$("#process").val(),
			"reason":$("#reason").val(),
			"director":$("#director").val(),
			"court":$("#court").val(),
			"room":$("#room").val(),
			"start_date1":$("#start_date1").val(),
			"start_date2":$("#start_date2").val(),
			"end_date1":$("#end_date1").val(),
			"end_date2":$("#end_date2").val(),
		},type:"post",dataType:"json",async:false,success:function(data){
			$scope.content = data;
		}});
	}
}

function search_trigger(){
	//tableCtrl_1.searchAJ;
	$.ajax({url:"/appraisal/search_aj.do",data:{
		"property":$("#property").val(),
		"process":$("#process").val(),
		"reason":$("#reason").val(),
		"director":$("#director").val(),
		"court":$("#court").val(),
		"room":$("#room").val(),
		"start_date1":$("#start_date1").val(),
		"start_date2":$("#start_date2").val(),
		"end_date1":$("#end_date1").val(),
		"end_date2":$("#end_date2").val(),
	},type:"post",dataType:"json",async:false,success:function(data){
		//$scope.content = data;
		alert(data);
	}});
};


function tableCtrl_3($scope){
	$scope.lawcase = [
	             {name:"(2015)定中民一初字第0210号",done:false},
	             {name:"(2015)定中民一初字第0211号",done:false},
	             {name:"(2015)定中民一初字第0212号",done:false},
	             {name:"(2015)定中民一初字第0213号",done:false},
	             {name:"(2015)定中民一初字第0214号",done:false}
	             ];
	$scope.courtroom = [
	             {name:"审监庭",}
	             ];
	$scope.staff = [
	             {name:"赵浩",done:false},
	             {name:"王波",done:false},
	             {name:"凌无双",done:false},
	             {name:"楼亚军",done:false},
	             {name:"欧阳修",done:false},
	             ];
	
	//被分配的结果
	$scope.result = [];
	//被选中分配的案件
	$scope.lawcaseSeleceted = [];
	
	$scope.allot = function(){
		//获取选中案件的值
		var oldcaseList = $scope.lawcase;
		$scope.lawcase = [];
		//被选中的职员
		var staffSelected = $("input[name='staff']:checked").val();
		//alert(staffSelected);
		//存储
		angular.forEach(oldcaseList,function(x){
			if(x.done){ 
				$scope.lawcaseSeleceted.push({name:x.name,done:false});	
				$scope.result.push({lawcasename:x.name,staffname:staffSelected,done:false});
			}else{
				$scope.lawcase.push({name:x.name,done:false});
			}
		});
		
	};
	//撤销选中的
	$scope.turnback = function(){
		var oldresult = $scope.result;
		$scope.result = [];
		var resultSelected = $("input[name='result']:checked");
		//console.log(resultSelected);
		angular.forEach(resultSelected,function(x){
			console.log(x);
			var lawcasename = x.value.split("/")[0];
			var staffSelected = x.value.split("/")[1];
				$scope.lawcase.push({name:lawcasename,done:false});						
		});
		
		var resultUnSelected = $("input[name='result']").not("input:checked");
		angular.forEach(resultUnSelected,function(x){
			console.log(x);
			var lawcasename = x.value.split("/")[0];
			var staffSelected = x.value.split("/")[1];
				$scope.result.push({lawcasename:lawcasename,staffname:staffSelected,done:false});			
		});
	};
}

