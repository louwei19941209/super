<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>公司快讯</title>
    <meta name="keywords" content=""/>
    <meta name="description" content=""/>
    <meta name="renderer" content="webkit">
    <meta http-equiv="x-ua-compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
    <link rel="stylesheet" href="<%=path%>/assets/css/animate.min.css">
    <link rel="stylesheet" href="<%=path%>/assets/css/idangerous.swiper.css"/>
    <link rel="stylesheet" href="<%=path%>/assets/css/common.css"/>
    <link rel="stylesheet" href="<%=path%>/assets/css/league.master.css"/>
    <link rel="stylesheet" href="<%=path%>/assets/css/new.master.css"/>
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
<article>
    <div class="header">
        <div class="wrapper limitWidth-percentWidth">
            <span></span>
            <p>
                <a href="<%=path%>/web/index/home.do">首页</a>
                ><a href="javascript:;">新闻中心</a>
            </p>
            <div>
                <h4>公司快讯</h4>
                <h5>Company News</h5>
            </div>
        </div>
        <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
    </div>
    <div class="new limitWidth-percentWidth">
        <%--<div class="kv">
            <a href="">
                <img src="<%=path%>/assets/imgs/news/n_0.jpg" alt="">
            </a>
            <div>
                <span>
                    07-18<i></i>
                    2017
                </span>
                <p>[官方发布]超能鹿战队鸡排黄渤宣传片</p>
            </div>
            <img src="<%=path%>/assets/imgs/news/right-img.png" class="title-r" alt="">
        </div>--%>
        <%-- <div class="list clearfix wode">
             <div>
                 <div>
                     <img src="<%=path%>/assets/imgs/news/n_1.png" alt="">
                     <div>
                         <img src="<%=path%>/assets/imgs/news/hover.png" alt="">
                     </div>
                 </div>
                 <span>
                     05-12<i></i>
                     2017
                 </span>
                 <p>截止2018年5月10日超能鹿战队鸡排全国分店达到13955家！</p>
                 <a href="" class="btn clearfix">
                     探索更多
                 <span>&gt;</span>
                 </a>
             </div>
         </div>--%>

        <c:forEach items="${news.rows}" var="n">
            <div class="list clearfix wode">

                <div>
                    <div>
                        <img src="${n.image}" alt="">
                        <div>
                            <img src="<%=path%>/assets/imgs/news/hover.png" alt="">
                        </div>
                    </div>
                    <span>
                        <fmt:formatDate pattern="yyyy-MM-dd"
                                        value="${n.createTime}"/>
                            <i></i>

                    </span>
                    <p>${n.titile}</p>
                    <a href="<%=path%>/web/news/details?id=${n.id}" class="btn clearfix">
                        探索更多
                        <span>&gt;</span>
                    </a>
                </div>

            </div>
        </c:forEach>

    </div>
    <img src="<%=path%>/assets/imgs/news/bg1.png" class="left">
    <img src="<%=path%>/assets/imgs/news/bg2.png" class="right">
    <div class="wrap-bottom">
        <p>
            <a href="javascript:;" class="more">
                <img src="<%=path%>/assets/imgs/join-us/more.png">
            </a>
        </p>
    </div>
    <input type="hidden" id="tid" value="15">
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
    var stop = true;
    //触发开关，防止多次调用事件
    var page = 1;
    var tid = $('#tid').val();
    /*$(".more").click(function() {
        if (stop == true) {
            page = page + 1;
            stop = false;
            var url = "/news/more";
            $.post(url, {
                page: page,
                tid: tid
            }, function(data) {
                //这里显示从服务器返回的数据
                if (data.result) {
                    $(".wode").append(data.msg);
                    stop = true;
                } else {
                    alert(data.msg);
                }
            }, "json")
        }
    });*/
</script>
</html>
