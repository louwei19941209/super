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
    <title>企业荣誉</title>
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

        ul.qyry_list li {
            list-style: none;
            margin: 28px 0px 50px 0;
            padding: 0px;
            width: 100%;
            float: left;
        }

        ul.qyry_list li p {
            padding: 0px;
            line-height: 22px;
            margin-top: 10px;
            margin-bottom: 0px;
        }

        ul.qyry_list span {
            max-width: 100%;
            max-height: 100%;
            float: left;
            margin: 0 10px 0 0;
        }

        ul.qyry_list span img {
            max-width: 116px;
            max-height: 120px;
        }
    </style>
</head>
<body style="background: #f8f8f8">
<!-- 头部 -->
<div id="head">
    <jsp:include page="/web/index/head.do"/>
</div>

<!-- 企业荣誉 -->
<article class="common-page">
    <div class="header">
        <div class="wrapper limitWidth-percentWidth">
            <span></span>
            <p>
                <a href="<%=path%>/web/index/home.do">首页</a>
                ><a href="javascript:;">超能鹿战队</a>
            </p>
            <div>
                <h4>企业荣誉</h4>
                <h5>Corporate honor</h5>
            </div>
        </div>
        <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
    </div>
    <section class="limitWidth-percentWidth">
        <div class="wrap-c clearfix wow fadeInUp animated">
            <ul class="clearfix qyry_list" style="list-style-type: none;">
                <%--<li>
                    <span>
                        <img src="<%=path%>/assets/imgs/qyry/qyry_0.jpg"/>
                    </span>
                    <p style="">2018年10月中饭协会颁发【中国饭店外卖专业委员会会员单位】【中国饭店外卖更具成长性品牌】【中国饭店外卖50强品牌】</p>
                </li>
                <li>
                    <span>
                        <img src="<%=path%>/assets/imgs/qyry/qyry_1.jpg"/>
                    </span>
                    <p >2018年10月中饭协会颁发【中国饭店外卖专业委员会会员单位】【中国饭店外卖更具成长性品牌】【中国饭店外卖50强品牌】</p>
                </li>
                <li>
                    <span>
                        <img src="<%=path%>/assets/imgs/qyry/qyry_2.jpg"/>
                        <img src="<%=path%>/assets/imgs/qyry/qyry_3.jpg"/>
                        <img src="<%=path%>/assets/imgs/qyry/qyry_4.jpg"/>
                    </span>
                    <p >2018年10月中饭协会颁发【中国饭店外卖专业委员会会员单位】【中国饭店外卖更具成长性品牌】【中国饭店外卖50强品牌】</p>
                </li>
                <li>
                    <span>
                        <img src="<%=path%>/assets/imgs/qyry/qyry_5.png"/>
                        <img src="<%=path%>/assets/imgs/qyry/qyry_6.png"/>
                        <img src="<%=path%>/assets/imgs/qyry/qyry_7.jpg"/>
                    </span>
                    <p >2018年10月中饭协会颁发【中国饭店外卖专业委员会会员单位】【中国饭店外卖更具成长性品牌】【中国饭店外卖50强品牌】</p>
                </li>--%>


                <c:forEach items="${honor.rows}" var="c" varStatus="cou">
                    <li>
                    <span>
                        <c:forEach items="${c.images}" var="i">
                            <img  alt="" src="${i.path}"/>
                        </c:forEach>
                    </span>
                        <p >${c.content}</p>
                    </li>
                </c:forEach>

            </ul>
            <p>
                <br/>
            </p>
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
