<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<footer>
    <div class="top">
        <ul class="clearfix">
            <li>
                <a href="<%=path%>/web/companyProfile/about.do">超能鹿战队</a>
            </li>
            <li>
                <a href="<%=path%>/web/product/index.do">餐品展示</a>
            </li>
            <li class="logo">
                <a href="">
                    <img src="<%=path%>/assets/imgs/common/logo.png">
                </a>
            </li>
            <li>
                <a href="<%=path%>/web/process/index.do">招商加盟</a>
            </li>
            <li>
                <a href="<%=path%>/web/contact/index.do">联系我们</a>
            </li>
        </ul>
    </div>
    <div class="bottom clearfix">
        <div class="inner-l">
            <h5>Copyright ©2015-2018   超能鹿战队集团有限公司版权所有 </h5>
            <%--<a href="">
                <h5>
                    沪ICP备14023416号-2 <img onclick="location.href='" src="<%=path%>/assets/imgs/common/19.png">
                </h5>
            </a>--%>
            <a href="" target="_black">Powered by MANRO</a>
        </div>
        <div class="inner-c">
           <%-- <a href="" target="_black">
                <img src="<%=path%>/assets/imgs/common/sina.png">
            </a>
            <a class="wechat">
                <img src="<%=path%>/assets/imgs/common/wechat.png">
            </a>--%>
        </div>
        <div class="inner-r">
            <p>全国加盟热线</p>
            <p>400-800-6867</p>
        </div>
    </div>
</footer>