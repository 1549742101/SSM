<%--
  Created by IntelliJ IDEA.
  User: xgl
  Date: 2019/11/4
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
<form action="upload1" method="POST" enctype="multipart/form-data">
    文件: <input type="file" name="file"/>
    备注: <input type="text" name="filename"/>
    <input type="submit" value="上传"/>
</form>
</body>
</html>
