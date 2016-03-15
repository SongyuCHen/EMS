
var oLanguage = {
		"sProcessing" : "处理中...",
		"sLengthMenu" : "显示 _MENU_ 项结果",
		"sZeroRecords" : "没有匹配结果",
		"sInfo" : "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
		"sInfoEmpty" : "显示第 0 至 0 项结果，共 0 项",
		"sInfoFiltered" : "(由 _MAX_ 项结果过滤)",
		"sInfoPostFix" : "",
		"sSearch" : "搜索:",
		"sUrl" : "",
		"oPaginate" : {
			"sFirst" : "首页",
			"sPrevious" : "上页",
			"sNext" : "下页",
			"sLast" : "末页"
		}
};
var $body = $('body');

$body.append('<div id="j_dlg"></div>');
$body.append('<div id="j_dlg2"></div>');
$body.append('<div id="j_alert"></div>');

var $dlg = $('#j_dlg').dialog({
	autoOpen : false,
	resizable : false,
	modal : true,
	dialogClass : 'dlg-wrap'
});

var $dlg2 = $('#j_dlg2').dialog({
	autoOpen : false,
	resizable : false,
	modal : true,
	dialogClass : 'dlg-wrap'
});

$.fn.initDlg = function() {
	$(".ui-dialog #j_dlg").parent().remove();
	$(".ui-dialog #j_dlg2").parent().remove();
	$("#j_dlg").remove();
	$("#j_dlg2").remove();
	$body.append('<div id="j_dlg"></div>');
	$body.append('<div id="j_dlg2"></div>');
	$dlg = $('#j_dlg').dialog({
		autoOpen : false,
		resizable : false,
		modal : true,
		dialogClass : 'dlg-wrap'
	});
	$dlg2 = $('#j_dlg2').dialog({
		autoOpen : false,
		resizable : false,
		modal : true,
		dialogClass : 'dlg-wrap'
	});
};

var $alert = $('#j_alert').dialog({
	autoOpen : false,
	modal : true,
	resizable : false,
	width : 400,
	dialogClass : 'dlg-wrap',
	title : '<img src="resources/css/img/dlg_title_dot.png" />提示信息',
	buttons:{
		"确定":function(){
			$alert.dialog("close");
		}
	}
});

$(document).on("click","li.one",function(){

	if($(this).hasClass("active")) {
		$(this).removeClass("active");
		$(this).next("li.two").hide();
	} else {
		$(this).addClass("active");
		$(this).next("li.two").show();
	}
});
//
//$(document).on("click",".sub-list li",function(){
//	$(".sub-list li.active").removeClass("active");
//	var $this=$(this);
//	$this.addClass("active");
//	$("#p-sub-title").html($this.text());
//});

//提交序号生成的快递单的当事人信息
function generateKDSJRXX()
{
	var $f=$('.ajdsrxxjg');
	var ajdsr = "";
	$('.ajdsrxxjg input[type="checkbox"]:checked').each(function(){
		ajdsr += $(this).data('id')+"&";
	});
	if(ajdsr.length == 0)
	{
		$alert.html("请选择当事人！").dialog('open');
		return false;
	}
	$f.append('<input type="hidden" name="dsrxx" value="'+ajdsr+'" />');
	$f.submit();
	return true;
}

//案件信息查询
$(document).on("click",".ajxxcx",function(){
	$.ajax({
		type:'get',
		url:'ajxxcxui.aj',
		dateType:'html',
		success:function(html){
			$dlg.html(html).dialog({
				title:'<img src="resources/css/img/dlg_title_dot.png" />案件信息查询',
				height:'auto',
				width:'auto' , 
				buttons: {
					"查看当事人": function() {
						var aXh="";
						$('.ajcxjg input[type="checkbox"]:checked').each(function(){
							aXh += $(this).data('ajxh')+",";
						});
						if(aXh.length < 1)
							$alert.html("请选择需要查看的案件！").dialog('open');
						else
							$.ajax({
								type:'get',
								url:'ajcxdsrxx.aj',
								data:{'ajxhs' : aXh},
								dateType:'html',
								success:function(html){
									$dlg2.html(html).dialog({
										title:'<img src="resources/css/img/dlg_title_dot.png" />当事人信息',
										height:'auto',
										width:'auto' , 
										buttons: {
											"确定": function() {
												if(generateKDSJRXX())
												{
													$dlg2.dialog('close');
													$dlg.dialog('close');
												}										
											},
											"取消": function() {
												$dlg2.dialog('close');
											}
										}
									}).dialog('open');
								}
							});
					},
					"取消" : function() {
						$dlg.dialog('close');
					}
				}
			}).dialog('open');
		}
	});
});

