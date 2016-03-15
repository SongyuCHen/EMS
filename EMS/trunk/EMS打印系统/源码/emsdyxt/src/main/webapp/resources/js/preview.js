/**
 * 打印快递单
 */
var kdList = $('.ems-area');
for ( var i = 0; i < kdList.length; i++) {
	var ah = $(kdList[i]).data("ah");
	var tmp1 = ah.substring(1, ah.length);
	var ah1 = tmp1.split(")")[0];
	var tmp2 = tmp1.split(")")[1];
	var ah2 = tmp2.split("字")[0];
	var tmp3 = tmp2.split("字")[1];
	var ah3 = tmp3.split("号")[0];
	
	$($(kdList[i]).children()[0]).text(ah1);
	$($(kdList[i]).children()[1]).text(ah2);
	$($(kdList[i]).children()[2]).text(ah3);
}
$(document).on("click", ".printBtn", function() {
	
	// 更新数据库的打印日期
	
	var inputs = $('.ems-area');
	var selectedKdidList = "";
	for ( var i = 0; i < inputs.length; i++) {
		selectedKdidList += $(inputs[i]).data("kdid") + ";";
	}
	$.ajax({
		type : 'post',
		url : 'printed.aj',
		data : {
			"kdidList" : selectedKdidList
		},
		dateType : 'html',
		success : function(html) {
		}
	});
	
	// 调用系统打印
	 $(".print-area").printArea();
});