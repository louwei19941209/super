<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>Spring国际化测试</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

</head>

<body>
<form action="">
    <table border="0" cellspacing="0">
        <tr><th colspan="2"><spring:message code="title"></spring:message></th></tr>
        <tr>
            <td><spring:message code="userName"></spring:message></td>
            <td><input type="text" name="uname"></td>
        </tr>
        <tr>
            <td><spring:message code="password"></spring:message></td>
            <td><input type="text" name="pwd"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="<spring:message code="login"></spring:message>">
                <input type="button" value="<spring:message code="register"></spring:message>">
            </td>
        </tr>

    </table>
</form>
</body>
</html>