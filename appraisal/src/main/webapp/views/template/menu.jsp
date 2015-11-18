<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!-- 左侧菜单 -->
<div class="menu">
    <div class="date_time">
        <div class="date"></div>
        <div class="weekday"></div>
        <div class="time"></div>
    </div>
    <hr>
    <div class="menu_item_list">
        <div class="menu_item" id="check_task">
            <span class="menu_icon_left" style="background: url('../../resources/image/menu/menu.png') no-repeat 0 -32px;"></span>
            <span><strong>评查任务</strong></span>
            <span class="menu_icon_right" data-show="no"></span>
        </div>
        <hr>
        <div class="sub_item_list" style="display: none" data-for="check_task">
            <div class="sub_item">
                <span id="start_check">发起评查</span>
                <span id="check_list">评查列表</span>
                <span id="check_result">评查结果</span>
            </div>
            <hr>
        </div>
        <div class="menu_item" id="check_config">
            <span class="menu_icon_left" style="background: url('../../resources/image/menu/menu.png') no-repeat 0 -48px;"></span>
            <span><strong>评查配置</strong></span>
            <span class="menu_icon_right" data-show="no"></span>
        </div>
        <hr>
         <div class="sub_item_list" style="display: none" data-for="check_config">
            <div class="sub_item">
                <div style="padding:6px 0 6px 33px">评查项目</div>
                <span id="file_check" data-level="second_level">——文书评查</span>
                <span id="dossier_check" data-level="second_level">——卷宗评查</span>
                <span id="trial_check" data-level="second_level">——庭审评查</span>
                <span id="check_weight">评查权重</span>
            </div>
            <hr>
        </div>
        <div class="menu_item" id="check_analyse">
            <span class="menu_icon_left" style="background: url('../../resources/image/menu/menu.png') no-repeat 0 -65px;"></span>
            <span><strong>统计分析</strong></span>
            <span class="menu_icon_right" data-show="no"></span>
        </div>
        <hr>
         <div class="sub_item_list" style="display: none" data-for="check_analyse">
            <div class="sub_item">
                <span id="graph1">汇总表一</span>
                <span id="graph2">汇总表二</span>
            </div>
            <hr>
        </div>
        <div class="menu_item">
            <span class="menu_icon_left" style="background: url('../../resources/image/menu/menu.png') no-repeat 0 -80px;"></span>
            <span><strong>系统管理</strong></span>
            <span class="menu_icon_right" data-show="no"></span>
        </div>
        <hr>
    </div>
</div>