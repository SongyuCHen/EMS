<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>送达管理系统</title>
		<link rel="stylesheet" type="text/css" href="resources/css/main.css">
		<link rel="stylesheet" type="text/css"
			href="resources/css/preview.css">
	</head>
	<body>
		<div id="header"></div>
		<%@include file="../inc/header.jsp"%>
		<div style="width: 1060px;">
			<div>
				<h3 class="c-title">
					待打印快递单预览
					<button class="printBtn" style="margin-left: 546px;">
						打印
					</button>
				</h3>
				<div class="print-area">
				 
					<c:forEach items="${ddyList}" var="kdModel">
						<div class="ems-area" data-kdid="${kdModel.kdid}" data-ah="${kdModel.ah}">
							<div class="ah1">
							</div>
							<div class="ah2">
							</div>
							<div class="ah3">
							</div>
							<div class="sjrxm">
								${kdModel.sjrxm}
							</div>
							<div class="yddh">
								${kdModel.yddh}
							</div>
							<div class="zzdh">
								${kdModel.zzdh}
							</div>
							<div class="bgdh">
								${kdModel.bgdh}
							</div>
							<div class="dwmc">
								${kdModel.dwmc}
							</div>
							<div class="sjrdz">
								${kdModel.sjrdz}
							</div>
							<div class="yzbm">
								${kdModel.yzbm}
							</div>
							<div class="jjnr-slajtzs">
								<c:if test="${kdModel.jjnr%2 == 0 }">√</c:if>
							</div>
							<div class="jjnr-cttzs">
								<c:if test="${kdModel.jjnr%3 == 0 }">√</c:if>
							</div>
							<div class="jjnr-ystzs">
								<c:if test="${kdModel.jjnr%5 == 0 }">√</c:if>
							</div>
							<div class="jjnr-mscds">
								<c:if test="${kdModel.jjnr%7 == 0 }">√</c:if>
							</div>
							<div class="jjnr-qshfszfb">
								<c:if test="${kdModel.jjnr%11 == 0 }">√</c:if>
							</div>
							<div class="jjnr-mscjs">
								<c:if test="${kdModel.jjnr%13 == 0 }">√</c:if>
							</div>
							<div class="jjnr-dbzfb">
								<c:if test="${kdModel.jjnr%17 == 0 }">√</c:if>
							</div>
							<div class="jjnr-mstjs">
								<c:if test="${kdModel.jjnr%19 == 0 }">√</c:if>
							</div>
							<div class="jjnr-jztzs">
								<c:if test="${kdModel.jjnr%23 == 0 }">√</c:if>
							</div>
							<div class="jjnr-qt">
								<c:if test="${kdModel.jjnr%31 == 0 }">√</c:if>
							</div>
							<div class="jjnr-cp">
								<c:if test="${kdModel.jjnr%29 == 0 }">√</c:if>
							</div>
							<div class="jjrdh">
								${kdModel.jjrdh}
							</div>
							<div class="wsmc">
								${kdModel.wsmc}
							</div>
							<div class="fymc">
								${fyModel.fymc}
							</div>
							<div class="fyyb">
								${fyModel.fyyb}
							</div>
						</div>
					</c:forEach>
					
				</div>
			</div>

		</div>
		<script src="resources/js/jquery-1.11.2.min.js"></script>
		<script type="text/javascript" src="resources/js/jquery.PrintArea.js"></script>
		<script src="resources/js/common.js"></script>
		<script src="resources/js/preview.js"></script>
	</body>
</html>