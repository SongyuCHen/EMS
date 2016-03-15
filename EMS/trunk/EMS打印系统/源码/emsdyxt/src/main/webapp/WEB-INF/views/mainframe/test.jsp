<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>送达管理系统</title>
	<link rel="stylesheet" type="text/css" href="resources/css/jquery-ui-1.8.21.custom.css">
	<link rel="stylesheet" type="text/css" href="resources/css/main.css">
</head>
<body>
	<div id="header"></div>
	<div id="nav">
		<ul id="info">
			<li><span class="yh"></span>当前用户：张红军 </li>
			<li><span class="bm"></span>部门：民一庭</li>
			<li><span class="time"></span>当前时间：2015年01月20日  星期二  11:25</li>
		</ul>
		<div id="link">
			<a href="">修改密码</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;<a href="">退出登录</a>
		</div>
	</div>
	<div id="main">
		<div id="left">
			<h2 id="menu-title">管理菜单</h2>
			<ul id="menu-tree">
				<li class="one active emssqkdd"><s></s>EMS申请快递单<span></span></li>
				<li class="two" style="display:block;">
					<ul class="sub-list">
						<li class="active">申请快递单</li>
						<li>测试</li>
					</ul>
				</li>
				<li class="one emsxxcx"><s></s>EMS信息查询<span></span></li>
				<li class="two">
					<ul class="sub-list">
						<li>申请快递单</li>
						<li>测试</li>
					</ul>
				</li>
				<li class="one cxgn"><s></s>查询功能<span></span></li>
				<li class="two">
					<ul class="sub-list">
						<li>申请快递单</li>
						<li>测试</li>
					</ul>
				</li>
			</ul>
		</div>
		<div id="right">
			<h2 id="position"><span id="p-title">申请打印快递单</span> >> <span id="p-sub-title">案件信息查询</span></h2>
			<div id="content">
				<div id="ajxxcx" style="display:none;">
					<h3 class="c-title">案件信息查询</h3>
					<form action="" class="table-wrapper">
						<table class="T-table">
							<tbody>
								<tr>
									<th>部门名称：</th><td><input name="bmmc"></td>
									<th>承办人：</th><td><input name="cbr"></td>
									<th>案号：</th><td><input name="ah" style="width:220px;"></td>
								</tr>
								<tr>
									<th>案件名称：</th><td><input name="ajmc"></td>
									<th>起始日期：</th><td><input name="qsrq"></td>
									<th>结束日期：</th><td><input name="jsrq"><button style="margin-left:26px;">搜索</button></td>
								</tr>
							</tbody>
						</table>
					</form>
					<h3 class="c-title">查询结果</h3>
					<div class="table-wrapper" style="max-height: 192px;">
						<table class="R-table">
							<thead>
								<tr>
									<th>选择</th>
									<th>案号</th>
									<th>当事人类型</th>
									<th>当事人名称</th>
									<th>地址</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><input type="checkbox"></td>
									<td>（2015）民初字第0001号</td>
									<td>个人</td>
									<td></td>
									<td></td>
								</tr>
								<tr>
									<td><input type="checkbox"></td>
									<td>（2015）民初字第0001号</td>
									<td>个人</td>
									<td></td>
									<td></td>
								</tr>
								<tr>
									<td><input type="checkbox"></td>
									<td>（2015）民初字第0001号</td>
									<td>个人</td>
									<td></td>
									<td></td>
								</tr>
								<tr>
									<td><input type="checkbox"></td>
									<td>（2015）民初字第0001号</td>
									<td>个人</td>
									<td></td>
									<td></td>
								</tr>
								<tr>
									<td><input type="checkbox"></td>
									<td>（2015）民初字第0001号</td>
									<td>个人</td>
									<td></td>
									<td></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>

				<div id="wdykddcx" style="display:none;">
					<h3 class="c-title">请输入查询条件</h3>
					<form action="" class="table-wrapper">
						<table class="T-table">
							<tbody>
								<tr>
									<th>收件人姓名：</th><td><input name="sjrxm"></td>
									<th>手机号：</th><td><input name="phone"></td>
									<th>案号：</th><td><input name="ah" style="width:150px;margin-right:10px;"><button >搜索</button></td>
								</tr>
							</tbody>
						</table>
					</form>
					<h3 class="c-title">未打印快递单列表</h3>
					<div class="table-wrapper" style="max-height: 220px;">
						<table class="R-table">
							<thead>
								<tr>
									<th>选择</th>
									<th>案号</th>
									<th>收件人姓名</th>
									<th>移动电话</th>
									<th>住宅电话</th>
									<th>办公电话</th>
									<th>单位名称</th>
									<th>地址</th>
									<th>操作人</th>
									<th>是否正在打印</th>
									<th>是否打印</th>
									<th>查看</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><input type="checkbox"></td>
									<td>（2015）民初字第0001号</td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td><a href="#" target="_blank">详细</a></td>
								</tr>
								<tr>
									<td><input type="checkbox"></td>
									<td>（2015）民初字第0001号</td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td><a href="#" target="_blank">详细</a></td>
								</tr>
								<tr>
									<td><input type="checkbox"></td>
									<td>（2015）民初字第0001号</td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td><a href="#" target="_blank">详细</a></td>
								</tr>
								<tr>
									<td><input type="checkbox"></td>
									<td>（2015）民初字第0001号</td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td><a href="#" target="_blank">详细</a></td>
								</tr>
								<tr>
									<td><input type="checkbox"></td>
									<td>（2015）民初字第0001号</td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td><a href="#" target="_blank">详细</a></td>
								</tr>
								<tr>
									<td><input type="checkbox"></td>
									<td>（2015）民初字第0001号</td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td><a href="#" target="_blank">详细</a></td>
								</tr>
								<tr>
									<td><input type="checkbox"></td>
									<td>（2015）民初字第0001号</td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td><a href="#" target="_blank">详细</a></td>
								</tr>
								<tr>
									<td><input type="checkbox"></td>
									<td>（2015）民初字第0001号</td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td><a href="#" target="_blank">详细</a></td>
								</tr>
								<tr>
									<td><input type="checkbox"></td>
									<td>（2015）民初字第0001号</td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td><a href="#" target="_blank">详细</a></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>

				<div id="tjdykdd">
					<div class="btn-group">
						<button class="ajxxcx">案件信息查询</button>
						<button>添加</button>
						<button>提交</button>
					</div>
					<h3 class="c-title">申请打印EMS快递单</h3>
					<form action="" class="table-wrapper">
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
													<td><input type="checkbox" name="slajtzs" id="slajtzs"><label for="slajtzs">受理案件通知书</label></td>
													<td><input type="checkbox" name="cttzs" id="cttzs"><label for="cttzs">出庭通知书</label></td>
													<td><input type="checkbox" name="ystzs" id="ystzs"><label for="ystzs">应诉通知书</label></td>
													<td><input type="checkbox" name="mscds" id="mscds"><label for="mscds">民事裁定书</label></td>
													<td><input type="checkbox" name="qshfszfb" id="qshfszfb"><label for="qshfszfb">起诉或发诉状副本</label></td>
													<td></td>
												</tr>
												<tr>
													<td><input type="checkbox" name="mscjs" id="mscjs"><label for="mscjs">民事判决书</label></td>
													<td><input type="checkbox" name="dbzfb" id="dbzfb"><label for="dbzfb">答辩状副本</label></td>
													<td><input type="checkbox" name="mstjs" id="mstjs"><label for="mstjs">民事调解书</label></td>
													<td><input type="checkbox" name="jztzs" id="jztzs"><label for="jztzs">举证通知书</label></td>
													<td><input type="checkbox" name="cp" id="cp"><label for="cp">传票</label></td>
													<td><input type="checkbox" name="qt" id="qt"><label for="qt">其他</label></td>
												</tr>
											</tbody>
										</table>
									</td>
								</tr>
								<tr>
									<th>寄件人电话：</th><td><input name="jjrdh" type="text"></td>
									<th>寄件人姓名：</th><td><input name="jjrxm" type="text"></td>
									<th></th><td></td>
								</tr>
							</tbody>
						</table>
						<div class="btn-group" style="text-align:center;margin-top:5px;">
							<button>保存</button>
							<button style="margin-left:25px;">删除</button>
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