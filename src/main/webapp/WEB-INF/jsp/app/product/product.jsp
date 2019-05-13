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
        <title>${param.title}</title>
        <meta name="keywords" content=""/>
        <meta name="description" content=""/>
        <meta name="renderer" content="webkit">
        <meta http-equiv="x-ua-compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
        <link rel="stylesheet" href="<%=path%>/assets/css/animate.min.css">
		<link rel="stylesheet" href="<%=path%>/assets/css/idangerous.swiper.css"/>
		<link rel="stylesheet" href="<%=path%>/assets/css/common.css"/>
		<link rel="stylesheet" href="<%=path%>/assets/css/league.master.css"/>
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
<body>
    <!-- 头部 -->
    <div id="head">
        <jsp:include page="/web/index/head.do"/>
    </div>
    	
    <!-- 热销产品 -->
    <article class="hot-product">
        <div class="header">
            <div class="wrapper limitWidth-percentWidth">
                <span></span>
                <p>
                    <a href="<%=path%>/web/index/home.do">首页</a>
                    ><a href="javascript:;">超能鹿战队品牌</a>
                </p>
                <div>
                    <%--<h4>超能鹿战队手摇茶</h4>--%>
                    <h4>${param.title}</h4>
                    <h5></h5>
                </div>
            </div>
            <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
        </div>
        <section class="hot-product limitWidth-percentWidth clearfix">
            <div class="inner-l">
                <p>
                    ${param.title}<span>></span>
                </p>
                <ul></ul>
            </div>
            <div class="inner-r wode">
                <%--<a href="">
                    <img src="<%=path%>/assets/imgs/team/yl/yl_cjwtm.jpg" alt="">
                    <div>
                        <img src="<%=path%>/assets/imgs/detail/title.png" alt="">
                        <div>火龙诱惑</div>
                    </div>
                </a>
                <a href="">
                    <img src="<%=path%>/assets/imgs/team/yl/yl_hlqd.jpg" alt="">
                    <div>
                        <img src="<%=path%>/assets/imgs/detail/title.png" alt="">
                        <div>芭乐水果茶</div>
                    </div>
                </a>
                <a href="">
                    <img src="<%=path%>/assets/imgs/team/yl/yl_lzvc.jpg" alt="">
                    <div>
                        <img src="<%=path%>/assets/imgs/detail/title.png" alt="">
                        <div>芒果先生</div>
                    </div>
                </a>
                <a href="">
                    <img src="<%=path%>/assets/imgs/team/yl/yl_qdf.jpg" alt="">
                    <div>
                        <img src="" alt="">
                        <div>抹茶奶霜</div>
                    </div>
                </a>--%>

                <c:forEach items="${product.rows}" var="p">
                    <a href="<%=path%>/web/product/detail.do?id=${p.id}">
                        <img src="${p.image}" alt="">
                        <div>
                            <img src="<%=path%>/assets/imgs/detail/title.png" alt="">
                            <div>${p.name}</div>
                        </div>
                    </a>
                </c:forEach>
                <img src="<%=path%>/assets/imgs/detail/en.png">
            </div>
        </section>
        <div class="wrap-bottom">
            <p>
                <a href="javascript:;" class="more">
                    <img src="<%=path%>/assets/imgs/join-us/more.png">
                </a>
            </p>
        </div>
        <input type="hidden" id="tid" value="13">
        <img src="<%=path%>/assets/imgs/league/bg-line.png" class="left">
        <img src="<%=path%>/assets/imgs/detail/bg-right.png" class="right">
    </article>
    <div class="pop-up">
        <img src="<%=path%>/assets/imgs/index/ewm-01.png">
    </div>
	<div id="foot">
        <jsp:include page="/WEB-INF/jsp/app/foot.jsp"/>
    </div>
</body>
<script type="text/javascript">
    var stop = true;
    //触发开关，防止多次调用事件
    var page = 1;
    var tid = $('#tid').val();
    
   /* $(function(){
		$('#head').load('head.html');
		$('#foot').load('foot.html');
	})*/
    
    
/*    $(".more").click(function() {
        if (stop == true) {
            page = page + 1;
            stop = false;
            var url = "/Product/more";
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
