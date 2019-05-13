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
    <title>加盟流程</title>
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
    <jsp:include page="/web/index/head.do"/>
</div>
<!-- 加入我们 -->
<article class="core">
    <div class="header">
        <div class="wrapper limitWidth-percentWidth">
            <span></span>
            <p>
                <a href="<%=path%>/web/index/home.do">首页</a>
                ><a href="javascript:;">加盟流程</a>
            </p>
            <div>
                <h4>加盟流程</h4>
                <%-- <h5>System Suppor</h5>--%>
            </div>
        </div>
        <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
    </div>
    <section class="limitWidth-percentWidth">
        <div class="wrap-h wow fadeInUp animated">
            <%--<img src="<%=path%>/assets/imgs/core/kv.jpg">--%>
            <img src="<%=path%>/assets/imgs/path/header-img.png">
           <%-- <div>
                <span></span>
                <p>超能鹿战队</p>
                <p>做您坚实的后盾！</p>
            </div>--%>
        </div>
        <div class="wrap-c wow fadeInUp animated">
            <%--<div>
                <p>
                    <img src="<%=path%>/assets/imgs/core/img1.png" alt="">
                </p>
                <h4>完善的营运体制</h4>
                <h5>超能鹿战队十几年的经营实践，总结出店铺选址、营销策划等一系列完善的营运体系，为店铺销售提供强有力的保障。</h5>
                <p>
                    <img src="<%=path%>/assets/imgs/core/down.png" alt="">
                </p>
            </div>
            <div>
                <p>
                    <img src="<%=path%>/assets/imgs/core/img2.png" alt="">
                </p>
                <h4>全方位的课程培训</h4>
                <h5>专业的培训团队，年轻并富有激情，针对店铺管理运营和产品制作推广等进行全方位的培训</h5>
                <p>
                    <img src="<%=path%>/assets/imgs/core/down.png" alt="">
                </p>
            </div>
            <div>
                <p>
                    <img src="<%=path%>/assets/imgs/core/img3.png" alt="">
                </p>
                <h4>强大的市场策划和宣传</h4>
                <h5>形式多样的企划活动支持，全国性媒体广告支持，专业的企划品设计和制作</h5>
                <p>
                    <img src="<%=path%>/assets/imgs/core/down.png" alt="">
                </p>
            </div>
            <div>
                <p>
                    <img src="<%=path%>/assets/imgs/core/img4.png" alt="">
                </p>
                <h4>产品开发和食品安全</h4>
                <h5>调辅料的研发生产，进一步丰富了产品的品种口味，保持产品的市场竞争优势。</h5>
                <h5>超能鹿战队确保鸡肉供应的来源安全可靠，从源头开始，为鸡排品质把关，每项产品从原料加工到店铺销售都要经过10道质量检验。</h5>
                <p>
                    <img src="<%=path%>/assets/imgs/core/down.png" alt="">
                </p>
            </div>
            <div>
                <p>
                    <img src="<%=path%>/assets/imgs/core/img5.png" alt="">
                </p>
                <h4>统一的采购和配送</h4>
                <h5>覆盖全国的现代化物流服务基地，充分保障每一家门店的货源供应，全程冷链低温运输，保证产品的新鲜品质。</h5>
                <p>
                    <img src="<%=path%>/assets/imgs/core/down.png" alt="">
                </p>
            </div>
            <div>
                <p>
                    <img src="<%=path%>/assets/imgs/core/img6.png" alt="">
                </p>
                <h4>店面装修开业</h4>
                <h5>在培训的同时，安排设计装修团队同步进行作业，减少开业的时间成本。量身订做，视面积大小及现场情形来制定装修方案。</h5>
                <h5>开业前，专业督导人员现场协助，确保店铺的顺利开业。</h5>
                <p>
                    <img src="<%=path%>/assets/imgs/core/down.png" alt="">
                </p>
            </div>--%>

            <c:forEach items="${core.rows}" var="c">
                <div>
                    <p>
                        <img src="${c.image}" alt="">
                    </p>
                    <h4>${c.title}</h4>
                    <h5>${c.content}</h5>
                    <p>
                        <img src="<%=path%>/assets/imgs/core/down.png" alt="">
                    </p>
                </div>
            </c:forEach>

        </div>
        <img src="<%=path%>/assets/imgs/core/time-r.png">
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
