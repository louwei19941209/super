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
    <title>IFBB营养师团队</title>
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
    <!--[if lte IE 9]>
        <!--<script type="text/javascript" src='/assets/web/js/vendor/html5.js'></script>
        <script type="text/javascript" src="/assets/web/js/vendor/respond.min.js"></script>-->
    <![endif]-->
    <style type="text/css">
        .yystd {
            max-width: 1200px;
            min-width: 800px;
            background: #fff;
            padding: 60px;
            margin: 0 0 50px 0;
        }

        .yystd_top, .yystd_mid, .yystd_bottom {
            width: 100%;
        }

        .yystd_top img {
            width: 60%;
            vertical-align: top;
        }

        .yystd_ydy {
            width: 34%;
            margin: 0 0 0 5%;
            display: inline-block;
        }

        .yystd_ydy h4 {
            font-weight: 700;
        }

        .yystd_ydy p, .yystd_ydy h4 {
            font-size: 20px;
            color: #333;
            margin: 0 0 30px 0;
        }

        .yystd_mid p {
            text-indent: 30px;
            line-height: 30px;
        }

        .yystd_bottom img {
            width: 100%;
            margin: 30px 0 0 0;
        }
    </style>
</head>
<body style="background: #f8f8f8">
<!-- 头部 -->
<div id="head">
    <jsp:include page="/web/index/head.do"/>
</div>
<!-- IFBB营养师团队 -->
<article class="out-franchisees">
    <div class="header">
        <div class="wrapper limitWidth-percentWidth">
            <span></span>
            <p>
                <a href="<%=path%>/web/index/home.do">首页</a>
                ><a href="javascript:;">IFBB战略合作</a>
            </p>
            <div>
                <h4>IFBB营养师团队</h4>
                <h5>IFBB Nutritionist Team</h5>
            </div>
        </div>
        <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
    </div>
    <section class="limitWidth-percentWidth">
        <%-- <div class="yystd">
             <div class="yystd_top">
                 <img src="<%=path%>/assets/imgs/ifbb/ydy_0.png"/>
                 <div class="yystd_ydy">
                     <h4>国家运动营养师：穆轩</h4>
                     <p>IFBB国际运动营养师</p>
                     <p>IFBB国际私人健身教练</p>
                     <p>江苏有线特邀运动营养主播</p>
                     <p>南京广播电台特邀连线主播</p>
                 </div>
             </div>
             <div class="yystd_mid">
                 <p>超能鹿战队以IFBB营养师为研发核心，结合各国烹饪技巧，以低糖、低盐、低脂、低卡的理念为出发点，经多次研究试验在新鲜蔬菜，有机食物于最健康、新鲜、自然、营养、卫生的条件达到最好的健康吃法。</p>
                 <p>新产品研发流程：数据分析 - 品尝 -合作运动员意见反馈 - 提交讨论 - 选材 - 生产 - 检测 - 标准化生产 - 商家配送</p>
             </div>
             <div class="yystd_bottom">
                 <img src="<%=path%>/assets/imgs/ifbb/ryzs.png"/>
             </div>
         </div>--%>


        <c:forEach items="${team.rows}" var="t">
            <div class="yystd">
                <div class="yystd_top">
                    <img src="${t.image}"/>
                    <div class="yystd_ydy">
                        <h4>国家运动营养师：${t.name}</h4>
                        <p>${t.identity}</p>
                            <%--<p>IFBB国际私人健身教练</p>
                            <p>江苏有线特邀运动营养主播</p>
                            <p>南京广播电台特邀连线主播</p>--%>
                    </div>
                </div>
                <div class="yystd_mid">
                    <p>${t.introduction}</p>
                        <%--<p>新产品研发流程：数据分析 - 品尝 -合作运动员意见反馈 - 提交讨论 - 选材 - 生产 - 检测 - 标准化生产 - 商家配送</p>--%>
                </div>
                <div class="yystd_bottom">
                    <img src="<%=path%>/assets/imgs/ifbb/ryzs.png"/>
                </div>
            </div>
        </c:forEach>

        <img src="<%=path%>/assets/imgs/common/IFBByystd.png">
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

</script>
</body>
<script type="text/javascript">

</script>
</html>
