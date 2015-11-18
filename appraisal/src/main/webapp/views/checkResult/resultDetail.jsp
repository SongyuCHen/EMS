<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
	<%@ include  file="../template/head.jsp"%>
    <style type="text/css">
        .search{
            margin: 0 15px;
        }
        .search_body{
            margin: 25px 45px;
        }
        .search_body .form-group{
            margin: 0 10px;
        }
        tr:hover{
            background-color: #ccc !important;
            cursor: pointer;
        }
        .tab span{
        	padding:10px 10px;
        	border:1px solid rgb(0,84,157);
        	margin:0;
        	width:120px;
        	display:inline-block;
        	text-align: center;
        	margin-left: -5px;
        }
        .tab .nav{
        	background-color: rgb(0,84,157);
        	color: white;
        }
        .tab span:hover{
        	background-color: rgb(0,84,157);
        	color: white;
        	cursor: pointer;
        }
        .detail_data span{
        	display: block;
        	width: 600px;
        	margin-left: 80px;
        	padding:8px;
        	border:1px solid rgb(0,84,157);
        	height:40px;
        	margin-bottom:15px;
        	box-shadow: 3px 3px 10px rgb(0,84,157);
        }
        .total_score{
        	margin-top:40px;
        }
        .detail_data a{
        	margin:15px 0;
        	display: inline-block;
        }
    </style>
</head>
<body>
<%@ include  file="../template/title.jsp"%>
<%@ include  file="../template/menu.jsp"%>
<div class="menu_control">
    <div class="sm_bar">
        <img src="../../resources/image/util/white_arrow_left.png">
    </div>
</div>
<div class="content">
    <div class="sub_title">
        <img src="../../resources/image/subTitle/sub_title.png" height="22" width="22">
        <div class="location" ng-controller="subTitleCtrl">
            <span>当前位置:</span>
            <span ng-repeat="span in spans"  ng-bind-html="span.name|trustHtml"></span>
        </div>
    </div>
    <div class="search" id="search_require" ng-controller="contentCtrl"> 
        <div style="font-size: 16px;width: 100%;text-align: center;margin-top: 43px"><strong>(2015)年第5次评查</strong></div>
        <hr style="border-top:1px solid rgb(156,156,156)">
        <div class="detail_body">
            <div class="tab">
            	<span class="nav" data-id="trial_process">审判流程评查</span>
            	<span data-id="dossier_check">卷宗评查</span>
            	<span data-id="file_check">文书评查</span>
            	<span data-id="trial_check">庭审评查</span>
            </div>
        </div><!-- detail_body -->
        <div class="detail_data" ng-repeat="c in content" id="{{c.id}}" style="display: none" >
        	<a href="#">电子档案链接</a>
        	<span ng-repeat="i in c.item">{{$index+1}}. {{i.name}}({{i.score}}分)</span>
           	<span class="total_score">总体得分：{{c.total}}分</span>
        </div>
    </div><!-- search -->
</div><!-- content -->

<script type="text/javascript" src="../../resources/js/checkResult/resultDetail.js"></script>
<%@ include  file="../template/footer.jsp"%>