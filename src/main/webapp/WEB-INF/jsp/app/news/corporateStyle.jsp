<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import="com.springmvc.commons.util.DateUtil" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
    <head lang="en">
        <meta charset="UTF-8">
        <title>企业风采</title>
        <meta name="keywords" content=""/>
        <meta name="description" content=""/>
        <meta name="renderer" content="webkit">
        <meta http-equiv="x-ua-compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
        <link rel="stylesheet" href="<%=path%>/assets/css/animate.min.css">
		<link rel="stylesheet" href="<%=path%>/assets/css/idangerous.swiper.css"/>
		<link rel="stylesheet" href="<%=path%>/assets/css/bootstrap.min.css"/>
		<link rel="stylesheet" href="<%=path%>/assets/css/common.css"/>
		<link rel="stylesheet" href="<%=path%>/assets/css/league.master.css"/>
		<link rel="stylesheet" href="<%=path%>/assets/css/jquery.easy_slides.css"/>
		<script type="text/javascript" src="<%=path%>/assets/js/jquery-1.10.2.min.js"></script>
		<script type="text/javascript" src="<%=path%>/assets/js/wow.min.js"></script>
		<script type="text/javascript" src="<%=path%>/assets/js/idangerous.swiper.min.js"></script>
		<script type="text/javascript" src="<%=path%>/assets/js/bootstrap.min.js"></script>
		<script type="text/javascript" src='<%=path%>/assets/js/scroll.js'></script>
		<script type="text/javascript" src='<%=path%>/assets/js/common.js'></script>
		<script type="text/javascript" src='<%=path%>/assets/js/jquery.easy_slides.js'></script>

<!--[if lte IE 9]>
   <!-- <script type="text/javascript" src='/assets/web/js/vendor/html5.js'></script>
    <script type="text/javascript" src="/assets/web/js/vendor/respond.min.js"></script>-->
    <![endif]-->
</head>
<body style="background: #f8f8f8">
    <!-- 头部 -->
    <div id="head">
        <jsp:include page="/web/index/head.do"/>
    </div>
    <!-- 加入我们 -->
    <article class="other">
        <div class="header">
            <div class="wrapper limitWidth-percentWidth">
                <span></span>
                <p>
                    <a href="<%=path%>/web/index/home.do">首页</a>
                    ><a href="javascript:;">新闻中心</a>
                </p>
                <div>
                    <h4>企业风采</h4>
                    <%--<h5>Branch Style</h5>--%>
                </div>
            </div>
            <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
        </div>
        <section class="limitWidth-percentWidth">
            <div class="wrapp-c clearfix wow fadeInUp animated">
               <%-- <div class="inner-l">
                    <p>特聘专业室内空间设计师</p>
                    <h5>打造独具匠心的超能鹿战队风格</h5>
                </div>
                <div class="inner-r">
                    <img src="<%=path%>/assets/imgs/other/qyfc.png" alt="">
                </div>--%>

                   <div class="slider slider_circle_10">
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/1.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/4%20(2).jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/6.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/7.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/5%20(2).jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/3.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/b.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/c.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/f.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/g.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/h.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/i.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/j.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/k.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/l.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/m.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/n.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/o.jpg" alt="" />
                       </div>
                       <div>
                           <img src="<%=path%>/assets/imgs/slider_qyfc/p.jpg" alt="" />
                       </div>
                       <div class="next_button"></div>
                       <div class="prev_button"></div>
                   </div>

            </div>
            <img src="<%=path%>/assets/imgs/franchisees/title-r.png">
        </section>
        <img src="<%=path%>/assets/imgs/other/bottom-bg.png" class="bottom-bg">
        <img src="<%=path%>/assets/imgs/league/bg-line.png" class="left">
        <img src="<%=path%>/assets/imgs/detail/bg-right.png" class="right">
    </article>
    <div class="pop-up">
        <img src="<%=path%>/assets/imgs/index/ewm-01.png">
    </div>
 	<div id="foot">
        <jsp:include page="/WEB-INF/jsp/app/foot.jsp"/>
    </div>
    
    <script type="text/javascript">
        $('.slider_circle_10').EasySlides({
            'autoplay': false,
            'show': 13
        })
    </script>
</body>
</html>
