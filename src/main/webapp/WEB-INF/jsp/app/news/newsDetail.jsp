<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>公司快讯详情</title>
    <meta name="keywords" content=""/>
    <meta name="description" content=""/>
    <meta name="renderer" content="webkit">
    <meta http-equiv="x-ua-compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
    <link rel="stylesheet" href="<%=path%>/assets/css/animate.min.css">
    <link rel="stcssylesheet" href="<%=path%>/assets/css/idangerous.swiper.css"/>
    <link rel="stylesheet" href="<%=path%>/assets/css/common.css"/>
    <link rel="stylesheet" href="<%=path%>/assets/css/league.master.css"/>
    <script type="text/javascript" src="<%=path%>/assets/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="<%=path%>/assets/js/wow.min.js"></script>
    <script type="text/javascript" src="<%=path%>/assets/js/idangerous.swiper.min.js"></script>
    <script type="text/javascript" src='<%=path%>/assets/js/scroll.js'></script>
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
<article class="hot-product new-detail">
    <div class="header">
        <div class="wrapper limitWidth-percentWidth">
            <span></span>
            <p>
                <a href="<%=path%>/web/index/home.do">首页</a>
                ><a href="javascript:;">新闻中心</a>
                <%--><a href="javascript:;">新闻中心</a>
                ><a href="<%=path%>/web/news/news.do">公司快讯</a>--%>
            </p>
            <div>
                <h4>${news.titile}</h4>
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
        <div class="inner inner-r">
            <p style="padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; margin-top: 0px; margin-bottom: 0px; white-space: normal; background-color: rgb(255, 255, 255);">截止2018年5月10日超能鹿战队鸡排全国分店达到13955家！</p>
            <p style="padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; margin-top: 0px; margin-bottom: 0px; white-space: normal; background-color: rgb(255, 255, 255);">
                <img title="" alt="" src="<%=path%>/assets/imgs/news/img_0.png"/>
            </p>
            <p></p>
        </div>--%>


        <c:choose>
            <c:when test="${news.type  == 1}">
                <a href="<%=path%>/web/news/news.do">
                <span>
                    <img src="<%=path%>/assets/imgs/detail/return.png" alt="">
                </span>
                    返回
                </a>
            </c:when>
            <c:otherwise>
                <a href="<%=path%>/web/news/media.do">
                <span>
                    <img src="<%=path%>/assets/imgs/detail/return.png" alt="">
                </span>
                    返回
                </a>
            </c:otherwise>
        </c:choose>


        <%--<c:choose>
            <c:when test="${news.type  == 1}">
                ${news.content}
            </c:when>
            <c:otherwise>
                <div class="inner inner-r">
                    <p style="padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; margin-top: 0px; margin-bottom: 0px; white-space: normal; background-color: rgb(255, 255, 255);">${news.content}</p>
                    &lt;%&ndash;<p style="padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; margin-top: 0px; margin-bottom: 0px; white-space: normal; background-color: rgb(255, 255, 255);">
                        <img title="${news.titile}" alt="" src="${news.image}"/>
                    </p>&ndash;%&gt;
                    <p></p>

                </div>
            </c:otherwise>
        </c:choose>--%>
            ${news.content}

    </div>
    <img src="<%=path%>/assets/imgs/league/bg-line.png" class="left">
    <img src="<%=path%>/assets/imgs/detail/bg-right.png" class="right">
</article>
<div class="pop-up">
    <img src="<%=path%>/assets/imgs/index/ewm-01.jpg">
</div>
<div id="foot">
    <jsp:include page="/WEB-INF/jsp/app/foot.jsp"/>
</div>

<script type="text/javascript">

</script>
</body>
</html>
