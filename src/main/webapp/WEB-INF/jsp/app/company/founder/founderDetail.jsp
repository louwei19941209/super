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
        <title>创始人</title>
        <meta name="keywords" content=""/>
        <meta name="description" content=""/>
        <meta name="renderer" content="webkit">
        <meta http-equiv="x-ua-compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
        <!-- <link rel="stylesheet" href="/assets/web/js/vendor/wow/animate.min.css"></script> -->
        <link rel="stylesheet" href="<%=path%>/assets/css/idangerous.swiper.css"/>
        <link rel="stylesheet" href="<%=path%>/assets/css/common.css"/>
        <link rel="stylesheet" href="<%=path%>/assets/css/league.master.css"/>
        <script type="text/javascript" src="<%=path%>/assets/js/jquery-1.10.2.min.js"></script>
        <!-- <script type="text/javascript" src="/assets/web/js/vendor/wow/wow.min.js"></script> -->
        <script type="text/javascript" src="<%=path%>/assets/js/idangerous.swiper.min.js"></script>
        <!--<script type="text/javascript" src='js/index.js'></script>-->
        <script type="text/javascript" src='<%=path%>/assets/js/common.js'></script>
        <!--[if lte IE 9]>
    <!--<script type="text/javascript" src="/assets/web/js/vendor/respond.min.js"></script>-->
    <![endif]-->
    
    	<style type="text/css">
    		.new-detail .list-wrap .inner {
			    padding: 0;
			}
			.article_part {
			    width: 100%;
			    padding: 30px 3%;
			}
    		.left_words,.right_img{
    			display: inline-block;
    			width: 46%;
    		}
    		.left_words{
    			float: left;
    			font-size: 20px;
			    color: #333;
    		}
    		.right_img{
    			float: right;
    		}
    		.left_words p{
    			margin-bottom: 30px;
    		}
			.right_img img{
				max-width: 100%;
				text-align: right;
				vertical-align: middle;
			}
			.article_part > h4 {
			    margin: 10px 0 60px;
			    color: #007854;
			    font-size: 28px;
			    text-align: center;
			}
			.artical_content {
			    float: left;
			    margin: 20px 0 50px 0;
			    font-size: 18px;
			    color: #333;
			}
			.artical_content p{
				line-height: 30px;
				text-indent:35px;
				margin: 0 0 10px 0;
			}
    	</style>
    </head>
    <body style="background: #f8f8f8;">
        <!-- 头部 -->
        <div id="head">
            <jsp:include page="/web/index/head.do"/>
        </div>
        <!-- 热销产品 -->
        <article class="hot-product new-detail">
            <div class="header">
                <div class="wrapper limitWidth-percentWidth">
                    <span></span>
                    <p>
                        <a href="<%=path%>/web/index/home.do">首页</a>
                        ><a href="<%=path%>/web/founder/index.do">创始人</a>
                        ><a href="javascript:;">${founder.name}</a>
                    </p>
                    <div>
                        <h4>创始人</h4>
                    </div>
                </div>
                <img src="<%=path%>/assets/imgs/detail/d-header.png" alt="">
            </div>
            <div class="list-wrap clearfix limitWidth-percentWidth">
                <a href="<%=path%>/web/founder/index.do">
                    <span>
                        <img src="<%=path%>/assets/imgs/detail/return.png" alt="">
                    </span>返回
                </a>
                <div class="inner inner-r">
                	
                	<!--专访 文章部分-->
                	<div class="article_part">
                		<h4>创始人介绍</h4>
                		<div class="left_words">
                			<p class="left_words_zfrw">【创始人】:${founder.name}</p>
                			<p class="left_words_rwms"><%--【人物描述】:--%>${founder.biography}</p>
                			<%--<p class="left_words_rwsf">【人物身份】:前超能鹿战队分店店长、现超能鹿战 队（加盟店）老板</p>--%>
                		</div>
                		<div class="right_img">
                			<img src="${founder.image}"/>
                		</div>
                		<div class="artical_content">
                			<%--<p>${team.biography}</p>--%>
                			<%--<p>习近平说，中缅“胞波”情谊源远流长。当前，中缅关系总体向好发展，各领域、各层次交流合作不断扩大，共建“一带一路”合作取得新进展。中方高度重视中缅关系，不管国际风云如何变幻，愿一如既往同缅方加强战略沟通，深化互利合作，不断丰富中缅全面战略合作伙伴关系内涵，给两国人民带来更多实实在在的利益，共同为地区稳定和繁荣作出贡献。</p>
                			<p>习近平说，中方支持缅国内和平进程，关注缅北形势发展，希望缅方同中方相向而行，进一步强化边境管理，共同维护边境安全稳定。</p>
                			<p>敏昂莱衷心感谢习近平主席拨冗会见。他说，缅中两国有着悠久的传统友谊，两国两军关系始终保持良好发展。缅方感谢中方长期以来对缅国家和军队发展建设给予的宝贵支持，感谢中方支持缅国内和平进程。缅方欢迎、支持并愿积极参与“一带一路”建设，加强与中方各领域务实合作，采取切实措施维护缅中边境地区稳定。</p>--%>
                		</div>
                	</div>
                	
                </div>
            </div>
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
