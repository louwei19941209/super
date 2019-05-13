$(document).ready(function () {
    //首页KV轮播
    var mySwiper = new Swiper('.swiper-container',{
        loop: true,
        useCSS3Transforms : false,
        updateOnImagesReady : false,
        simulateTouch : false,
        resistance : "100%",
        autoplay : 4000
        //其他设置
    });  
    $('.prev').click(function(){
        mySwiper.swipePrev(); 
    });

    $('.next').click(function(){
        mySwiper.swipeNext(); 
    });
    var windowHeight = document.body.clientHeight-70;
    var wh=$(window).height(); //页面的高
    if ($(window).width() >768) {
        $('.setHeight').height(windowHeight);
        $('.title1').addClass('slideInLeft');
        $('.title3').addClass('slideInLeft');
        $('.title2').addClass('slideInRight');
        $('.title4').addClass('slideInRight');
        // $(window).scroll(function(){
        //     if($('.time').offset().top < $(window).scrollTop() + $(window).height() - 100){
        //         $('.intro').addClass('slideInLeft');
        //         $('.world').addClass('slideInRight');
        //     }
        //     if($('.product').offset().top < $(window).scrollTop() + $(window).height() - 0){
        //         $('.img1').addClass('fadeInUp');
        //         $('.img2').addClass('fadeInUp');
        //         $('.img3').addClass('fadeInUp');
        //         $('.img4').addClass('fadeInUp');
        //         $('.img5').addClass('fadeInUp');
        //     }
        //     if($('.store').offset().top < $(window).scrollTop() + $(window).height() - 100){
        //         $('.store .wrap .inner-l').addClass('slideInLeft');
        //         $('.store .wrap .inner-r').addClass('slideInRight');
        //     }
        //
        // });
    }
    $(window).scroll(function(){
        if($(window).scrollTop()!=0){
            $('.header-r>a').slideUp();
            $('header>div>div').css('opacity','.7');
        }else{
            $('.header-r>a').slideDown();
            $('header>div>div').css('opacity','1');
        }
    });
});