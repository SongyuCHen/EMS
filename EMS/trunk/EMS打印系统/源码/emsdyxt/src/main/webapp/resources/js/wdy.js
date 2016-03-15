/**
 * 未打印列表的相关操作，包括查看详情、删除、打印等功能
 */
// 全选
$(document).on("click", ".allBtn", function() {
	$("input").each(function() {
		$(this).attr("checked", true);
	});
});

// 删除
$(document).on("click", ".deleteBtn", function() {
	var inputs = document.getElementsByTagName('input');
	var selectedKdidList = "";
	for ( var i = 0; i < inputs.length; i++) {
		if (inputs[i].checked == true) {
			selectedKdidList += $(inputs[i]).data("selectedkdid") + ";";
			$(inputs[i]).parent().parent().remove();
		}
	}
	$.ajax({
		type : 'post',
		url : 'delete.aj',
		data : {
			"kdidList" : selectedKdidList
		},
		dateType : 'html',
		success : function(html) {
		}
	});

});

// 预览
$(document).on("click", ".previewBtn", function() {
	var inputs = document.getElementsByTagName('input');
	var selectedKdidList = "";
	for ( var i = 0; i < inputs.length; i++) {
		if (inputs[i].checked == true) {
			selectedKdidList += $(inputs[i]).data("selectedkdid") + ";";
		}
	}
	window.open("preview.aj?kdidList=" + selectedKdidList);
});
