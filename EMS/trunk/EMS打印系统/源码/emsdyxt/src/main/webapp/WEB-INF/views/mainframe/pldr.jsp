<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>送达管理系统</title>
		<link rel="stylesheet" type="text/css"
			href="resources/css/jquery-ui-1.8.21.custom.css">
		<link rel="stylesheet" type="text/css" href="resources/css/main.css">
	</head>
	<body>
		<div id="header"></div>
		<%@include file="../inc/header.jsp"%>
		<div id="main">
			<%@include file="../inc/leftMenu.jsp"%>
			<div id="right">
				<h2 id="position">
					<span id="p-title">送达信息</span> >>
					<span id="p-sub-title">批量导入</span>
				</h2>
				<div id="content">
					<div id="tjdykdd">
						<h3 class="c-title">
							EMS快递单批量导入
						</h3>
						<form id="mForm" method="post" name="mForm"
							enctype="multipart/form-data" action=""
							onsubmit="return ischangeFile()">
							<input name="kdid" value="${kddxx.kdid }" type="hidden" />
							<table class="T-table" style="width: 822px;">
								<tbody>
									<tr>
										<th>
											上传回执压缩包：
										</th>
										<td colspan="5">
											<input id='sign' value="${kddxx.kdhz}" type='hidden' />
											<input id='isup' name='isup' type='hidden' />
											<input id="uploadfile" name="uploadfile" type="file"
												style="width: 300px; height: 23px" />
										</td>
										<td></td>
									</tr>
								</tbody>
							</table>
							<c:choose>
								<c:when test="${kddxx.kdhz == null}">
									<div class="btn-group"
										style="text-align: center; margin-top: 5px;">
										<input id="save" type="submit" value="保存"
											class="view_button mainleft_view" />
										<input id="cancel" type="submit" value="取消"
											class="view_button mainleft_view" />
										<input id="upload" name="upload" type="submit"
											style="display: none">
									</div>
								</c:when>
								<c:otherwise>
									<div class="btn-group"
										style="text-align: center; margin-top: 5px;">
										<input id="cancel" type="submit" value="关闭"
											class="view_button mainleft_view" />
									</div>
								</c:otherwise>
							</c:choose>

						</form>
					</div>
				</div>

			</div>
		</div>
		<script src="resources/js/jquery-1.11.2.min.js"></script>
		<script src="resources/js/jquery-ui-1.9.2.custom.min.js"></script>
		<script src="resources/js/common.js"></script>
		<script type="text/javascript">
	var ischange = "n";
	$(function() {
		$("#cancel").click(function(e) {
			window.close();
		});
		$("#uploadfile").change(function(e) {
			var filename = $("#uploadfile").val();
			if (filename == "") {
				ischange = "n";
				$("#isup").val("n");
			} else {
				ischange = "y";
				$("#isup").val("y");
			}
			//alert(ischange+"&"+filename);
		});
	});
	function ischangeFile() {
		if (ischange == "y") {
			return true;
		} else {

			return false;
		}
	}
</script>
	</body>
</html>

