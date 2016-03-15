<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="left">
	<h2 id="menu-title">
		管理菜单
	</h2>
	<ul id="menu-tree">
		<li class="one active emssqkdd">
			<s></s>EMS申请快递单
			<span></span>
		</li>
		<li class="two" style="display: block;">
			<ul class="sub-list">
				<li>
					<a href="sqkdd.do">申请快递单</a>
				</li>
				<li>
					<a href="showWdy.do">未打印快递单</a>
				</li>
				<li>
					<a href="showYdy.do">已打印快递单</a>
				</li>
			</ul>
		</li>
		<li class="one active emsxxcx">
			<s></s>送达信息
			<span></span>
		</li>
		<li class="two" style="display: block;">
			<ul class="sub-list">
				<li>
					<a href="showTdz.do">投递中</a>
				</li>
				<li>
					<a href="showYsd.do">已送达</a>
				</li>
				<li>
					<a href="showPl.do">批量导入</a>
				</li>
			</ul>
		</li>
		<li class="one active cxgn">
			<s></s>信息查询
			<span></span>
		</li>
		<li class="two" style="display: block;height: 60px;">
			<ul class="sub-list">
				<li>
					<a href="showCxtj.do">查询统计</a>
				</li>
			</ul>
		</li>
	</ul>
</div>