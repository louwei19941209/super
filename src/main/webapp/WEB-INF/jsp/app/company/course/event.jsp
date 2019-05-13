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
        <title>发展历程</title>
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
</head>
<body style="background: #f8f8f8">
    <!-- 头部 -->
    <div id="head">
        <%--<jsp:include page="/WEB-INF/jsp/app/head.jsp"/>--%>
            <jsp:include page="/web/index/head.do"/>
    </div>
    	
    <!-- 加入我们 -->
    <article class="time">
        <div class="header">
            <div class="wrapper limitWidth-percentWidth">
                <span></span>
                <p>
                    <a href="<%=path%>/web/index/home.do">首页</a>
                    ><a href="javascript:;">超能鹿战队</a>
                </p>
                <div>
                    <h4>发展历程</h4>
                    <h5>Event Record</h5>
                </div>
            </div>
            <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
        </div>
        <section class="limitWidth-percentWidth">
            <div class="wrap-c clearfix">
                <%--<div class="pull-right wow fadeInUp animated">
                    <img src="<%=path%>/assets/imgs/time/2016.png" alt="">
                    <p>2016年11月组建健身餐研发团队。</p>
                </div>
                <div class="pull-left wow fadeInUp animated">
                    <p>2017年4月创立“超能鹿战队”。</p>
                    <img src="<%=path%>/assets/imgs/time/2017.png" alt="">
                </div>
                <div class="pull-right wow fadeInUp animated">
                    <img src="<%=path%>/assets/imgs/time/2018.png" alt="">
                    <p>2018年3月组建运营团队，市场部、客服部、事业发展部等等，江浙沪部分城市开设分店，同年7月面向全国接收小规模加盟。19个月百余家门店，门店覆盖城市：南京、上海、成都、苏州、西安、深圳、无锡、青岛、温州、常州、杭州、合肥、大连、昆山、常熟、吴江、张家港、江阴、慈溪、武汉、襄阳、哈尔滨等（部分城市有多家门店）</p>
                </div>--%>

                <c:forEach items="${event.rows}" var="e" varStatus="index">
                    <c:if test="${index.index%2 == 0}">
                        <div class="pull-right wow fadeInUp animated">
                            <img src="${e.image}" alt="">
                            <p>${e.content}</p>
                        </div>
                    </c:if>

                    <c:if test="${index.index%2 == 1}">
                        <div class="pull-left wow fadeInUp animated">
                            <p>${e.content}</p>
                            <img src="${e.image}" alt="">
                        </div>
                    </c:if>
                </c:forEach>


                <!-- 分隔线 -->
                <div class="fg">
                    <span class="top">
                        <img src="<%=path%>/assets/imgs/time/top-bg.png" alt="">
                    </span>
                    <span class="bottom">
                        <img src="<%=path%>/assets/imgs/time/top-bg.png" alt="">
                    </span>
                </div>
            </div>
            <img src="<%=path%>/assets/imgs/franchisees/title-r.png">
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
