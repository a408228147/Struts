<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/13
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <!-- 控制器会默认拦截名为.action的请求 除此之外什么都不写也可以-->
  <a href="${pageContext.request.contextPath}/hello.action">gangwen</a>
  <a href="${pageContext.request.contextPath}/hello">gangwen</a>

<%--修改后缀名之后 --%>
  <a href="${pageContext.request.contextPath}/hello.do">g123</a>
  <a href="${pageContext.request.contextPath}/hello.abc">gangwen</a>

<%--XXX.action  调用action  xxx必须与action中的name属性相同
  使用通配符，访问动作类和动作方法--%>
  <a href="${pageContext.request.contextPath}/addUser.action">添加用户</a>
  <a href="${pageContext.request.contextPath}/deleteUser.action">删除用户</a>

  <a href="${pageContext.request.contextPath}/add_User.action">添加用户</a>
  <a href="${pageContext.request.contextPath}/delete_User.action">删除用户</a>

  <%--动态方法调用
  动态名称！动作方法名称.action
动态名称！动作方法名称
  --%>
  <a href="${pageContext.request.contextPath}/user!addUser.action">添加用户</a>
  <a href="${pageContext.request.contextPath}/user!delete.action">删除用户</a>

  <a href="${pageContext.request.contextPath}/n2/action2.do">12312</a>
  </body>
</html>
