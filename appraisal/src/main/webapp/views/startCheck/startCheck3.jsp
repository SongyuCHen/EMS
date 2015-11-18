<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
	<%@ include  file="../template/head.jsp"%>
    <link rel="stylesheet" type="text/css" href="../../resources/css/startTask/startTask.css">
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
    <div class="process_bar">
        <img src="../../resources/image/paocessBar/bar3.png">
    </div>
    <div class="assign">
        <div class="assign_title">
            <span>分配任务</span>
            <input class="autosub" type="submit" value="自动">
        </div>
        <div class="assign_body" ng-controller="tableCtrl_3">
            <div class="div_parent">
                <div class="div_child">
                    <div class="sub_name">
                        <span>待分列表</span>
                    </div>
                    <div class="sub_content">
                        <form class="checklist">
                            <div class="check" ng-repeat = "x in df">
                            	<input type="checkbox" ng-checked="selectAll"><span>{{x.name}}</span>
	                        </div>                            
                        </form>
                    </div>
                </div>
                <div class="div_child">
                    <div class="sub_name">
                        <span>庭室</span>
                    </div>
                    <div class="sub_content">
                        <form class="selectlist">
                            <select class= "form-control" style="margin-top: 10px;">
                                <option value="volvo" ng-repeat = "x in courtroom">{{x.name}}</option>
                            </select>
                        </form>
                        <form class="checklist">
                            <div class="check" ng-repeat = "x in staff">
                                <input type="radio" name="people"><span>{{x.name}}</span>
                            </div>
                        </form>

                    </div>
                </div>
                <div class="forward">
                	<img src="../../resources/image/startCheck/forward.png" ng-click="allot()" style="margin-top: 111px;">
                	<span>{{}}</span>
                </div>
                <div class="div_child">
                    <div class="sub_name">
                        <span>已分列表</span>
                    </div>
                    <div class="sub_content">
                        <form class="checklist">
                            <div class="check" ng-repeat = "x in result">
                                <input type="checkbox"><span>{{x.name}}</span>
                            </div>

                        </form>
                    </div>
                </div>
            </div>
            <div class="buttons">
                <button type="button" class="btn btn-default" style="margin-right: 15px">取消</button>
                <button type="button" class="btn btn-default" style="margin-right: 15px">上一步</button>
                <button type="button" class="btn btn-primary">确定</button>
            </div>
        </div>
    </div>



</div>


<script type="text/javascript" src="../../resources/js/startCheck/startCheck.js"></script>
<%@ include  file="../template/footer.jsp"%>