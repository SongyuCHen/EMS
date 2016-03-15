<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>法院送达管理系统</title>
		<link rel="stylesheet" type="text/css" href="resources/css/login.css">
	</head>
	<body>
		<div id="content">
			<form id="login_form" action="login.do" method="post">
				<label style="font-size: 14px;width:56px;display:inline-block;" for="username"> 
					用户名： 
				</label>
				<input type="text" id="yhm" name="username">
				<br />
				<label style="font-size: 14px;width:56px;display:inline-block;" for="password">
					密<span style="width:13px;display: inline-block;"></span>码：
				</label>
				<input type="password" id="mm" name="password">
				<br />
				<input type="checkbox" id="reme" checked="checked" />
				<label style="font-size: 12px;" id="reme" for="c_memory">
					记住用户名和密码
				</label>
				<br />
				<input id="login" type="submit" value="登 录">
				<c:if test="${errorMessage != null}"><a style="color:red">用户名或密码错误</a></c:if>
			</form>
			<div id="footer">
				人民法院 版权所有
			</div>
		</div>
		<script src="resources/js/jquery-1.7.1.min.js"></script>
        <script src="resources/js/jquery-ui-1.9.2.custom.min.js"></script>
        <script src="resources/js/jquery.ui.datepicker-zh-CN.js"></script>
        <script src="resources/js/jquery.dataTables.min.js"></script>
        <script src="resources/js/common.js"></script>
        <script src="resources/js/login.js"></script>
	</body>
</html>