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
        <title>优秀加盟商</title>
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
    <article class="out-franchisees">
        <div class="header">
            <div class="wrapper limitWidth-percentWidth">
                <span></span>
                <p>
                    <a href="<%=path%>/web/index/home.do">首页</a>
                    ><a href="javascript:;">招商加盟</a>
                </p>
                <div>
                    <h4>优秀加盟商</h4>
                    <h5>Outstanding franchisees</h5>
                </div>
            </div>
            <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
        </div>
        <section class="limitWidth-percentWidth">
            <div class="wrap-center">

               <%-- <div class="clearfix">
                    <div class="inner-l pull-right">
                        <img src="<%=path%>/assets/imgs/business/taxi.jpg" alt="">
                        <div>
                            <img src="<%=path%>/assets/imgs/news/hover.png" alt="">
                        </div>
                    </div>
                    <div class="inner-r">
                        <div>
                            <h5>
                                超能鹿战队专访<一>
                            </h5>
                            <h4>超能鹿战队离职店长的加盟故事</h4>
                            <p>【专访人物】：梁磊</p>
                            <p>【人物描述】：一个潜心学习，始终如一追求梦想的年轻创业者</p>
                            <p>【人物身份】：前超能鹿战队分店店长、现超能鹿战队物美店（加盟店）老板</p>
                            <a href="" class="btn clearfix">
                                探索更多
                                    <span>&gt;</span>
                            </a>
                        </div>
                    </div>
                </div>
                <div class="clearfix">
                    <div class="inner-l ">
                        <img src="<%=path%>/assets/imgs/business/taxi.jpg" alt="">
                        <div>
                            <img src="<%=path%>/assets/imgs/news/hover.png" alt="">
                        </div>
                    </div>
                    <div class="inner-r">
                        <div>
                            <h5>
                                超能鹿战队专访<二>
                            </h5>
                            <h4>超能鹿战队离职店长的加盟故事</h4>
                            <p>【专访人物】：梁磊</p>
                            <p>【人物描述】：一个潜心学习，始终如一追求梦想的年轻创业者</p>
                            <p>【人物身份】：前超能鹿战队分店店长、现超能鹿战队物美店（加盟店）老板</p>
                            <a href="" class="btn clearfix">
                                探索更多
                                    <span>&gt;</span>
                            </a>
                        </div>
                    </div>
                </div>
                <div class="clearfix">
                    <div class="inner-l pull-right">
                        <img src="<%=path%>/assets/imgs/business/taxi.jpg" alt="">
                        <div>
                            <img src="<%=path%>/assets/imgs/news/hover.png" alt="">
                        </div>
                    </div>
                    <div class="inner-r">
                        <div>
                            <h5>
                                超能鹿战队专访<三>
                            </h5>
                            <h4>超能鹿战队离职店长的加盟故事</h4>
                            <p>【专访人物】：梁磊</p>
                            <p>【人物描述】：一个潜心学习，始终如一追求梦想的年轻创业者</p>
                            <p>【人物身份】：前超能鹿战队分店店长、现超能鹿战队物美店（加盟店）老板</p>
                            <a href="" class="btn clearfix">
                                探索更多
                                    <span>&gt;</span>
                            </a>
                        </div>
                    </div>
                </div>
                <div class="clearfix">
                    <div class="inner-l ">
                        <img src="<%=path%>/assets/imgs/business/taxi.jpg" alt="">
                        <div>
                            <img src="<%=path%>/assets/imgs/news/hover.png" alt="">
                        </div>
                    </div>
                    <div class="inner-r">
                        <div>
                            <h5>
                                超能鹿战队专访<四>
                            </h5>
                            <h4>超能鹿战队离职店长的加盟故事</h4>
                            <p>【专访人物】：梁磊</p>
                            <p>【人物描述】：一个潜心学习，始终如一追求梦想的年轻创业者</p>
                            <p>【人物身份】：前超能鹿战队分店店长、现超能鹿战队物美店（加盟店）老板</p>
                            <a href="" class="btn clearfix">
                                探索更多
                                    <span>&gt;</span>
                            </a>
                        </div>
                    </div>
                </div>--%>


                <c:forEach items="${franchisee.rows}" var="f" varStatus="index">
                    <c:choose>
                        <c:when test="${index.index%2 == 0}">
                            <div class="clearfix">
                                <div class="inner-l pull-right">
                                    <img src="${f.image}" alt="">
                                    <div>
                                        <img src="<%=path%>/assets/imgs/news/hover.png" alt="">
                                    </div>
                                </div>
                                <div class="inner-r">
                                    <div>
                                        <h5>
                                            超能专访
                                        </h5>
                                        <h4>${f.title}</h4>
                                        <p>【专访人物】：${f.characters}</p>
                                        <p>【人物描述】：${f.description}</p>
                                        <p>【人物身份】：${f.identity}</p>
                                        <a href="<%=path%>/web/excellent/detail.do?id=${f.id}" class="btn clearfix">
                                            探索更多
                                            <span>&gt;</span>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </c:when>
                        <c:otherwise>
                            <div class="clearfix">
                                <div class="inner-l ">
                                    <img src="${f.image}" alt="">
                                    <div>
                                        <img src="<%=path%>/assets/imgs/news/hover.png" alt="">
                                    </div>
                                </div>
                                <div class="inner-r">
                                    <div>
                                        <h5>
                                            超能专访
                                        </h5>
                                        <h4>${f.title}</h4>
                                        <p>【专访人物】：${f.characters}</p>
                                        <p>【人物描述】：${f.description}</p>
                                        <p>【人物身份】：${f.identity}</p>
                                        <a href="<%=path%>/web/excellent/detail.do?id=${f.id}" class="btn clearfix">
                                            探索更多
                                            <span>&gt;</span>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </div>
            <div class="wrap-bottom">
                <p>
                    <a href="javascript:;" class="more">
                        <img src="<%=path%>/assets/imgs/join-us/more.png">
                    </a>
                </p>
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
<script type="text/javascript">
    var stop = true;
    //触发开关，防止多次调用事件
    var page = 1;
    /*$(".more").click(function() {
        if (stop == true) {
            page = page + 1;
            stop = false;
            var url = "/about/more";
            $.post(url, {
                page: page
            }, function(data) {
                //这里显示从服务器返回的数据
                if (data.result) {
                    $(".wrap-center").append(data.msg);
                    stop = true;
                } else {
                    alert(data.msg);
                }
            }, "json")
        }
    });*/
</script>
</html>
