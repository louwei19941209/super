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
        <title>运动员招募</title>
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
    <article class="join-us">
        <div class="header">
            <div class="wrapper limitWidth-percentWidth">
                <span></span>
                <p>
                    <a href="<%=path%>/web/index/home.do">首页</a>
                    ><a href="javascript:;">联系我们</a>
                </p>
                <div>
                    <h4>运动员招募</h4>
                    <h5>Talent recruitment</h5>
                </div>
            </div>
            <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
        </div>
        <section class="limitWidth-percentWidth">
            <div class="wrap-top clearfix">
                <div class="inner-l">
                    <img src="<%=path%>/assets/imgs/join-us/head-l.png" alt="">
                </div>
                <div class="inner-r">
                    <img src="<%=path%>/assets/imgs/join-us/head-r.png" alt="">
                </div>
                <img src="<%=path%>/assets/imgs/join-us/title-r.png" alt="">
            </div>
            <div class="wrap-center">
                <div class="title-header"></div>
                <div class="content">
                    <%--<div class="active">
                        <div class="content-h">
                            <h4>
                                门店扩展专员<span class="red">若干</span>
                                <span class="grey">\20-30岁</span>
                            </h4>
                            <span class="glyphicon glyphicon-chevron-up"></span>
                        </div>
                        <div class="content-w">
                            <h5>任职资格</h5>
                            <p>- 男、高中及以上学历，市场营销、企业管理等专业优先；</p>
                            <p>- 熟悉餐饮行业，做过市场推广，策划和拓展等优先考虑；</p>
                            <p>- 善于分析店里盈利前景，有很强的市场分析能力；</p>
                            <p>- 具备较强的公关能力；</p>
                            <p>- 有强烈的自我管理和时间管理能力，勤奋敬业，吃苦耐劳。</p>
                            <p>注：此职位为外派职位，工作地点在其它省市</p>
                            <h5>工资待遇</h5>
                            <p>- 底薪3380元+奖金3000元/店</p>
                            <p>- 拓展6个店底薪加400元</p>
                            <p>- 拓展10个店可以入股自己所拓展的门店</p>
                            <a href="" target="_blank">发送简历：XXXXXXXX@XXX.com</a>
                        </div>
                    </div>
                    <div>
                        <div class="content-h">
                            <h4>
                                财务会计<span class="red">数名</span>
                                <span class="grey">22-35岁</span>
                            </h4>
                            <span class="glyphicon glyphicon-chevron-up"></span>
                        </div>
                        <div class="content-w">
                            <p>
                                <span class="tit" style="margin: 0px; padding: 0px; display: block; line-height: 26px; color: rgb(51, 51, 51); font-weight: bold; font-family: &quot;Microsoft YaHei&quot;; font-size: 14px;">任职资格：</span>
                                <span style="color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; font-size: 14px;">专科以上学历，熟知各种办公软件，处理财务相关工作，具体请咨询人力资源部 贺经理：18017565575</span>
                            </p>
                            <a href="javascript:;">发送简历：37643855@qq.com</a>
                        </div>
                    </div>
                    <div>
                        <div class="content-h">
                            <h4>
                                加盟部督导<span class="red">数名</span>
                                <span class="grey">22-35岁</span>
                            </h4>
                            <span class="glyphicon glyphicon-chevron-up"></span>
                        </div>
                        <div class="content-w">
                            <p>
                                <span style=";padding: 0px;display: block;line-height: 26px;color: rgb(51, 51, 51);font-weight: bold;font-family: &#39;Microsoft YaHei&#39;;font-size: 14px;">任职资格：</span>
                            </p>
                            <p style="margin-top: 10px;margin-bottom: 0px;padding: 0px;font-size: 13px;line-height: 30px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;white-space: normal;">
                                <strong style=";padding: 0px">
                                    <span style=";padding: 0px;font-size: 16px">加盟部督导</span>
                                </strong>
                            </p>
                            <p style="margin-top: 10px;margin-bottom: 0px;padding: 0px;font-size: 13px;line-height: 30px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;white-space: normal;">要求：男、20-25岁，大专及以上学历，工作认真负责
</p>
                            <p style="margin-top: 10px;margin-bottom: 0px;padding: 0px;font-size: 13px;line-height: 30px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;white-space: normal;">岗位职责：
