$(function(){
	

	// 首页效果
	$('.down').on('click',function(){
		$('body').scrollTop(1000);
	});
	// 加盟店切换
	$('.store .wrap .inner-r>ul li').each(function(index){
		var hrefs = '/assets/imgs/index/red.png';
		var hrefs1 = '/assets/imgs/index/pront.png';
		$(this).hover(function(){
			$('.inner-center').eq(index).show().siblings().filter('.inner-center').hide();
			$('.store .wrap .inner-r>ul li').find('img').attr('src',hrefs1);
			$(this).find('img').attr('src',hrefs);
		});
	})
	// 播放视频
    $('.play').on('click',function(){
        $('.video').show();
    });
    $('.play').on('click touchstart',function(event){
        event.stopPropagation();
    });
    $(document).on('click touchstart',function () {
        $('.video').hide();
    });

    // 弹出二维码
    /*$('.wechat').on('click',function(){
        $('.pop-up').show();
    });
    $('.wechat').on('click touchstart',function(event){
        event.stopPropagation();
    });
    $(document).on('click touchstart',function () {
        $('.pop-up').hide();
    });*/

    // 加入我们
    $('.join-us section .wrap-center .content>div').on('click', function(event) {
		if ($(this).hasClass('active')) {
			$(this).removeClass('active');
		}else{
			$('.join-us section .wrap-center .content .active').removeClass('active');
			$(this).addClass('active');
		}
	});

	
});
