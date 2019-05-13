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
        <title>${product.name}</title>
        <meta name="keywords" content=""/>
        <meta name="description" content=""/>
        <meta name="renderer" content="webkit">
        <meta http-equiv="x-ua-compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
        <link rel="stylesheet" href="<%=path%>/assets/css/idangerous.swiper.css"/>
        <link rel="stylesheet" href="<%=path%>/assets/css/common.css"/>
        <link rel="stylesheet" href="<%=path%>/assets/css/league.master.css"/>
        <script type="text/javascript" src="<%=path%>/assets/js/jquery-1.10.2.min.js"></script>
        <script type="text/javascript" src="<%=path%>/assets/js/idangerous.swiper.min.js"></script>
        <script type="text/javascript" src='<%=path%>/assets/js/common.js'></script>
        <!--[if lte IE 9]>
    <!--<script type="text/javascript" src='/assets/web/js/vendor/html5.js'></script>
    <script type="text/javascript" src="/assets/web/js/vendor/respond.min.js"></script>-->
    <![endif]-->
    </head>
    <body style="background: #f8f8f8;">
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
                        ><a href="javascript:;">超能鹿战队品牌</a>
                        ><a href="javascript:;">${product.name}</a>
                    </p>
                    <div>
                        <h4>${product.name}</h4>
                    </div>
                </div>
                <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
            </div>
            <div class="list-wrap clearfix limitWidth-percentWidth">
                <%--<a href="javascript:;">
                    <span>
                        <img src="<%=path%>/assets/imgs/detail/return.png" alt="">
                    </span>
                    返回
                </a>
                <div class="inner inner-l">
                    <img src="<%=path%>/assets/imgs/team/lm/lm_jxrlm.jpg" alt="">
                </div>
                <div class="inner inner-r">
                    <span></span>
                    <h5>火龙诱惑</h5>
                    <p>火龙诱惑</p>
                </div>--%>

                    <a href="<%=path%>/web/product/list?type=${product.type}">
                    <span>
                        <%--<img src="<%=path%>/assets/imgs/detail/return.png" alt="">--%>
                    </span>
                        返回
                    </a>
                    <div class="inner inner-l">
                        <img src="${product.image}" alt="">
                    </div>
                    <div class="inner inner-r">
                        <span></span>
                        <h5>${product.name}</h5>
                        <p>${product.details}</p>
                    </div>




            </div>
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
        	/*$(function(){
				$('#head').load('head.html');
				$('#foot').load('foot.html');
			})*/
            $(window).scroll(function() {
                if ($(window).scrollTop() != 0) {
                    $('.header-r>a').slideUp();
                } else {
                    $('.header-r>a').slideDown();
                }
                
                
            });
        </script>
    </body>
</html>
