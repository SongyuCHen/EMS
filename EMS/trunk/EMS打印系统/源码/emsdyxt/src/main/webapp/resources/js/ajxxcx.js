/**
 *案件信息查询
 */
$(document).on("click",".ajxxsearch",function(){
	$(".ajcxjg tbody").html('<img class="loading" src="resources/css/img/loading.gif" />');
	$.ajax({
		type:'get',
		url:'ajxxcx.aj',
		data:{
		      "bmmc":$('.ajcxtj select[name="bmmc"]').val() , 
		      "cbr":$('.ajcxtj input[name="cbr"]').val() ,
		      "ah":$('.ajcxtj input[name="ah"]').val(),
		      "ajmc":$('.ajcxtj input[name="ajmc"]').val(),
		      "qsrq":$('.ajcxtj input[name="qsrq"]').val(),
		      "jsrq":$('.ajcxtj input[name="jsrq"]').val()
		      },
		dateType:'html',
		success:function(html){
			$(".ajcxjg tbody").html(html);
		}
	});
});

$('.datepicker').datepicker();