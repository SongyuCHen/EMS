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
<div class="content">
    <div class="sub_title">
        <img src="../../resources/image/subTitle/sub_title.png" height="22" width="22">
        <div class="location" ng-controller="subTitleCtrl">
            <span>当前位置:</span>
            <span ng-repeat="span in spans"  ng-bind-html="span.name|trustHtml"></span>
        </div>
    </div>
    <div class="search" id="search_require">
        <div class="search_body">
            <form class="form-inline">
                <div class="search_line">
                    <div class="form-group">
                        <label for="property">评查名称:</label>
                        <input type="text" class="form-control" id="property" placeholder="民事">
                    </div>
                    <div class="form-group">
                        <label for="process">开始时间:</label>
                        <input type="text" class="form-control" id="process" placeholder="二审">
                    </div>
                    <div class="form-group">
                        <label for="reason">结束时间:</label>
                        <input type="text" class="form-control" id="reason" placeholder="知识产权纠纷">
                    </div>
                    <button type="button" class="btn btn-primary">查询</button>
                </div>
            </form>
        </div><!-- search_body -->
    </div><!-- search -->
    <div class="search">
        <div class="result">
            <div class="teble">
                <table class="table table-striped table-hover table-bordered" ng-controller="tableCtrl">
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
                        <button type="button" class="btn btn-default">导出</button>
                        <button type="button" class="btn btn-default">打印</button>
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
<script type="text/javascript" src="../../resources/js/checkList/checkList.js"></script>
<%@ include  file="../template/footer.jsp"%>