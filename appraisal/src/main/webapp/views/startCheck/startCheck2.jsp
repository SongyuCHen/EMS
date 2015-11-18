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
        <div class="location">
            <span>当前位置:</span>
            <span>首页</span>
            <span>&raquo;</span>
            <span>评查任务</span>
            <span>&raquo;</span>
            <span>发起评查</span>
        </div>
    </div>
    <div class="process_bar">
        <img src="../../resources/image/paocessBar/bar2.png">
    </div>
    <div class="search">
        <div class="search_title">
            <span>新建任务</span>
        </div>
        <div class="newtask_body">
            <form class="form-inline">
                <div class="newtask_line">
                    <div class="form-group">
                        <label for="taskname">任务名称：</label>
                        <input type="text" class="form-control" id="taskname" placeholder="（2015）年第5次评查" style="width: 300px">
                    </div>
                </div>
                <div class="newtask_line">
                    <div class="form-group">
                        <label for="inlineCheckbox1">评查选项：</label>
                        <label class="checkbox-inline">
                            <input type="checkbox" id="inlineCheckbox1" value="option1"> 审判流程评查
                        </label>
                        <label class="checkbox-inline">
                            <input type="checkbox" id="inlineCheckbox2" value="option2"> 庭审评查
                        </label>
                        <label class="checkbox-inline">
                            <input type="checkbox" id="inlineCheckbox3" value="option3"> 文书评查
                        </label>
                        <label class="checkbox-inline">
                            <input type="checkbox" id="inlineCheckbox4" value="option1"> 卷宗装订评查
                        </label>
                        <label class="checkbox-inline">
                            <input type="checkbox" id="inlineCheckbox5" value="option2"> 定罪量刑
                        </label>
                        <label class="checkbox-inline">
                            <input type="checkbox" id="inlineCheckbox6" value="option3"> 社会效果
                        </label>
                    </div>
                </div>
                <div class="newtask_line">
                    <div class="form-group">
                        <label for="checkbasis">评查依据：</label>
                        <input type="text" class="form-control" id="checkbasis" style="width: 600px">
                    </div>
                </div>
                <div class="newtask_line">
                    <div class="form-group">
                        <label for="search_require">案卷筛选条件：</label>
                        <input type="text" class="form-control" id="search_require" style="width: 300px" placeholder="2014年至今的所有的民事二审案件">
                    </div>
                </div>
                <div class="newtask_line">
                    <label for="end_date1">评查开始时间:</label>
                    <input type="text" class="form-control" id="end_date1" style="width: 90px !important;">
                    <label for="end_date2" class="spe_label">至</label>
                    <input type="text" class="form-control" id="end_date2" style="width: 90px !important;">
                </div>
                <div class="buttons">
                    <button type="button" class="btn btn-default">取消</button>
                    <button type="button" class="btn btn-default">上一步</button>
                    <button type="button" class="btn btn-primary">下一步</button>
                </div>
            </form>
        </div><!-- search_body -->
    </div><!-- search -->


</div>
<script type="text/javascript" src="../../resources/js/startCheck/startCheck.js"></script>
<%@ include  file="../template/footer.jsp"%>