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
					<span id="p-sub-title">投递中</span>
				</h2>
				<div id="content">

					<div id="wdykddcx">
						<h3 class="c-title">
							正在投递的快递
						</h3>
						<form action="getTdz.do" method="post" class="table-wrapper">
							<table class="T-table">
								<tbody>
									<tr>
										<th>
											起始日期：
										</th>
										<td>
											<input name="qsrq" value="${start}" class="datepicker">
										</td>
										<th>
											结束日期：
										</th>
										<td>
											<input name="jsrq" value="${end}" class="datepicker">
											<button style="margin-left: 66px;">
												搜索
											</button>
										</td>
									</tr>
								</tbody>
							</table>
						</form>

						<div class="table-wrapper" style="min-height: 260px;">
							<table class="R-table">
								<thead>
									<tr>
										<th>
											快递单号
										</th>
										<th>
											案号
										</th>
										<th>
											收件人姓名
										</th>
										<th>
											移动电话
										</th>
										<th>
											单位名称
										</th>
										<th style="width: 50px;">
											操作人
										</th>
										<th>
											打印时间
										</th>
										<th style="width: 80px;">
											操作
										</th>
									</tr>
								</thead>
								<tbody>

									<c:forEach items="${ydyList}" var="kdModel">
										<tr data-kdid="${kdModel.kdid}">
											<td>
												${kdModel.kddh}
											</td>
											<td>
												${kdModel.ah}
											</td>
											<td>
												${kdModel.sjrxm}
											</td>
											<td>
												${kdModel.yddh}
											</td>
											<td>
												${kdModel.dwmc}
											</td>
											<td>
												${kdModel.jjrxm}
											</td>
											<td>
												${kdModel.dyrq}
											</td>
											<td>
												<a href="sd.do?kdid=${kdModel.kdid}" target="_blank">确认送达</a>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>

				</div>
			</div>
		</div>

		<script src="resources/js/jquery-1.11.2.min.js"></script>
		<script src="resources/js/jquery-ui-1.9.2.custom.min.js"></script>
		<script src="resources/js/jquery-ui-timepicker-addon.js"></script>
		<script src="resources/js/jquery-ui-timepicker-zh-CN.js"></script>
		<script src="resources/js/common.js"></script>
		<script src="resources/js/ydy.js"></script>
	</body>
</html>