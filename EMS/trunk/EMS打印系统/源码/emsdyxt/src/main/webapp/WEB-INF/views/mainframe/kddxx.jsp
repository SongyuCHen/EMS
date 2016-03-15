<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>送达管理系统</title>
		<link rel="stylesheet" type="text/css" href="resources/css/jquery-ui-1.8.21.custom.css">
		<link rel="stylesheet" type="text/css" href="resources/css/main.css">
	</head>
	<body>
		<div id="header"></div>
		<%@include file="../inc/header.jsp"%>
		<div id="main">
			<%@include file="../inc/leftMenu.jsp"%>
			<div id="right">
				<h2 id="position">
					<span id="p-title">申请打印快递单</span>
					>>
					<span id="p-sub-title">快递单信息</span>
				</h2>
				<div id="content">
					<div id="tjdykdd">
						<h3 class="c-title">EMS快递单信息</h3>
						<form action="bckdd.do" method="POST" class="table-wrapper">
						<input name="kdid" value="${kddxx.kdid }" type="hidden"/>
						<table class="T-table">
							<tbody>
									<tr>
										<th><span class="needed">*</span>案号：</th><td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> name="ah" type="text" value="${kddxx.ah }"></td>
										<th>收件人姓名：</th><td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> name="sjrxm" type="text" value="${kddxx.sjrxm }"></td>
										<th>移动电话：</th><td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> name="yddh" type="text" value="${kddxx.yddh }"></td>
									</tr>
									<tr>
										<th>单位名称：</th><td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> name="dwmc" type="text" value="${kddxx.dwmc }"></td>
										<th>住宅电话：</th><td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> name="zzdh" type="text" value="${kddxx.zzdh }"></td>
										<th>办公电话：</th><td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> name="bgdh" type="text" value="${kddxx.bgdh }"></td>
									</tr>
									<tr>
										<th><span class="needed">*</span>收件人地址：</th><td colspan="3"><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> name="sjrdz" type="text" style="width: 400px;" value="${kddxx.sjrdz }"></td>
										<th>邮政编码：</th><td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> name="yzbm" type="text" value="${kddxx.yzbm }"></td>
									</tr>
									<tr>
										<th>寄件内容：</th>
										<td colspan="5">
											<table>
												<tbody>
													<tr>
														<td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> type="checkbox" name="slajtzs" data-value="2" <c:if test="${kddxx.jjnr%2 == 0 }">checked="checked"</c:if> id="slajtzs"><label for="slajtzs">受理案件通知书</label></td>
														<td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> type="checkbox" name="cttzs" data-value="3" <c:if test="${kddxx.jjnr%3 == 0 }">checked="checked"</c:if> id="cttzs"><label for="cttzs">出庭通知书</label></td>
														<td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> type="checkbox" name="ystzs" data-value="5" <c:if test="${kddxx.jjnr%5 == 0 }">checked="checked"</c:if> id="ystzs"><label for="ystzs">应诉通知书</label></td>
														<td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> type="checkbox" name="mscds" data-value="7" <c:if test="${kddxx.jjnr%7 == 0 }">checked="checked"</c:if> id="mscds"><label for="mscds">民事裁定书</label></td>
														<td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> type="checkbox" name="qshfszfb" data-value="11" <c:if test="${kddxx.jjnr%11 == 0 }">checked="checked"</c:if> id="qshfszfb"><label for="qshfszfb">起诉或发诉状副本</label></td>
														<td></td>
													</tr>
													<tr>
														<td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> type="checkbox" name="mscjs" data-value="13" <c:if test="${kddxx.jjnr%13 == 0 }">checked="checked"</c:if> id="mscjs"><label for="mscjs">民事判决书</label></td>
														<td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> type="checkbox" name="dbzfb" data-value="17" <c:if test="${kddxx.jjnr%17 == 0 }">checked="checked"</c:if> id="dbzfb"><label for="dbzfb">答辩状副本</label></td>
														<td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> type="checkbox" name="mstjs" data-value="19" <c:if test="${kddxx.jjnr%19 == 0 }">checked="checked"</c:if> id="mstjs"><label for="mstjs">民事调解书</label></td>
														<td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> type="checkbox" name="jztzs" data-value="23" <c:if test="${kddxx.jjnr%23 == 0 }">checked="checked"</c:if> id="jztzs"><label for="jztzs">举证通知书</label></td>
														<td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> type="checkbox" name="cp" data-value="29" <c:if test="${kddxx.jjnr%29 == 0 }">checked="checked"</c:if> id="cp"><label for="cp">传票</label></td>
														<td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> type="checkbox" name="qt" data-value="31" <c:if test="${kddxx.jjnr%31 == 0 }">checked="checked"</c:if> id="qt"><label for="qt">其他</label></td>
												</tr>
												</tbody>
											</table>
										</td>
									</tr>
									<tr>
										<th>寄件人电话：</th><td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> name="jjrdh" type="text" value="${kddxx.jjrdh }"></td>
										<th>寄件人姓名：</th><td><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> name="jjrxm" type="text" value="${kddxx.jjrxm }"></td>
										<th>快递单号：</th><td><input name="kddh" type="text" /></td>
									</tr>
									<tr>
										<th>文书名称：</th><td colspan="3"><input <c:if test="${isYdy == 1 }"> readonly = "readonly"</c:if> style="width:400px" name="wsmc" type="text"></td>
										<td name="error"></td>
										<td align="center"><button class="removeThisAjxx" style="background: #dc143c; border: 1px solid #dc143c;">删除</button></td>
									</tr>
							</tbody>
						</table>
						<div class="btn-group" style="text-align:center;margin-top:5px;">
							<button class="bckddxx" onclick="location.href='javascript:history.go(-1);'">保存</button>
							<button style="margin-left:25px;" class="sckddxx">清空</button>
						</div>
					</form>
					</div>
				</div>

			</div>
		</div>
		<script src="resources/js/jquery-1.11.2.min.js"></script>
			<script src="resources/js/jquery-ui-1.9.2.custom.min.js"></script>
		<script src="resources/js/common.js"></script>
	</body>
</html>