<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="nav">
	<ul id="info">
		<li>
			<span class="yh"></span>当前用户：${userContext.name}
		</li>
		<li>
			<span class="bm"></span>部门：${userContext.bmmc}
		</li>
		<li>
			<span class="time"></span>当前时间：2015年01月20日 星期二 11:25
		</li>
	</ul>
	<div id="link">
		<!-- 
				<a href="">修改密码</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
				 -->
		<a href="logout.do">退出登录</a>
	</div>
</div>