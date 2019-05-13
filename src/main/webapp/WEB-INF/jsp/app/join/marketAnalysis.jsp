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
        <title>市场分析</title>
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
                    ><a href="javascript:;">招商加盟</a>
                </p>
                <div>
                    <h4>市场分析</h4>
                    <h5></h5>
                </div>
            </div>
            <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
        </div>
        <section class="limitWidth-percentWidth">
            <div class="wrap-c clearfix wow fadeInUp animated">
                <%--<p class="text" style="margin-top: 0px; margin-bottom: 0px; padding: 0px; line-height: 26px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal; ">
                    <br/>
                </p>
                <p class="text" style="margin-top: 0px; margin-bottom: 0px; padding: 0px; line-height: 26px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal; ">
                    据商务部统计，近年来，中国餐饮业销售额连续保持两位数的增长，预计2016年中国餐饮业销售总额将达到5万亿元，占预期社会消费品零售总额50万亿元的十分之一。众所周知，在十大投资者关注行业中，餐饮业一直位居首位，可见其深入人心的程度之高。随着社会的不断进步，人们生活节奏的不断加快，使得城市群体对各种餐饮的消费需求也日益增大，人们对营养的合理搭配诉求更高，使得民以食为天的中国投资者，愈加看好餐饮业这个巨大的财富市场。<br/>不论在大中小城市、集贸市场、大街小巷、公园、小区，还是夜市休闲与小吃摊点，烧烤行业随处可见，它已成为众多消费者饮食中不可缺少的一部分，造就了一个庞大的消费市场。随着时尚更新，烧烤行业因其自然淳朴的做法和原始野性的味道，成为人们越来越喜欢的餐饮方式之一。约上几个朋友围桌而坐，叫上冰凉的鲜啤酒，边烤边吃、边喝边聊，四溢的烤肉香加上“滋滋”的烤肉声，都是令人垂涎欲滴的理由，足以让每一位食客按捺不住。烧烤的花样、品种繁多，有肉类、蔬菜类，甚至连香蕉、苹果等时蔬水果都是烧烤的新贵。
                </p>
                <p class="text" style="margin-top: 0px; margin-bottom: 0px; padding: 0px; line-height: 26px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal; ">
                    <br/>
                </p>
                <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal;">
                    <span class="tit" style="margin: 0px; padding: 0px;">开业条件</span>
                </p>
                <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal; ">
                    <span style="margin: 0px; padding: 0px;">资金</span>
                    &nbsp;- 前期投资20万元左右，主要用于加盟费用、开办经费、房屋租金（10万左右算）、装修费、产品进货费用等
                </p>
                <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal; ">
                    <span style="margin: 0px; padding: 0px;">店面</span>
                    &nbsp;- 5平方米~30平方米即可。
                </p>
                <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal;">
                    <span style="margin: 0px; padding: 0px;">设施</span>
                    &nbsp;- 包括烧烤炉、冰柜、陈列柜等
                </p>
                <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal;">
                    <span style="margin: 0px; padding: 0px;">人员</span>
                    &nbsp;- 店主1人；营业员2～3人。具有初中文化以上程度，身体健康，取得《个人卫生健康合格证》；并经过项目单位上岗培训持有《上岗证》。经营者具吃苦耐劳的创业精神，掌握食品卫生相关知识，具备一定经营能力。
                </p>
                <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal; ">
                    <br/>
                </p>
                <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal; ">产品销售：鸡排、肉串、鱿鱼、烤肠、手抓饼、饮料等主打产品</p>
                <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal;">
                    <br/>
                </p>
                <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal;">销售利润：毛利不低于52%，纯利主要看商圈位置、门店租金、人力成本控制、水电费、设备折旧等其他开支。一般在20%~30%左右。</p>
                <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal; ">
                    <br/>
                </p>
                <p style="margin-top: 0px; margin-bottom: 0px; padding: 0px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; white-space: normal; ">广告支持：黄渤代言平面广告、黄渤代言视频广告、门店广告、车体广告、场地广告、网络广告、电台广告等</p>
                <p>
                    <br/>
                </p>--%>


                <c:forEach items="${market.rows}" var="m">
                    ${m.content}
                </c:forEach>

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

    </script>
</body>
</html>
