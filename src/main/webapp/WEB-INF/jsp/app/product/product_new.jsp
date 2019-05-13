<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
    <head lang="en">
        <meta charset="UTF-8">
        <title>产品展示</title>
        <meta name="keywords" content=""/>
        <meta name="description" content=""/>
        <meta name="renderer" content="webkit">
        <meta http-equiv="x-ua-compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
        <link rel="stylesheet" href="<%=path%>/assets/css/animate.min.css">
		<link rel="stylesheet" href="<%=path%>/assets/css/idangerous.swiper.css"/>
		<link rel="stylesheet" href="<%=path%>/assets/css/common.css"/>
		<link rel="stylesheet" href="<%=path%>/assets/css/league.master.css"/>
		<link rel="stylesheet" type="text/css" href="<%=path%>/assets/css/jquery.easy_slides.css"/>
		<script type="text/javascript" src="<%=path%>/assets/js/jquery-1.10.2.min.js"></script>
		<script type="text/javascript" src="<%=path%>/assets/js/wow.min.js"></script>
		<script type="text/javascript" src="<%=path%>/assets/js/idangerous.swiper.min.js"></script>
		<script type="text/javascript" src='<%=path%>/assets/js/scroll.js'></script>
		<script type="text/javascript" src='<%=path%>/assets/js/common.js'></script>
		<script src="<%=path%>/assets/js/jquery.easy_slides.js" type="text/javascript" charset="utf-8"></script>
<!--[if lte IE 9]>
    <!--<script type="text/javascript" src='/assets/web/js/vendor/html5.js'></script>-->
    <!--<script type="text/javascript" src="/assets/web/js/vendor/respond.min.js"></script>-->
    <![endif]-->
    
    <style type="text/css">
    	.product_slider {
		    padding: 0px 0 100px 0;
		    overflow: hidden;
		    min-height: 450px;
		}
    </style>
</head>
<body>
    <!-- 头部 -->
    <div id="head">
		<jsp:include page="/web/index/head.do"/>
	</div>
    	
    <!-- 热销产品 -->
    <article class="hot-product">
        <div class="header">
            <div class="wrapper limitWidth-percentWidth">
                <span></span>
                <p>
                    <a href="<%=path%>/web/index/home.do">首页</a>
                    ><a href="javascript:;">产品介绍</a>
                </p>
                <div>
                    <h4>产品展示</h4>
                    <h5></h5>
                </div>
            </div>
            <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
        </div>
        
        <div class="product_slider limitWidth-percentWidth">
        	<div class="slider slider_one_big_2">
		        <%--<div>
		        	<img src="<%=path%>/assets/imgs/team/lm/lm_jxrlm.jpg"/>
		        	<div class="mask"><p>凉面</p></div>
		        </div>
		        <div>
		        	<img src="<%=path%>/assets/imgs/team/sl/nrsl.jpg"/>
		        	<div class="mask"><p>凉面</p></div>
		        </div>
		        <div>
		        	<img src="<%=path%>/assets/imgs/team/yl/yl_cjwtm.jpg"/>
		        	<div class="mask"><p>凉面</p></div>
		        </div>
		        <div>
		        	<img src="<%=path%>/assets/imgs/team/zlf/zlf_jxrzlf.jpg"/>
		        	<div class="mask"><p>凉面</p></div>
		        </div>
		        <div>
		        	<img src="<%=path%>/assets/imgs/team/ztj/ztj_jrnr.jpg"/>
		        	<div class="mask"><p>凉面</p></div>
		        </div>
		        <div>
		        	<img src="<%=path%>/assets/imgs/team/lm/lm_myzlm.jpg"/>
		        	<div class="mask"><p>凉面</p></div>
		        </div>
		        <div>
		        	<img src="<%=path%>/assets/imgs/team/sl/sl_jxrsl.jpg"/>
		        	<div class="mask"><p>凉面</p></div>
		        </div>
		        <div>
		        	<img src="<%=path%>/assets/imgs/team/yl/yl_hlqd.jpg"/>
		        	<div class="mask"><p>凉面</p></div>
		        </div>
		        <div>
		        	<img src="<%=path%>/assets/imgs/team/ztj/ztj_jxr.jpg"/>
		        	<div class="mask"><p>凉面</p></div>
		        </div>--%>

				<c:forEach items="${product}" var="p">
					<div>
						<img src="${p.image}"/>
						<div class="mask"><p>${p.name}</p></div>
					</div>
				</c:forEach>

		        <div class="next_button" style="    left: 144% !important;"></div>
		    	<div class="prev_button" style="    left: -44% !important;"></div>
		    </div>
		    
        </div>
        
        <input type="hidden" id="tid" value="13">
        <img src="<%=path%>/assets/imgs/league/bg-line.png" class="left">
        <img src="<%=path%>/assets/imgs/detail/bg-right.png" class="right">
    </article>
    <div class="pop-up">
        <img src="<%=path%>/assets/imgs/index/ewm-01.png">
    </div>
	<div id="foot">
		<jsp:include page="/WEB-INF/jsp/app/foot.jsp"/>
	</div>
</body>
<script type="text/javascript">
    var stop = true;
    //触发开关，防止多次调用事件
    var page = 1;
    var tid = $('#tid').val();
    
    $(function(){
		$('#head').load('head.html');
		$('#foot').load('foot.html');
		
		$('.slider_one_big_2').EasySlides({
            'autoplay': false,
            'stepbystep': true,
            'show': 5,
            'loop': true
       	});
       
       	
	})

</script>
</html>
