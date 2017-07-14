<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/14
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="post">
    user:<input type="text" name="user"/><br/>
    password:<input type="password" name="password"><br/>
    验证码:<input type="text" name="valicateCode"/>
    <img src="${pageContext.request.contextPath}/captchaAction.do" >
    <input type="submit" value="登入">
</form>
</body>
</html>
