<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/13
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>动作方法调用</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/action3.do" method="post">
    用户名：<input type="text" name="username"/><br/>
    <input type="submit" value="xx"/>
</form>
<%--模型驱动--%>
<form action="${pageContext.request.contextPath}/action3.do" method="post">
    用户名：<input type="text" name="usermodel.username"/><br/>
    <input type="submit" value="xx"/>
</form>
</body>
</html>
