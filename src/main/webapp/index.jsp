<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tag" uri="/WEB-INF/tag/tag.tld"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <base href="<%=basePath%>">

    <title>正在跳转到--</title>
    <link href="favicon.ico" rel="SHORTCUT ICON" />
    <meta http-equiv=content-type content="text/html; charset=utf-8">

    <%--<meta http-equiv="refresh" content="2;url=<%=basePath%>login.do">--%>
    <meta http-equiv="refresh" content="2;url=<%=basePath%>web/index/home.do">
<%--    <style type=text/css>
        body {
            margin: 0px;
            font-size: 16px;
            font-family: 楷体,sans-serif;
            background-color: #cdd6dd;
        }
        #message {
            border: #386792 1px dotted;
            padding: 20px;
            margin: 200px auto;
            width: 400px;
            background-color: #fff;
            text-align: center
        }
        span{
            font-weight: bold;
        }
    </style>
</head>
<body>
<div id=message>
    <span>正在跳转到系统登陆界面...</span>
</div>--%>
</body>
</html>
