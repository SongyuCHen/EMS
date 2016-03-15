<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>送达管理系统</title>
		<link rel="stylesheet" type="text/css" href="resources/css/main.css">
	</head>
	<body>
		<div id="header"></div>
		<%@include file="../inc/header.jsp"%>
		<div id="main">
			<%@include file="../inc/leftMenu.jsp"%>
			<div id="right">
				<h2 id="position">
					<span id="p-title">申请打印快递单</span> >>
					<span id="p-sub-title">未打印快递单</span>
				</h2>
				<div id="content">
					<div class="btn-group-float">
						<button class="allBtn">
							全选
						</button>
						<button class="previewBtn">
							打印预览
						</button>
						<button class="deleteBtn"
							style="background: #dc143c; border: 1px solid #dc143c;">
							删除
						</button>
					</div>
					<div id="wdykddcx">
						<h3 class="c-title">
							未打印快递单列表
						</h3>
						<div class="table-wrapper">
							<table class="R-table">
								<thead>
									<tr>
										<th style="width: 40px;">
											选择
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
										<th style="width: 100px;">
											地址
										</th>
										<th style="width: 46px;">
											操作人
										</th>
										<th>
											快递单号
										</th>
										<th style="width: 40px;">
											是否打印
										</th>
										<th style="width: 40px;">
											查看
										</th>
									</tr>
								</thead>
								<tbody>

									<c:forEach items="${wdyList}" var="kdModel">
										<tr data-kdid="${kdModel.kdid}">
											<td>
												<input type="checkbox" data-selectedKdid="${kdModel.kdid}">
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
												${kdModel.sjrdz}
											</td>
											<td>
												${kdModel.jjrxm}
											</td>
											<td>
												${kdModel.kddh}
											</td>
											<td>
												否
											</td>
											<td>
												<a href="getDetail.do?kdid=${kdModel.kdid}" target="_self">详细</a>
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
		<script src="resources/js/wdy.js"></script>
	</body>
</html>