$(document).ready(function () {
    $(window).scroll(function(){
        if($(window).scrollTop()!=0){
            $('.header-r>a').slideUp();
        }else{
            $('.header-r>a').slideDown();
        }
    });
 //    if ((navigator.userAgent.indexOf('MSIE') >= 0) 
	//     && (navigator.userAgent.indexOf('Opera') < 0)){
	//     $("script[src='/assets/web/js/vendor/wow/wow.min.js']").remove();
	// 	$("link[href='/assets/web/js/vendor/wow/animate.min.css']").remove();
	// }
    var wow = new WOW({
	    boxClass: 'wow',
	    animateClass: 'animated',
	    offset: 0,
	    mobile: true,
	    live: true
	});
	wow.init();

});