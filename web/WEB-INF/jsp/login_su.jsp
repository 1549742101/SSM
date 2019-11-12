<%--
  Created by IntelliJ IDEA.
  User: xgl
  Date: 2019/10/28
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
登录成功，${param.get("username")}欢迎您,您的密码是${param.get("password")}
登录成功，<%=request.getParameter("username")%>欢迎您,您的密码是<%=request.getParameter("password")%>
</body>
</html>