//datepicker本地化
jQuery(function($){
	$.datepicker.regional['zh-CN'] = {
			closeText: '关闭',
			prevText: '&#x3c;上月',
			nextText: '下月&#x3e;',
			currentText: '今天',
			monthNames: ['一月','二月','三月','四月','五月','六月',
			             '七月','八月','九月','十月','十一月','十二月'],
			             monthNamesShort: ['一月','二月','三月','四月','五月','六月',
			                               '七月','八月','九月','十月','十一月','十二月'],
			                               dayNames: ['星期日','星期一','星期二','星期三','星期四','星期五','星期六'],
			                               dayNamesShort: ['周日','周一','周二','周三','周四','周五','周六'],
			                               dayNamesMin: ['日','一','二','三','四','五','六'],
			                               weekHeader: '周',
			                               dateFormat: 'yy-mm-dd',
			                               firstDay: 1,
			                               isRTL: false,
			                               showMonthAfterYear: true,
			                               yearSuffix: '年'};
	$.datepicker.setDefaults($.datepicker.regional['zh-CN']);
});

$('.datepicker').datepicker( {
	changeMonth : true,
	changeYear : true,
	yearRange : "1900:2200"
});

//清空快递单信息
$(document).on('click','.sckddxx',function(){
	$('#tjdykdd .T-table').each(function(){
		$(this).find("input").val("");
		$(this).find('input[type="checkbox"]:checked').removeAttr("checked");
	});
	return false;	
});

function showErrors(sInfo, content) {
	var errorfield = $('<div class="error"></div>');
	errorfield.appendTo(content.find('td[name="error"]'));
	$('.error').html(sInfo);
}

// 增加快递单表 addAjxx -- by 徐鑫源
$(document).on('click', '.addAjxx', function(){
	var newTable = $(this).parent().parent().find('.T-table').last().clone();
	var ah = newTable.find("input[name='ah']").val();
	newTable.find("input").val("");
	newTable.find("input[name='ah']").val(ah);
	newTable.find('input[type="checkbox"]:checked').removeAttr("checked");
	$(this).parent().parent().find('.table-wrapper').find('.T-table').last().after(newTable);
});

//删除快递单表 removeThisAjxx -- by 徐鑫源
$(document).on('click', '.removeThisAjxx', function(){
	var remainTable = $(this).parent().parent().parent().parent().parent().parent().find('.table-wrapper').find('.T-table').size();
	if(remainTable<2) {
		alert("最后一个快递单无法删除！");
		return false;
	} else {
		$(this).parent().parent().parent().parent().remove();
	}
});


//必填项检测以及快递内容提交
$(document).on('click' ,'.bckddxx' , function(){
	$('div.error').remove();
	var canSubmit = true;
	$('.needed').each(function(){
		var $val = $(this).parent().next().find("input");
		if($val.val().length == 0)
		{
			if(canSubmit)
			{
				canSubmit = false;
				showErrors("*必填项不能为空!", $(this).parent().parent().parent().parent());
			}
		}
	});
	if(canSubmit)
	{
		$('#tjdykdd .T-table').each(function(){
			var jjnr = 1;
			$($(this).find('input[type="checkbox"]:checked')).each(function(){
				jjnr *= $(this).data("value");
			});
			$(this).append('<input type="hidden" name="jjnr" value="'+jjnr+'" />');
		});
	}
	return canSubmit;
	
});