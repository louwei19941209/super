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
        <title>集团简介</title>
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
		<script type="text/javascript" src="<%=path%>/assets/js/jquery-1.10.2.min.js"></script>
		<script type="text/javascript" src="<%=path%>/assets/js/wow.min.js"></script>
		<script type="text/javascript" src="<%=path%>/assets/js/idangerous.swiper.min.js"></script>
		<script type="text/javascript" src="<%=path%>/assets/js/bootstrap.min.js"></script>
		<script type="text/javascript" src='<%=path%>/assets/js/scroll.js'></script>
		<script type="text/javascript" src='<%=path%>/assets/js/common.js'></script>

</head>
<body style="background: #f8f8f8">
    <!-- 头部 -->
    <div id="head">
        <%--<jsp:include page="/WEB-INF/jsp/app/head.jsp"/>--%>
            <jsp:include page="/web/index/head.do"/>
    </div>
    <!-- 加入我们 -->
    <article class="intro">
        <div class="header">
            <div class="wrapper limitWidth-percentWidth">
                <span></span>
                <p>
                    <a href="<%=path%>/web/index/home.do">首页</a>
                    ><a href="javascript:;">超能鹿战队集团</a>
                </p>
                <div>
                    <h4>集团简介</h4>
                    <h5>About Us</h5>
                </div>
            </div>
            <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
        </div>
        <section class="limitWidth-percentWidth">
            <div class="wrap-h clearfix wow fadeInUp animated">
                <div class="inner-l">
                    <img src="<%=path%>/assets/imgs/intro/left.png" alt="">
                </div>
                <div class="inner-r">
                    <%--<p>上海超能鹿战队食品集团有限公司创始于2000年，总部位于上海，</p>
                    <p>现已打造集产品研发、生产加工、物流配送和连锁销售为一体的食品产业链，</p>
                    <p>旗下拥有“超能鹿战队鸡排”和“超能鹿战队烤鸭脖”等多个美食品牌。</p>--%>
                        ${about.introduction}
                </div>
            </div>
            <div class="wrap-c clearfix wow fadeInUp animated">
                <div class="inner-l">
                    <%--<p>超能鹿战队食品从诞生伊始，就一直秉持着“世界美食，超能鹿战队传播”的崇
                        高理想，倡导“新鲜、美味、欢乐”的美食文化，坚守食品安全，
                        从源头养殖环节开始严选把关，先后在上海、山东、安徽等地建立
                        多个生产基地，以及物流配送中心，为全国数万家连锁门店提供高
                        效的仓储和配送服务，为消费者带来舌尖上的美味，为生活增添欢
                        乐。</p>
                    <p>十几年的发展历程，已使得“超能鹿战队”作为美食的代名，走进了千家
                        万户。未来，超能鹿战队立志走出国门，让更多的人品尝到中国的特色
                        美食。</p>--%>
                    ${about2.introduction}
                </div>
                <div class="inner-r">
                    <img src="<%=path%>/assets/imgs/intro/right.png" alt="">
                </div>
            </div>


            <img src="<%=path%>/assets/imgs/intro/title-r.png">
        </section>
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
    	// $(function(){
    	// 	$('#head').load('head.html');
    	// 	$('#foot').load('foot.html');
    	// })
    </script>
</body>
</html>
