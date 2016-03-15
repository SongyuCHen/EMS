<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${ajsm == 0 }">
<tr><td colspan="4">没有案件信息！</td></tr>
</c:if>

<c:forEach items="${ajxxs}" var="ajxx">
	<tr>
		<td><input type="checkbox" data-ajxh="${ajxx.ajxh }"></td>
		<td class="R-td-ajmc" title="${ajxx.ah }"><span>${ajxx.ah }</span></td>
		<td class="R-td-ajmc" title="${ajxx.ajmc }"><span>${ajxx.ajmc }</span></td>
		<td>${ajxx.baspt }</td>
	</tr>
</c:forEach>
