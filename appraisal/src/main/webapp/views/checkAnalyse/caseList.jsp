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
<div class="content" ng-controller="contentCtrl">
    <div class="sub_title">
        <img src="../../resources/image/subTitle/sub_title.png" height="22" width="22">
        <div class="location" ng-controller="subTitleCtrl">
            <span>当前位置:</span>
            <span ng-repeat="span in spans"  ng-bind-html="span.name|trustHtml"></span>
        </div>
    </div>
    <div class="search" id="search_require">
		<div style="font-size: 16px;width: 100%;text-align: center;margin-top: 43px"><strong>{{stitle}}</strong></div>
        <hr style="border-top:1px solid rgb(156,156,156)">
    </div><!-- search -->
    <div class="search">
        <div class="result">
            <div class="teble">
                <table class="table table-striped table-hover table-bordered">
                    <thead>
                    <tr>
                    	<th><input type='checkbox' style='margin-right: 10px' ng-model='selectAll'>全选</th>
                        <th ng-repeat="s in title" ng-bind-html="s.name|trustHtml"></th>
                    </tr>
                    </thead>
                    <tbody >
                    <tr ng-repeat="c in content">
                        <td><input type="checkbox" ng-checked="selectAll"></td>
                        <td>{{c.t2}}</td>
                        <td class="no-left">{{c.t3}}</td>
                        <td>{{c.t4}}</td>
                        <td>{{c.t5}}</td>
                        <td>{{c.t6}}</td>
                        <td>{{c.t7}}</td>
                        <td>{{c.t8}}</td>
                        <td>{{c.t9}}</td>
                    </tr> 
                    </tbody>
                </table>
                <div class="table_footer">
                    <div class="total">
                        <span>共计</span><span> 2 </span><span>条，</span>
                        <span>每页显示</span><span> 10 </span><span>条，</span>
                        <span>共</span><span> 2 </span><span>页。</span>
                    </div>
                    <div class="output">
                        <span>列表：</span>
                        <button type="button" class="btn btn-primary">抽查</button>
                    </div>
                    <div class="change_page">
                        <span> 首页 </span>
                        <span> 上一页 </span>
                        <span> 第</span>
                        <select class="form-control">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                        <span>页 </span>
                        <span> 下一页 </span>
                        <span> 尾页 </span>
                    </div>
                </div>
            </div><!-- table -->
        </div>
    </div>

</div>
<script type="text/javascript" src="../../resources/js/checkAnalyse/caseList.js"></script>
<%@ include  file="../template/footer.jsp"%>