</p>
                            <p style="margin-top: 0;margin-bottom: 0;padding: 0px;font-size: 13px;line-height: 30px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;white-space: normal;">1、&nbsp;对公司加盟店培训产品知识、产品操作、门店管理运营等，辅助加盟店正常开业；&nbsp;</p>
                            <p style="margin-top: 0;margin-bottom: 0;padding: 0px;font-size: 13px;line-height: 30px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;white-space: normal;">2、&nbsp;对所管理的加盟店走访，对门店运营管理和产品操作、监督；&nbsp;</p>
                            <p style="margin-top: 0;margin-bottom: 0;padding: 0px;font-size: 13px;line-height: 30px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;white-space: normal;">3、&nbsp;对所管理的加盟商进行选址评估并提供各方面的意见；
</p>
                            <p style="margin-top: 0;margin-bottom: 0;padding: 0px;font-size: 13px;line-height: 30px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;white-space: normal;">4、&nbsp;负责做好客户服务工作，产品质量的方面的反馈信息；&nbsp;</p>
                            <p style="margin-top: 0;margin-bottom: 0;padding: 0px;font-size: 13px;line-height: 30px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;white-space: normal;">5、&nbsp;负责为客户促销活动提供方案策划等支持；
</p>
                            <p style="margin-top: 10px;margin-bottom: 0px;padding: 0px;font-size: 13px;line-height: 30px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;white-space: normal;">薪资：底薪+提成+年终奖+餐补，综合可达6000-7000
</p>
                            <p style="margin-top: 10px;margin-bottom: 0px;padding: 0px;font-size: 13px;line-height: 30px;color: rgb(102, 102, 102);font-family: &#39;Microsoft YaHei&#39;;white-space: normal;">长期发展可以入股公司门店
</p>
                            <p>
                                <br/>
                            </p>
                            <a href="javascript:;">发送简历：37643855@qq.com</a>
                        </div>
                    </div>
                    <div>
                        <div class="content-h">
                            <h4>
                                文员<span class="red">数名</span>
                                <span class="grey">22-35岁</span>
                            </h4>
                            <span class="glyphicon glyphicon-chevron-up"></span>
                        </div>
                        <div class="content-w">
                            <p>
                                <span class="tit" style="margin: 0px; padding: 0px; display: block; line-height: 26px; color: rgb(51, 51, 51); font-weight: bold; font-family: &quot;Microsoft YaHei&quot;; font-size: 14px; ">任职资格：</span>
                            </p>
                            <p style="margin-top: 10px; margin-bottom: 0px; padding: 0px; font-size: 13px; line-height: 30px; color: rgb(102, 102, 102); font-family: &quot;Microsoft YaHei&quot;; white-space: normal; ">办公室文员；具体工作内容可咨询 贺经理18017565575
</p>
                            <p>
                                <br/>
                            </p>
                            <a href="javascript:;">发送简历：37643855@qq.com</a>
                        </div>
                    </div>--%>


                    <c:forEach items="${recruitment.rows}" var="r" varStatus="index">
                        <c:choose>
                            <c:when test="${index.index == 0}">
                                <div class="active">
                                    <div class="content-h">
                                        <h4>
                                            ${r.position}<span class="red">${r.number}</span>
                                            <span class="grey">${r.restricts}</span>
                                        </h4>
                                        <span class="glyphicon glyphicon-chevron-up"></span>
                                    </div>
                                    <div class="content-w">
                                        <h5>任职资格</h5>
                                        <p>${r.qualifications}</p>
                                        <%--<h5>工资待遇</h5>--%>
                                        <%--<p>${r.treatment}</p>--%>
                                        <a href="javascript:;" target="_blank">${r.resume}</a>
                                    </div>
                                </div>
                            </c:when>
                            <c:otherwise>
                                <div>
                                    <div class="content-h">
                                        <h4>
                                            ${r.position}<span class="red">${r.number}</span>
                                            <span class="grey">${r.restricts}</span>
                                        </h4>
                                        <span class="glyphicon glyphicon-chevron-up"></span>
                                    </div>
                                    <div class="content-w">
                                        <h5>任职资格</h5>
                                        <p>${r.qualifications}</p>
                                        <h5>工资待遇</h5>
                                        <p>${r.treatment}</p>
                                        <a href="javascript:;" target="_blank">${r.resume}</a>
                                    </div>
                                </div>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>

                </div>
            </div>
            <!--<div class="wrap-bottom">
            <p><a href="javascript:;"><img src="/assets/web/images/join-us/more.png"></a></p>
        </div>-->
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
