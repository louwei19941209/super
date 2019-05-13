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
    <title>IFBB中体国职战略合作</title>
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
    <style type="text/css">
        .yystd {
            max-width: 1200px;
            min-width: 800px;
            background: #fff;
            padding: 60px;
            margin: 0 0 50px 0;
        }

        .yystd img {
            width: 100%;
            margin: 0 0 40px 0;
        }

        .ifbb_words p {
            text-indent: 30px;
            line-height: 30px;
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
                <h4>IFBB中体国职战略合作</h4>
                <h5>IFBB China-Sports National Job Strategic Cooperation</h5>
            </div>
        </div>
        <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
    </div>
    <section class="limitWidth-percentWidth">
        <div class="yystd">
            <%--<img src="<%=path%>/assets/imgs/ifbb/zlhz.png"/>
            <div class="ifbb_words">
                <p>“超能鹿战队”与IFBB职业联盟“中体国职”达成战略合作！！</p>
                <p>喜讯！！IFBB职业联盟中体国职与“超能鹿战队”达成战略合作，于二月十七日在北京举行签约仪式。</p>
                <p>
                    健身科技院院长杜亚鲁、“超能鹿战队”健身餐厅创始人穆子龙、北京市餐饮行业协会青年联盟商业地产部部长冯睿、必乐液态健身餐市场总监金鑫、2018北京奥赛指定营养餐大卫船长轻食健康餐厅创始人张欣等出席了签约仪式。</p>
                <p>
                    “超能鹿战队”是中国饭店协会会员单位，同时也是2018年中国饭店协会外卖50强品牌，在2018年9月第三届中国外卖独角兽资本对接会上，从200多个品牌中脱颖而出获得“新锐餐饮品牌”称号，同时是多家风投瞄准的意向投资企业。</p>
                <p>
                    “超能鹿战队”的核心竞争力在于超强的产品研发能力，旨在研发适合中国人的健身餐，而其产品研发的核心正是基于运动营养知识的科学运用，每一款产品的食材选择及配比均来源于运动营养的科学数据，超能鹿战队健身餐厅创始人穆子龙这样说道，公司每一个产品研发人员必须系统学习运动营养知识。</p>
                <p>
                    经过团队多次咨询和调研，目前健身行业口碑最好、培训学员最多的就是IFBB职业国际运动营养师，同时穆子龙表示“超能鹿战队营养健身餐厅”将成为IFBB职业国际运动营养师战略合作就业单位，并且他将要求所有门店必须要有1名IFBB职业国际运动营养师。</p>
                <p>“超能鹿战队”的产品设计理念：做健康的、有效的、好吃的适合中国人自己的健身餐。众多健身餐能做到健康是基本，为了迎合大众口味做到好吃也相对容易，但真正做到的有功能效果的为数不多。</p>
                <p>中体国职将持续不断的为“超能鹿战队”在产品研发上给予技术支持，助力“超能鹿战队”快速成长为行业标杆，并授权“超能鹿战队”南京总部为“IFBB职业国际运动营养师合作培训基地”。</p>
                <p>
                    杜院长表示2019年中体国职将继续加大IFBB职业国际运动营养师的教研投入和培训频次，能够让更多的健身人群、运动人群甚至普通大众能够接受到国际前沿的先进的运动营养学知识，同时培养更多更专业的运动营养师为像“超能鹿战队”一样的基于运动营养知识的企业输送更多专业人才，为推动整个健身行业发展不断努力。</p>
            </div>--%>


            <c:forEach items="${n.rows}" var="n" >
                <img src="${n.image}"/>
                <div class="ifbb_words">
                    ${n.content}
                </div>
            </c:forEach>

        </div>
        <img src="<%=path%>/assets/imgs/common/IFBBzlhz.png">
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
