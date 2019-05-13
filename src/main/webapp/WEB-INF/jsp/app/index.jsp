<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
    <head lang="en">
        <meta charset="UTF-8">
        <title>超能鹿战队</title>
        <meta name="keywords" content=""/>
        <meta name="description" content=""/>
        <meta name="renderer" content="webkit">
        <meta http-equiv="x-ua-compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
        <!--<meta name="360-site-verification" content="f0a40645f269df3b6c409ee359a547e0"/>-->
        <!-- <link rel="stylesheet" href="/assets/web/js/vendor/wow/animate.min.css"></script> -->
        <link rel="stylesheet" href="<%=path%>/assets/css/idangerous.swiper.css"/>
        <link rel="stylesheet" href="<%=path%>/assets/css/common.css"/>
        <link rel="stylesheet" href="<%=path%>/assets/css/index.master.css"/>
        <script type="text/javascript" src="<%=path%>/assets/js/jquery-1.10.2.min.js"></script>
        <!-- <script type="text/javascript" src="/assets/web/js/vendor/wow/wow.min.js"></script> -->
        <script type="text/javascript" src="<%=path%>/assets/js/idangerous.swiper.min.js"></script>
        <script type="text/javascript" src='<%=path%>/assets/js/index.js'></script>
        <script type="text/javascript" src='<%=path%>/assets/js/common.js'></script>
        <!--[if lte IE 9]>
    <script type="text/javascript" src="<%=path%>/assets/web/js/vendor/html5.js"></script>
    <script type="text/javascript" src="<%=path%>/assets/web/js/vendor/respond.min.js"></script>
    <![endif]-->
    </head>
    <body>
        <!-- 头部 -->
        <div id="head">
            <jsp:include page="/web/index/head.do"/>
            <%--<jsp:include page="head.jsp"/>--%>

        </div>
        <!-- 首页轮播 -->
        <div class="kv swiper-container">
            <img class="chicken shake" src="<%=path%>/assets/imgs/index/chicken.png">
            <div class="swiper-wrapper">
                <div class="swiper-slide">
                    <a href="javascript:;">
                        <img src="<%=path%>/assets/imgs/banner/banner_0.jpg">
                    </a>
                    <!--<div class="title">
                        <img src="imgs/banner/banner_1.png" class="title1">
                        <img src="imgs/banner/banner_2.png" class="title2">
                        <img src="imgs/banner/banner_3.png" class="title3">
                        <img src="imgs/banner/banner_4.png" class="title4">
                    </div>-->
                </div>
                <div class="swiper-slide">
                    <a href="javascript:;">
                        <img src="<%=path%>/assets/imgs/banner/banner_9.jpg">
                    </a>
                </div>
                <div class="swiper-slide">
                    <a href="javascript:;">
                        <img src="<%=path%>/assets/imgs/banner/banner_10.jpg">
                    </a>
                </div>
            </div>
            <div class="next"></div>
            <div class="line-lb"></div>
            <div class="prev"></div>
        </div>
        <!-- 成立时间 -->
        <div class="set-time clearfix">
            <!-- 向下 -->
            <div class="down animate-bounce-up">
                <img src="<%=path%>/assets/imgs/index/down.png">
            </div>
            <!-- 简介 -->
            <div class="intro slideInLeft">
                <img src="<%=path%>/assets/imgs/index/shape-bg.png">
                <div>
                    <span></span>
                    <p>公司简介</p>
                    <h5>七天一周期  越吃越轻松</h5>
                </div>
            </div>
            <!-- 红色的线 -->
            <div class="r-line"></div>
            <!-- 播放视频 -->
            <div class="play">
                <img src="<%=path%>/assets/imgs/banner/banner_5.png">
            </div>
            <div class="time">
                <p>
                    <img src="<%=path%>/assets/imgs/index/line.png">
                </p>
                <img src="<%=path%>/assets/imgs/index/2006.png">
                <p>
                    <img src="<%=path%>/assets/imgs/index/line.png">
                </p>
            </div>
            <div class="world slideInRight">
                超能鹿战队是中国最专业的健身餐研发机构，以绿色蔬菜及有机食物在最健康、新鲜、营养、卫生的条件展现给各类需求人群，现有餐品百余种，根据不同场景季节交替更新。<br />“超能鹿战队”作为一个有生命年轻化互联网加餐饮的商业健身餐品牌。多国料理融合餐，核心竞争力是不可模仿的。
                </p>
                <a href="<%=path%>/web/companyProfile/about.do" class="btn clearfix">
                    探索更多
            <span>></span>
                </a>
            </div>
        </div>
        <!-- 产品中心 -->
        <div class="product">
            <!-- 线条 -->
            <div class="r-line"></div>
            <div class="r-line"></div>
            <div class="w-line"></div>
            <div class="w-line"></div>
            <div class="wrap-l">
                <span></span>
                <p>产品中心</p>
                <h5>营养健康  健身减脂</h5>
                <a href="<%=path%>/web/product/list.do?title=产品" class="btn clearfix">
                    探索更多
            <span>></span>
                </a>
            </div>
            <div class="wrap-r">

                <%--<a href="product.html?id=" class="img1 wow bounceInLeft animated">
                    <img src="<%=path%>/assets/imgs/banner/banner_6.png">
                    <p>凉面</p>
                </a>
                <a href="product.html?id=" class="img2 wow bounceInLeft animated">
                    <img src="<%=path%>/assets/imgs/banner/banner_7.png">
                    <p>饮品</p>
                </a>
                <a href="product.html?id=" class="img3 wow bounceInLeft animated">
                    <img src="<%=path%>/assets/imgs/banner/banner_11.png">
                    <p>沙拉</p>
                </a>
                <a href="product.html?id=" class="img4 wow bounceInLeft animated">
                    <img src="<%=path%>/assets/imgs/banner/banner_12.png">
                    <p>竹炭卷</p>
                </a>
                <a href="product.html?id=" class="img5 wow bounceInLeft animated">
                    <img src="<%=path%>/assets/imgs/banner/banner_13.png">
                    <p>杂粮饭</p>
                </a>--%>

                <c:forEach items="${type.rows}" var="p" varStatus="index">
                    <c:if test="${index.index == 0}">
                        <a href="<%=path%>/web/product/list.do?type=${p.id}&title=${p.type}" class="img1 wow bounceInLeft animated">
                            <img src="${p.image}">
                            <p>${p.type}</p>
                        </a>
                    </c:if>

                    <c:if test="${index.index == 1}">
                        <a href="<%=path%>/web/product/list.do?type=${p.id}&title=${p.type}" class="img2 wow bounceInLeft animated">
                            <img src="${p.image}">
                            <p>${p.type}</p>
                        </a>
                    </c:if>

                    <c:if test="${index.index == 2}">
                        <a href="<%=path%>/web/product/list.do?type=${p.id}&title=${p.type}" class="img3 wow bounceInLeft animated">
                            <img src="${p.image}">
                            <p>${p.type}</p>
                        </a>
                    </c:if>

                    <c:if test="${index.index == 3}">
                        <a href="<%=path%>/web/product/list.do?type=${p.id}&title=${p.type}" class="img4 wow bounceInLeft animated">
                            <img src="${p.image}">
                            <p>${p.type}</p>
                        </a>
                    </c:if>

                    <c:if test="${index.index == 4}">
                        <a href="<%=path%>/web/product/list.do?type=${p.id}&title=${p.type}" class="img5 wow bounceInLeft animated">
                            <img src="${p.image}">
                            <p>${p.type}</p>
                        </a>
                    </c:if>
                </c:forEach>


            </div>
        </div>
        <!-- 新闻中心 -->
        <div class="new-center clearfix">
            <div class="wrap-l">
                <div>
                    <span></span>
                    <p>新闻中心</p>
                    <h5>
                        传播快捷时尚<br/>餐饮文化
                    </h5>
                    <a href="<%=path%>/web/news/media.do" class="btn clearfix">
                        探索更多
                <span>></span>
                    </a>
                </div>

                <%--<div class="img">
                    <img src="<%=path%>/assets/imgs/news/img_0.png">
                    <div>
                        <span>07-19</span>
                        <p>超能鹿战队有限公司</p>
                    </div>
                </div>--%>

                <c:forEach items="${news.rows}" var="n">
                    <div class="img">
                        <img src="${n.image}">
                        <div>
                            <span><fmt:formatDate pattern="yyyy-MM-dd"
                                                  value="${n.createTime}"/></span>
                            <p>${n.titile}</p>
                        </div>
                    </div>
                </c:forEach>

            </div>
            <div class="wrap-r clearfix">
                <p>
                    健康饮食，超能鹿战队传播!<br/>
                    超能鹿战队以此为使命，不断开拓进取，<br/>立志成为中国餐饮行业的一面靓丽旗帜。
        
                </p>
                <div class="inner-l">
                    <div>
                        <span></span>
                        <p>加盟代理</p>
                        <h5>
                            健康餐，新的<br/>潮流趋势
                        </h5>
                    </div>
                </div>
                <div class="inner-r">
                    <img src="<%=path%>/assets/imgs/index/shape-s-bg.png">
                    <div>
                        <a href="<%=path%>/web/league/index.do">
                            <img src="<%=path%>/assets/imgs/index/shape-s.png">
                        </a>
                        <a href="<%=path%>/web/league/index.do" style="width: 120px;">申请加盟</a>
                    </div>
                </div>
            </div>
        </div>
        <!-- 门店风采 -->
        <div class="store" style="">
            <img src="<%=path%>/assets/imgs/index/triangle.png">
            <div class="wrap clearfix">
                <div class="inner-l">
                    <span></span>
                    <p>门店风采</p>
                    <h5>
                        打造独具匠心的<br/>超能鹿战队风格
                    </h5>
                    <a href="<%=path%>/web/store/index.do" class="btn clearfix">
                        探索更多
                <span>></span>
                    </a>
                </div>
                <div class="inner-center">
                    <img src="<%=path%>/assets/imgs/index/store.png">
                </div>
                <div class="inner-center" style="display: none">
                    <img src="<%=path%>/assets/imgs/index/store.png">
                </div>
                <div class="inner-center" style="display: none">
                    <img src="<%=path%>/assets/imgs/index/store.png">
                </div>
                <div class="inner-center" style="display: none">
                    <img src="<%=path%>/assets/imgs/index/store.png">
                </div>
                <div class="inner-r">
                    <h5></h5>
                    <div>
                        <p>势头迅猛·加盟店开店数达百余家</p>
                        <p>特聘专业室内空间设计师，专人为您定制超能鹿战队风格店铺。</p>
                        <%--<p>超能鹿战队鸡排、超能鹿战队肉串、超能鹿战队鱿鱼、奶茶果饮为主打，产品涵盖</p>--%>
                        <%--<p>中西快餐、冷热饮品以及风味小吃等上百个品种。</p>--%>
                    </div>
                    <ul class="clearfix">
                        <li>
                            <span>
                                <img src="<%=path%>/assets/imgs/index/pront.png">
                            </span>
                            <p>01</p>
                        </li>
                        <li>
                            <span>
                                <img src="<%=path%>/assets/imgs/index/pront.png">
                            </span>
                            <p>02</p>
                        </li>
                        <li>
                            <span>
                                <img src="<%=path%>/assets/imgs/index/pront.png">
                            </span>
                            <p>03</p>
                        </li>
                        <li>
                            <span>
                                <img src="<%=path%>/assets/imgs/index/pront.png">
                            </span>
                            <p>04</p>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="pop-up">
            <img src="<%=path%>/assets/imgs/index/ewm-01.png">
        </div>
        <div id="foot">
            <jsp:include page="foot.jsp"/>
        </div>
        <!-- 视频播放框 -->
        <div class="video">
            <div class="iframe">
                <iframe width="100%" height="100%" frameborder="0" src="https://v.qq.com/txp/iframe/player.html?vid=u0868moh2vi" allowFullScreen="true"></iframe>
            </div>
        </div>
        
        
        <script type="text/javascript">
        	// $(function(){
        	// 	$('#head').load('head.jsp');
        	// 	/*$('#foot').load('foot.html');*/
        	// })
        </script>
    </body>

</html>
