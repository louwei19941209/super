<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ page import="com.springmvc.commons.util.DateUtil" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>联系方式</title>
    <meta name="keywords" content=""/>
    <meta name="description" content=""/>
    <meta name="renderer" content="webkit">
    <meta http-equiv="x-ua-compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
    <meta name="360-site-verification" content="f0a40645f269df3b6c409ee359a547e0"/>
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
<article class="common-page">
    <div class="header">
        <div class="wrapper limitWidth-percentWidth">
            <span></span>
            <p>
                <a href="<%=path%>/web/index/home.do">首页</a>
                ><a href="javascript:;">联系我们</a>
            </p>
            <div>
                <h4>联系方式</h4>
                <h5></h5>
            </div>
        </div>
        <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
    </div>
    <section class="limitWidth-percentWidth">
        <div class="wrap-c clearfix wow fadeInUp animated">
            <div class="conTop"
                 style="margin: 0px; padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal; background-color: rgb(255, 255, 255);">
                <ul class="clearfix" style="margin: 0px; padding: 0px;">
                    <li class="fl"
                        style="margin: 0px; padding: 60px 0px 0px 58px; width: 425px; float: left; display: inline;">
                        <span class="tit"
                              style="margin: 0px; padding: 0px 0px 0px 25px; width: 280px; height: 38px; font-size: 19px; line-height: 26px; font-weight: bold; display: block; color: #00c782;">健康饮食、超能鹿战队传播！</span>


                        <c:forEach items="${contact.rows}" var="c">
                            <h1 style="margin: 5px 0px 0px; padding: 0px; color: rgb(55, 56, 57); line-height: 48px; font-family: 微软雅黑; font-size: 36px;">
                                <span style="font-size: 24px;">${c.company}</span>
                            </h1>
                            <p style="padding: 0px; color: rgb(46, 46, 46); line-height: 28px; margin-top: 10px; margin-bottom: 0px;">
                                地址: ${c.address}<br/>
                                加盟咨询: ${c.phone}<br/>
                                网址：${c.url}<br/>E-mail: ${c.email}
                            </p>
                            <div class="clearfix" style="margin: 22px 0px 0px; padding: 0px;">
                                <p style="padding: 0px; width: 143px; margin-top: 0px; margin-bottom: 0px; float: left;">
                                    <span style="margin: 0px; padding: 0px; width: 143px; height: 140px; display: block;">
                                        <img alt="" src="${c.noPublic}" style="margin-left: -13px;"/>
                                    </span>
                                    <span style="margin: 0px; margin-left: 17px; padding: 0px; width: 143px; height: 140px; display: block;">微信公众号</span>
                                </p>
                            </div>
                        </c:forEach>


                    </li>
                    <li class="fr"
                        style="margin: 0px 40px 0px 0px; padding: 0px; width: 409px; float: right; display: inline;">
                        <img alt="" src="<%=path%>/assets/imgs/banner/hb_0.png"/>
                    </li>
                </ul>
            </div>
            <div class="conEwm clearfix"
                 style="margin: 46px 0px 0px 58px; padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal;"></div>
            <p>&nbsp;</p>
        </div>
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
    /*$(function(){
        $('#head').load('head.html');
        $('#foot').load('foot.html');
    })*/
</script>
</body>
</html>
