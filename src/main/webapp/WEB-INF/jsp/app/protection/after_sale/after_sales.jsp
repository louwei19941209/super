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
        <title>售后保障体系</title>
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
    <article class="common-page">
        <div class="header">
            <div class="wrapper limitWidth-percentWidth">
                <span></span>
                <p>
                    <a href="index.html">首页</a>
                    ><a href="javascript:;">优势保障</a>
                </p>
                <div>
                    <h4>售后保障体系</h4>
                    <h5></h5>
                </div>
            </div>
            <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
        </div>
        <section class="limitWidth-percentWidth">
            <div class="wrap-c clearfix wow fadeInUp animated">
                <%--<p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">
                    <strong style=";padding: 0px">
                        <span style=";padding: 0px;color: rgb(229, 102, 0)">
                            <br/>
                        </span>
                    </strong>
                </p>
                <p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">
                    <strong style=";padding: 0px">
                        <span style=";padding: 0px;color: rgb(229, 102, 0)">
                            <br/>
                        </span>
                    </strong>
                </p>
                <p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">
                    <strong style=";padding: 0px">
                        <span style=";padding: 0px;color: rgb(229, 102, 0)">物流系统</span>
                    </strong>
                </p>
                <p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">
                    <span style=";padding: 0px;color: rgb(229, 102, 0)">全国九大物流运输体系的成立预示着我们将更大程度的保障每一家店铺的货源供应，及时的处理货源的问题，为更多的店铺解决了后顾之忧，从而使其全身心的投入到店铺运营方面。目前，我们建设的有上海、杭州、温州、郑州、广州、山东、合肥、长沙、荆州九大仓储物流基地，几乎覆盖了全国的店铺。</span>
                </p>
                <p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">
                    <br/>
                </p>
                <p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">
                    <br/>
                </p>
                <p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">
                    <span style=";padding: 0px;font-size: 16px;color: rgb(0, 213, 255)">
                        <strong style=";padding: 0px">团队支持</strong>
                    </span>
                </p>
                <p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">
                    <span style=";padding: 0px;color: rgb(0, 213, 255)">超能鹿战队有着十六年的经营历史，管理层都有着丰厚的经营经验和积淀。我们全国在职员工达到</span>
                    <span style=";padding: 0px;font-family: &#39;Times New Roman&#39;;color: rgb(0, 213, 255)">3000</span>
                    <span style=";padding: 0px;font-family: 宋体;color: rgb(0, 213, 255)">多人。总部设立有总经办、市场部、研发部、加盟事业部、人力资源部、采购部、财务部、统计部、设备部、工程部、物流部、仓存配送等以及即将成立的电子商务部，其总共后勤人数达到</span>
                    <span style=";padding: 0px;font-family: &#39;Times New Roman&#39;;color: rgb(0, 213, 255)">500</span>
                    <span style=";padding: 0px;font-family: 宋体;color: rgb(0, 213, 255)">余人，形成一套完善的管理体系，支撑着整个市场的运行，保障每一步都稳健的发展和运作。</span>
                </p>
                <p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">&nbsp;</p>
                <p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">
                    <strong style=";padding: 0px">
                        <span style=";padding: 0px;font-size: 16px;color: rgb(229, 51, 51)">开店支持</span>
                    </strong>
                </p>
                <p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">
                    <span style=";padding: 0px;color: rgb(229, 51, 51)">超能鹿战队在开店方面有着一套完整的流程，确保每家店都顺利的开业。我们设有培训专业团队，针对店铺管理运营和产品制作推广等各方面都进行专业化的培训。我们每期的培训时间一般是</span>
                    <span style=";padding: 0px;font-family: &#39;Times New Roman&#39;;color: rgb(229, 51, 51)">5</span>
                    <span style=";padding: 0px;font-family: 宋体">
                        <span style=";padding: 0px;color: rgb(229, 51, 51)">天，设计店铺运营管理、产品制作、广告营销。在开业的时候，更是配有专业的督导人员去协助三天，确保店铺一切顺利的运营。在培训的同时，我们会安排设计、装修队同步进行工作，最大程度的减少开业的时间成本，保证培训合格的员工都能及时上岗创造价值</span>
                        <span style=";padding: 0px;color: rgb(229, 51, 51)">。</span>
                    </span>
                </p>
                <p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">&nbsp;</p>
                <p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">
                    <strong style=";padding: 0px">
                        <span style=";padding: 0px;font-size: 16px;color: rgb(238, 51, 238)">营销策划</span>
                    </strong>
                </p>
                <p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">
                    <span style=";padding: 0px;color: rgb(238, 51, 238)">我们会定时给予一定时期的市场营销活动，其中包括开业时的广告营销、市场推广、互联网营销等多样化营销手段。后期新品的研发策划以及活动策划都给与支持和方案。未来电子商务专项小组的成立，将更全面的支持互联网</span>
                    <span style=";padding: 0px;font-family: &#39;Times New Roman&#39;;color: rgb(238, 51, 238)">+</span>
                    <span style=";padding: 0px;font-family: 宋体;color: rgb(238, 51, 238)">的营销渠道，打造一个全方位的营销体系。</span>
                </p>
                <p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">
                    <span style=";padding: 0px;font-family: 宋体;color: rgb(238, 51, 238)">
                        <br/>
                    </span>
                </p>
                <p style="margin-top: 0px;margin-bottom: 0px;padding: 0px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;white-space: normal;">
                    <span style=";padding: 0px;font-family: 宋体;color: rgb(238, 51, 238)">
                        <br/>
                    </span>
                </p>
                <p>
                    <br/>
                </p>--%>

                <c:forEach items="${after.rows}" var="a">
                    ${a.content}
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
    	/*$(function(){
    		$('#head').load('head.html');
    		$('#foot').load('foot.html');
    	})*/
    </script>
</body>
</html>
