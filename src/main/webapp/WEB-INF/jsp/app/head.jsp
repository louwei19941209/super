<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<header class="clearfix setHeight">
    <nav>
        <ul>
            <li>
                <a href="<%=path%>/web/index/home.do">首页</a>
            </li>
            <li>
                <a href="javascript:;">超能鹿战队</a>
                <ul>
                    <a href="<%=path%>/web/companyProfile/about.do">集团简介</a>
                </ul>
                <ul>
                    <a href="<%=path%>/web/companyCulture/culture.do">企业文化</a>
                </ul>
                <ul>
                    <a href="<%=path%>/web/develop/develop.do">发展历程</a>
                </ul>
                <ul>
                    <a href="<%=path%>/web/honor/index.do">企业荣誉</a>
                </ul>
                <ul>
                    <a href="<%=path%>/web/founder/index.do">创始人介绍</a>
                </ul>
                <ul>
                    <a href="<%=path%>/web/team/index.do">运动员团队</a>
                </ul>
            </li>
            <li>
                <a href="javascript:;">产品介绍</a>
                <%--<ul>
                    <a href="product.html">超级维他命</a>

                </ul>--%>
               <%-- <c:forEach items="${type.rows}" var="t">
                    <ul>
                        <a href="<%=path%>/web/product/list.do?type=${t.id}&title=${t.type}">${t.type}</a>
                    </ul>
                </c:forEach>--%>
                <ul>
                    <a href="<%=path%>/web/product/index.do">产品展示</a>
                </ul>
                <ul>
                    <a href="<%=path%>/web/idea/index.do">产品理念</a>
                </ul>
            </li>
            <li>
                <a href="javascript:;">IFBB战略合作</a>
                <ul>
                    <a href="<%=path%>/web/ifbb/team/index.do">IFBB营养师团队</a>
                    <a href="<%=path%>/web/ifbb/strategy/index.do">IFBB中体国职战略合作</a>
                </ul>

            </li>
            <li>
                <a href="javascript:;">优势保障</a>
                <ul>
                    <a href="<%=path%>/web/coreCompetence/core.do">核心竞争力</a>
                </ul>
                <ul>
                    <a href="<%=path%>/web/prospect/detail.do">项目前景优势</a>
                </ul>
                <ul>
                    <a href="<%=path%>/web/after/index.do">售后保障体系</a>
                </ul>
            </li>
            <li>
                <a href="javascript:;">新闻中心</a>
                <ul>
                    <a href="<%=path%>/web/news/news.do">公司快讯</a>
                </ul>
                <ul>
                    <a href="<%=path%>/web/news/media.do">媒体报道</a>
                </ul>
                <ul>
                    <a href="<%=path%>/web/style/index.do">企业风采</a>
                </ul>
            </li>
            <li>
                <a href="javascript:;">联系我们</a>
                <ul>
                    <a href="<%=path%>/web/contact/index.do">联系方式</a>
                </ul>
                <ul>
                    <a href="<%=path%>/web/job/index.do">运动员招募</a>
                </ul>
            </li>
            <li>
                <a href="javascript:;">招商加盟</a>
                <ul>
                    <%--<a href="<%=path%>/web/process/index.do">加盟流程</a>--%>
                    <a href="<%=path%>/web/jiameng/index.do">加盟流程</a>
                </ul>
                <%--<ul>
                    <a href="<%=path%>/web/market/index.do">市场分析</a>
                </ul>--%>
                <ul>
                    <a href="<%=path%>/web/excellent/index.do">优秀加盟商</a>
                </ul>
                <ul>
                    <a href="<%=path%>/web/store/index.do">门店风采</a>
                </ul>
            </li>
        </ul>
        <%--<div class="sreach">
            <input type="text" id="searchss2">
            <a href="javascript:;" id="searchss1">
                <img src="<%=path%>/assets/imgs/common/sreach.png" alt="">
            </a>
        </div>--%>
    </nav>
    <div class="header-r">
        <a href="<%=path%>/web/index/home.do">
            <img src="<%=path%>/assets/imgs/common/logo.png">
        </a>
        <div>
            <div>
                <span class="first"></span>
                <span class="second"></span>
                <span class="third"></span>
                <img src="<%=path%>/assets/imgs/common/error.png" alt="">
                <p>菜单</p>
            </div>
        </div>
    </div>
</header>
<script type="text/javascript">
    $('.header-r >div').on('click', function () {
        if ($("header nav").is(":hidden")) {
            $('header nav').css('display', 'block');
            $('header nav').animate({
                'left': '0px'
            })
            $('.header-r').animate({
                'left': '300px'
            })
            $('body').animate({
                'left': '275px'
            });
            $('header>div>div div span').css('display', 'none');
            $('header>div>div div>img').css('display', 'block');
        } else {
            $('header nav').css('display', 'none');
            $('header nav').animate({
                'left': '-275px'
            })
            $('.header-r').animate({
                'left': '0'
            })
            $('body').animate({
                'left': '0'
            });
            $('header>div>div div span').css('display', 'block');
            $('header>div>div div>img').css('display', 'none');
        }
    });
    // 头部展开
    $('header nav>ul>li').on('click', function (event) {
        if ($(this).hasClass('active')) {
            $(this).removeClass('active');
        } else {
            $('header nav>ul>li.active').removeClass('active');
            $(this).addClass('active');

        }
    });


    $('#searchss1').on('click', function () {
        var k = $('#searchss2').val();
        if (k == '') {
            alert('请输入关键字进行搜索！');
            return false;
        } else {
            window.location.href = '' + k;
        }
    });
    $('#searchss2').bind('keypress', function (event) {
        if (event.keyCode == "13") {
            var k = $('#searchss2').val();
            if (k == '') {
                alert('请输入关键字进行搜索！');
                return false;
            } else {
                window.location.href = '' + k;
            }
            return false;
        }
    });


</script>
        