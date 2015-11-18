/**
 * Created by zxyu on 15-10-16.
 */
var MENU_CONTROL_HEIGHT = 60;
var menu_is_show = true;
$(function(){
        setInterval(getTime,1000);//时钟启动
        var height = document.documentElement.clientHeight;
        count_menu_height();
        $(".menu_item").click(function(){
            toggle_sub_list($(this).attr('id'));
        });
       /* $("#check_task").click(function(){
            toggle_sub_list($(this).attr('id'));
        });*/
        $(window).resize(function() {
            count_menu_height();
        });
        $(".sm_bar").click(function(){
            if(menu_is_show){
                $(".menu").hide();
                $(".content").css('width','99.4%');
                $(".sm_bar img").attr("src", "../../resources/image/util/white_arrow_right.png");
                menu_is_show = false;
            }else{
                $(".menu").show();
                $(".content").css('width','86.4%');
                $(".sm_bar img").attr("src","../../resources/image/util/white_arrow_left.png");
                menu_is_show = true;
            }
        });
        $(".menu #start_check").click(function(){
        	window.location.href="../startCheck/startCheck1.jsp";
        });
        $(".menu #check_list").click(function(){
        	window.location.href="../checkList/checkList.jsp";
        });
        $(".menu #check_result").click(function(){
        	window.location.href="../checkResult/checkResult.jsp";
        });
        $(".menu #file_check").click(function(){
        	window.location.href="../checkConfig/fileCheck.jsp";
        });
        $(".menu #dossier_check").click(function(){
        	window.location.href="../checkConfig/fileCheck.jsp";
        });
        $(".menu #trial_check").click(function(){
        	window.location.href="../checkConfig/fileCheck.jsp";
        });
        $(".menu #check_weight").click(function(){
        	window.location.href="../checkConfig/checkWeight.jsp";
        });
        $(".menu #graph1").click(function(){
        	window.location.href="../checkAnalyse/checkGraph.jsp";
        });
        $(".menu #graph2").click(function(){
        	window.location.href="../checkAnalyse/checkGraph.jsp";
        });
        
    }
);
function count_menu_height(){
    var height = document.documentElement.clientHeight;
    $(".menu").css("min-height",(height-114)+"px");
    $(".menu").css("height",($(".content").height())+"px");
    $(".menu_control").css("min-height",(height-114)+"px");
    $(".menu_control").css("height",($(".content").height())+"px");
    $(".menu_control .sm_bar").css("margin-top",(height-114-60)/2+"px");
}
function toggle_sub_list(id){
    $("[data-for = '"+id+"']").slideToggle(300);
    if($("#"+id+" .menu_icon_right").attr('data-show') == 'no'){
        $("#"+id+" .menu_icon_right").attr('data-show','yes');
    }else{
        $("#"+id+" .menu_icon_right").attr('data-show','no');
    }
}
/**
 * 时钟
 */
function getTime(){
    var mydate = new Date();
    var year = mydate.getFullYear(); //获取完整的年份(4位,1970-????)
    var month =  mydate.getMonth(); //获取当前月份(0-11,0代表1月)
    var day = mydate.getDate(); //获取当前日(1-31)
    var weekday = mydate.getDay(); //获取当前星期X(0-6,0代表星期天)
    var hour = mydate.getHours(); //获取当前小时数(0-23)
    var minute = mydate.getMinutes(); //获取当前分钟数(0-59)
    var second = mydate.getSeconds(); //获取当前秒数(0-59)
    mydate.toLocaleString( ); //获取日期与时间
    $(".date").html(year+"年"+p(month)+"月"+p(day)+"日");
    $(".weekday").html("星期"+getWeekDay(weekday));
    $(".time").html(p(hour)+"时"+p(minute)+"分"+p(second)+"秒");
}

function getWeekDay(i){
    switch (i){
        case 0 :
            return '天';
        case 1 :
            return '一';
        case 2 :
            return '二';
        case 3 :
            return '三';
        case 4 :
            return '四';
        case 5 :
            return '五';
        case 6 :
            return '六';
    }
}
function p(s) {
    return s < 10 ? '0' + s: s;
}

