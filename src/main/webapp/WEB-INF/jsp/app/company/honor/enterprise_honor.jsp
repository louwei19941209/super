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
</head>
<body style="background: #f8f8f8">
    <!-- 头部 -->
    <div id="head">
        <%--<jsp:include page="/WEB-INF/jsp/app/head.jsp"/>--%>
            <jsp:include page="/web/index/head.do"/>
    </div>
    	
    <!-- 加入我们 -->
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
                    <h5></h5>
                </div>
            </div>
            <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
        </div>
        <section class="limitWidth-percentWidth">
            <div class="wrap-c clearfix wow fadeInUp animated">
                <ul class="clearfix" style="list-style-type: none;">
                    <%--<li style="list-style: none; margin: 28px 0px 0px; padding: 0px; width: 910px; float: left;">
                        <span class="fl" style="margin: 0px 0px 0px 38px; padding: 0px; width: 116px; height: 120px; float: left; display: block;">
                            <img alt="" src="<%=path%>/assets/imgs/banner/banner_14.png"/>
                        </span>
                        <div class="fr" style="margin: 20px 0px 0px; padding: 0px; width: 715px; float: right; display: inline;">
                            <strong style="margin: 0px; padding: 0px; color: rgb(197, 23, 32); line-height: 24px; font-size: 18px;">年轻富有活力</strong>
                            <p style="padding: 0px; line-height: 22px; margin-top: 10px; margin-bottom: 0px;">
                                超能鹿战队的企业团队是一群年轻的精英队伍，平均年龄只有30岁，<br/>这个团队，快于部署，勇于冲锋，精于合作，擅于报捷，正在打造一个让餐饮业为之瞩目的美好未来。
                            </p>
                        </div>
                    </li>
                    <li style="list-style: none; margin: 74px 0px 0px; padding: 0px; width: 910px; float: left;">
                        <span class="fl" style="margin: 0px 0px 0px 75px; padding: 0px; width: 116px; height: 120px; float: left; display: block;">
                            <img alt="" src="<%=path%>/assets/imgs/banner/banner_15.png"/>
                        </span>
                        <div class="fr" style="margin: 0px; padding: 0px; width: 671px; float: right; display: inline;">
                            <strong style="margin: 0px; padding: 0px; color: rgb(197, 23, 32); line-height: 24px; font-size: 18px;">历史积淀底蕴</strong>
                            <p style="padding: 0px; line-height: 22px; margin-top: 10px; margin-bottom: 0px;">
                                上海超能鹿战队食品集团有限公司从2000年开设的第一家店铺开始，历经十五年的风风雨雨，<br/>
                                期间收购了众多鸡排、肉串等大型厂商，建立起一体化生产、配送、研发、销售的体系，<br/>且全国设立40多个分公司和五大办事处。
                            </p>
                        </div>
                    </li>

                    <li style="list-style: none; margin: 83px 0px 0px; padding: 0px; width: 910px; float: left;">
                        <span class="fl" style="margin: 0px 0px 0px 158px; padding: 0px; width: 116px; height: 120px; float: left; display: block;">
                            <img alt="" src="<%=path%>/assets/imgs/banner/banner_16.png"/>
                        </span>
                        <div class="fr" style="margin: 20px 0px 0px; padding: 0px; width: 589px; float: right; display: inline;">
                            <strong style="margin: 0px; padding: 0px; color: rgb(197, 23, 32); line-height: 24px; font-size: 18px;">创新寻求发展</strong>
                            <p style="padding: 0px; line-height: 22px; margin-top: 10px; margin-bottom: 0px;">
                                尽管超能鹿战队旗下的子品牌以及产品种类已经品种齐全，<br/>但是创新与发展的使命使我们无法停止新品的研发项目，我们时刻走在时代的最前端。
                            </p>
                        </div>
                    </li>
                    <li style="list-style: none; margin: 84px 0px 0px; padding: 0px; width: 910px; float: left;">
                        <span class="fl" style="margin: 0px 0px 0px 101px; padding: 0px; width: 116px; height: 120px; float: left; display: block;">
                            <img alt="" src="<%=path%>/assets/imgs/banner/banner_17.png"/>
                        </span>
                        <div class="fr" style="margin: 0px; padding: 0px; width: 638px; float: right; display: inline;">
                            <strong style="margin: 0px; padding: 0px; color: rgb(197, 23, 32); line-height: 24px; font-size: 18px;">目标展望未来</strong>
                            <p style="padding: 0px; line-height: 22px; margin-top: 10px; margin-bottom: 0px;">
                                “世界美食，超能鹿战队传播”的宗旨让我们有着清晰的发展方向和前进目标，<br/>
                                从第一家店铺到上千家店铺，从普通门面店到升级版店铺再到一体化餐厅店，<br/>未来是一片美好的宏伟蓝图。
                            </p>
                        </div>
                    </li>
                    <li style="list-style: none; margin: 84px 0px 0px; padding: 0px; width: 910px; float: left;">
                        <span class="fl" style="margin: 0px 0px 0px 101px; padding: 0px; width: 116px; height: 120px; float: left; display: block;">
                            <img alt="" src="<%=path%>/assets/imgs/banner/banner_18.png"/>
                        </span>
                        <div class="fr" style="margin: 0px; padding: 0px; width: 638px; float: right; display: inline;">
                            <strong style="margin: 0px; padding: 0px; color: rgb(197, 23, 32); line-height: 24px; font-size: 18px;">合作共谋双赢</strong>
                            <p style="padding: 0px; line-height: 22px; margin-top: 10px; margin-bottom: 0px;">
                                十五年餐饮经营经验的积淀如果不分享不传播永远无法发挥其最大的社会价值，<br/>
                                开放加盟渠道是超能鹿战队的一项重大发展战略，旨在传播优秀的经营理念和经营方法，谋求合作双赢，<br/>将超能鹿战队的社会价值最大化。
                            </p>
                        </div>
                    </li>--%>


                    <c:forEach items="${honor.rows}" var="c" varStatus="cou">


                        <li>
                    	<span>
                    		<c:forEach items="${c.images}" var="i">
                                <img style="max-width: 100%;max-height: 100%" alt="" src="${i.path}"/>
                            </c:forEach>
                    	</span>
                            <p style="">${c.content}</p>
                        </li>

                        <%--<c:if test="${cou.index == 0}">
                            <li style="list-style: none; margin: 28px 0px 0px; padding: 0px; width: 910px; float: left;">
                        <span class="fl" style="margin: 0px 0px 0px 38px; padding: 0px; width: 116px; height: 120px; float: left; display: block;">
                            <c:forEach items="${c.images}" var="i">
                                <img style="max-width: 100%;max-height: 100%" alt="" src="${i.path}"/>
                            </c:forEach>
                        </span>
                                <div class="fr" style="margin: 20px 0px 0px; padding: 0px; width: 715px; float: right; display: inline;">
                                    <strong style="margin: 0px; padding: 0px; color: rgb(197, 23, 32); line-height: 24px; font-size: 18px;"></strong>
                                    <p style="padding: 0px; line-height: 22px; margin-top: 10px; margin-bottom: 0px;">
                                            &lt;%&ndash;超能鹿战队的企业团队是一群年轻的精英队伍，平均年龄只有30岁，<br/>这个团队，快于部署，勇于冲锋，精于合作，擅于报捷，正在打造一个让餐饮业为之瞩目的美好未来。&ndash;%&gt;
                                            ${c.content}
                                    </p>
                                </div>
                            </li>
                        </c:if>

                        <c:if test="${cou.index == 1}">
                            <li style="list-style: none; margin: 74px 0px 0px; padding: 0px; width: 910px; float: left;">
                        <span class="fl" style="margin: 0px 0px 0px 75px; padding: 0px; width: 116px; height: 120px; float: left; display: block;">
                            <c:forEach items="${c.images}" var="i">
                                <img style="max-width: 100%;max-height: 100%" alt="" src="${i.path}"/>
                            </c:forEach>
                        </span>
                                <div class="fr" style="margin: 0px; padding: 0px; width: 671px; float: right; display: inline;">
                                    <strong style="margin: 0px; padding: 0px; color: rgb(197, 23, 32); line-height: 24px; font-size: 18px;"></strong>
                                    <p style="padding: 0px; line-height: 22px; margin-top: 10px; margin-bottom: 0px;">
                                            ${c.content}
                                    </p>
                                </div>
                            </li>
                        </c:if>

                        <c:if test="${cou.index == 2}">
                            <li style="list-style: none; margin: 83px 0px 0px; padding: 0px; width: 910px; float: left;">
                        <span class="fl" style="margin: 0px 0px 0px 158px; padding: 0px; width: 116px; height: 120px; float: left; display: block;">
                            <c:forEach items="${c.images}" var="i">
                                <img style="max-width: 100%;max-height: 100%" alt="" src="${i.path}"/>
                            </c:forEach>
                        </span>
                                <div class="fr" style="margin: 20px 0px 0px; padding: 0px; width: 589px; float: right; display: inline;">
                                    <strong style="margin: 0px; padding: 0px; color: rgb(197, 23, 32); line-height: 24px; font-size: 18px;"></strong>
                                    <p style="padding: 0px; line-height: 22px; margin-top: 10px; margin-bottom: 0px;">
                                            ${c.content}
                                    </p>
                                </div>
                            </li>
                        </c:if>

                        <c:if test="${cou.index == 3}">
                            <li style="list-style: none; margin: 84px 0px 0px; padding: 0px; width: 910px; float: left;">
                        <span class="fl" style="margin: 0px 0px 0px 101px; padding: 0px; width: 116px; height: 120px; float: left; display: block;">
                            <c:forEach items="${c.images}" var="i">
                                <img style="max-width: 100%;max-height: 100%" alt="" src="${i.path}"/>
                            </c:forEach>
                        </span>
                                <div class="fr" style="margin: 0px; padding: 0px; width: 638px; float: right; display: inline;">
                                    <strong style="margin: 0px; padding: 0px; color: rgb(197, 23, 32); line-height: 24px; font-size: 18px;"></strong>
                                    <p style="padding: 0px; line-height: 22px; margin-top: 10px; margin-bottom: 0px;">
                                            ${c.content}
                                    </p>
                                </div>
                            </li>
                        </c:if>

                        <c:if test="${cou.index == 4}">
                            <li style="list-style: none; margin: 84px 0px 0px; padding: 0px; width: 910px; float: left;">
                        <span class="fl" style="margin: 0px 0px 0px 101px; padding: 0px; width: 116px; height: 120px; float: left; display: block;">
                            <c:forEach items="${c.images}" var="i">
                                <img style="max-width: 100%;max-height: 100%" alt="" src="${i.path}"/>
                            </c:forEach>
                        </span>
                                <div class="fr" style="margin: 0px; padding: 0px; width: 638px; float: right; display: inline;">
                                    <strong style="margin: 0px; padding: 0px; color: rgb(197, 23, 32); line-height: 24px; font-size: 18px;"></strong>
                                    <p style="padding: 0px; line-height: 22px; margin-top: 10px; margin-bottom: 0px;">
                                            ${c.content}
                                    </p>
                                </div>
                            </li>
                        </c:if>

                        <c:if test="${cou.index > 4}">
                            <li style="list-style: none; margin: 84px 0px 0px; padding: 0px; width: 910px; float: left;">
                        <span class="fl" style="margin: 0px 0px 0px 101px; padding: 0px; width: 116px; height: 120px; float: left; display: block;">
                            <c:forEach items="${c.images}" var="i">
                                <img style="max-width: 100%;max-height: 100%" alt="" src="${i.path}"/>
                            </c:forEach>
                        </span>
                                <div class="fr" style="margin: 0px; padding: 0px; width: 638px; float: right; display: inline;">
                                    <strong style="margin: 0px; padding: 0px; color: rgb(197, 23, 32); line-height: 24px; font-size: 18px;"></strong>
                                    <p style="padding: 0px; line-height: 22px; margin-top: 10px; margin-bottom: 0px;">
                                            ${c.content}
                                    </p>
                                </div>
                            </li>
                        </c:if>--%>

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
