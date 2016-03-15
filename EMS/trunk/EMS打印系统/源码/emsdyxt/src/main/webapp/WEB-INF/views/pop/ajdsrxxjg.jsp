<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="ajdsrxxjg">
	<h3 class="c-title">案件当事人信息</h3>
	<form action="kddcss.do" class="table-wrapper ajdsrxxjg" style="max-height: 192px;">
		<table class="R-table">
			<thead>
				<tr>
					<th>选择</th>
					<th>案号</th>
					<th>当事人类型</th>
					<th>当事人名称</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ajdsrxxs}" var="ajdsrxx">
					<c:if test="${ajdsrxx.dsrrs < 1 }">
						<tr>
							<td><input type="checkbox" data-id="${ajdsrxx.ajxh }"></td>
							<td class="R-td-ajmc" title="${ajdsrxx.ah }"><span>${ajdsrxx.ah }</span></td>
							<td></td>
							<td></td>
						</tr>
					</c:if>
					<c:forEach items="${ajdsrxx.dsrjbxxVOs}" var="dsrjbxxVO">
						<tr>
							<td><input type="checkbox" data-id="${ajdsrxx.ajxh },${dsrjbxxVO.dsrbh }"></td>
							<td class="R-td-ajmc" title="${ajdsrxx.ah }"><span>${ajdsrxx.ah }</span></td>
							<td>${dsrjbxxVO.dsrlx }</td>
							<td>${dsrjbxxVO.dsrmc }</td>
						</tr>
					</c:forEach>
				</c:forEach>
			</tbody>
		</table>
	</form>
</div>