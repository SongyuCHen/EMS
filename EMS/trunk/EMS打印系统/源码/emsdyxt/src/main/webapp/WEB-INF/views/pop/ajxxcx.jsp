<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="ajxxcx">
	<h3 class="c-title">案件信息查询</h3>
	<div class="table-wrapper ajcxtj">
		<table class="T-table">
			<tbody>
				<tr>
					<th>部门名称：</th><td>
						<select name="bmmc">
							<option></option>
							<c:forEach items="${bmxx}" var="bm">
								<option value="${bm.bmbh }">${bm.bmmc }</option>
							</c:forEach>
						</select>
					</td>
					<th>承办人：</th><td><input name="cbr"></td>
					<th>案号：</th><td><input name="ah" style="width:220px;"></td>
				</tr>
				<tr>
					<th>案件名称：</th><td><input name="ajmc"></td>
					<th>起始日期：</th><td><input name="qsrq" value="${start}" class="datepicker"></td>
					<th>结束日期：</th><td><input name="jsrq" value="${end}" class="datepicker"><button class="main ajxxsearch" style="margin-left:26px;">搜索</button></td>
				</tr>
			</tbody>
		</table>
	</div>
	<h3 class="c-title">查询结果</h3>
	<div class="table-wrapper ajcxjg" style="max-height: 192px;">
		<table class="R-table">
			<thead>
				<tr>
					<th>选择</th>
					<th>案号</th>
					<th>案件名称</th>
					<th>办案审判庭</th>
				</tr>
			</thead>
			<tbody>
				<tr><td colspan="4">没有案件信息！</td></tr>
			</tbody>
		</table>
	</div>
</div>

<script src="resources/js/jquery-ui-timepicker-addon.js"></script>
<script src="resources/js/jquery-ui-timepicker-zh-CN.js"></script>
<script src="resources/js/ajxxcx.js"></script>