$(document).on("click","li.one",function(){
	var curTwo=$(".sub-list li.active").closest("li.two");
	var curOne=curTwo.prev("li.one").eq(0);
	if(curOne[0]==this){
		return;
	}
	var $this=$(this);
	curOne.removeClass("active");
	curTwo.hide();
	$this.addClass("active");
	var nextTwo=$this.next("li.two").eq(0);
	nextTwo.animate({
		height:"toggle"
	});
	$("#p-title").html($this.text());
	nextTwo.find(".sub-list li").eq(0).trigger("click");
});
$(document).on("click",".sub-list li",function(){
	$(".sub-list li.active").removeClass("active");
	var $this=$(this);
	$this.addClass("active");
	$("#p-sub-title").html($this.text());
});

//������Ϣ��ѯ
$(document).on("click",".ajxxcx",function(){
	alert("getYOU");
});