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
					<span id="p-sub-title">申请快递单</span>
				</h2>
				<div id="content">
					<div id="tjdykdd">
						<div class="btn-group">
							<button class="ajxxcx">案件信息查询</button>
							<button class="addAjxx">添加打印单</button>
						</div>
						<h3 class="c-title">申请打印EMS快递单</h3>
						<form action="bckdd.do" method="POST" class="table-wrapper">
						<table class="T-table">
							<tbody>
								<tr>
									<th><span class="needed">*</span>案号：</th><td><input name="ah" type="text"></td>
									<th>收件人姓名：</th><td><input name="sjrxm" type="text"></td>
									<th>移动电话：</th><td><input name="yddh" type="text"></td>
								</tr>
								<tr>
									<th>单位名称：</th><td><input name="dwmc" type="text"></td>
									<th>住宅电话：</th><td><input name="zzdh" type="text"></td>
									<th>办公电话：</th><td><input name="bgdh" type="text"></td>
								</tr>
								<tr>
									<th><span class="needed">*</span>收件人地址：</th><td colspan="3"><input name="sjrdz" type="text" style="width: 400px;"></td>
									<th>邮政编码：</th><td><input name="yzbm" type="text"></td>
								</tr>
								<tr>
									<th>寄件内容：</th>
									<td colspan="5">
										<table>
											<tbody>
												<tr>
													<td><input type="checkbox" name="slajtzs" data-value="2" id="slajtzs"><label for="slajtzs">受理案件通知书</label></td>
													<td><input type="checkbox" name="cttzs" data-value="3" id="cttzs"><label for="cttzs">出庭通知书</label></td>
													<td><input type="checkbox" name="ystzs" data-value="5" id="ystzs"><label for="ystzs">应诉通知书</label></td>
													<td><input type="checkbox" name="mscds" data-value="7" id="mscds"><label for="mscds">民事裁定书</label></td>
													<td><input type="checkbox" name="qshfszfb" data-value="11" id="qshfszfb"><label for="qshfszfb">起诉或发诉状副本</label></td>
													<td></td>
												</tr>
												<tr>
													<td><input type="checkbox" name="mscjs" data-value="13" id="mscjs"><label for="mscjs">民事判决书</label></td>
													<td><input type="checkbox" name="dbzfb" data-value="17" id="dbzfb"><label for="dbzfb">答辩状副本</label></td>
													<td><input type="checkbox" name="mstjs" data-value="19" id="mstjs"><label for="mstjs">民事调解书</label></td>
													<td><input type="checkbox" name="jztzs" data-value="23" id="jztzs"><label for="jztzs">举证通知书</label></td>
													<td><input type="checkbox" name="cp" data-value="29" id="cp"><label for="cp">传票</label></td>
													<td><input type="checkbox" name="qt" data-value="31" id="qt"><label for="qt">其他</label></td>
												</tr>
											</tbody>
										</table>
									</td>
								</tr>
								<tr>
									<th>寄件人电话：</th><td><input name="jjrdh" type="text"></td>
									<th>寄件人姓名：</th><td><input name="jjrxm" type="text"></td>
									<th>快递单号：</th><td><input name="kddh" type="text" /></td>
								</tr>
								<tr>
									<th>文书名称：</th><td colspan="3"><input style="width:400px" name="wsmc" type="text"></td>
									<td name="error"></td>
									<td align="center"><button class="removeThisAjxx" style="background: #dc143c; border: 1px solid #dc143c;">删除</button></td>
								</tr>
							</tbody>
						</table>
						<div class="btn-group" style="text-align:center;margin-top:5px;">
							<button class="bckddxx">保存</button>
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