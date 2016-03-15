/* 
 * cookie operation
 * $.i.cookie(key), get cookie
 * $.i.cookie(key,null), del cookie
 * $.i.cookie(key,value,[days]), set cookie; del cookie when close browser if don't give days
 */
$.i = {
    cookie:function(key,value,days) {
        if (value===undefined){ // give key only, get cookie
            var c=document.cookie.split('; ');
            for(var i=0,k;k=c[i]&&c[i].split('=');i++) {
                if (decodeURIComponent(k[0])===key) {
                    return decodeURIComponent(k[1]);
                }
            }
        }else{ // give key and value
            if(value===null){ // value is null, del cookie
                document.cookie=encodeURIComponent(key)+'=; expires=Thu, 01 Jan 1970 00:00:00 UTC';
            }else{ // value isn't null, set cookie
                var e='';
                if (days!== undefined) {
                    var d=new Date();
                    d.setTime(d.getTime()+days*86400000);
                    e='; expires='+d.toUTCString();
                }
                document.cookie=encodeURIComponent(key)+'='+encodeURIComponent(value)+e;
            }
        }
    }
}
$(function(){
	$('#login').click(function(e){
		e.preventDefault();
		if($('#reme').attr('checked')=='checked'){		
			$.i.cookie('yhm',$('#yhm').val(),5*365);
			$.i.cookie('mm',$('#mm').val(),5*365);			
		}else{
			$.i.cookie('yhm','',5*365);
			$.i.cookie('mm','',5*365);
		}		
		$('#login_form')[0].submit();
	});
	$('#reset').click(function(e){
		e.preventDefault();
		$('#login_form')[0].reset();
	});
	$('#mm').keydown(function(e){
    	if(e.keyCode==13){
    		$('#login').click();
    	}		
	});
    //获取cookie
	if($.i.cookie('yhm')!="undefined"){
		$('#yhm').val($.i.cookie('yhm'));
		$('#mm').val($.i.cookie('mm'));	
	}
	
	//点击选中
	$('input[type="text"],input[type="password"]').click(function(e){
		$(this).select();
	});	
});