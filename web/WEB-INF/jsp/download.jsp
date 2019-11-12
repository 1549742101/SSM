<%--
  Created by IntelliJ IDEA.
  User: xgl
  Date: 2019/11/11
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>下载文件</title>
</head>
<body>
<h1>文件${requestScope.filename}上传成功！</h1>
需要时可以<a href="/SSM/download?filename=${requestScope.filename}">下载</a>该文件
</body>
</html>
