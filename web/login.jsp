<%--
  Created by IntelliJ IDEA.
  User: xgl
  Date: 2019/9/8
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <meta lang="en">
  <title>登录页面</title>
  <script src="js/jquery-3.4.0.min.js"></script>
  <script>
    function loginf(form){
      $.post(
              form.action,
              {
                username:form.username.value,
                password:form.password.value
              },
              function(data){
                alert(data);
              }
      );
    }
  </script>
</head>
<body><%--
<form method="post" action= "./login1" name="login">
  <h1>用户登录</h1>
  用户名：<input type=text name='username'> <br>
  密码：<input type=password name='password'> <br>
  <input type="submit" name="cmdOK" value="提  交">  &nbsp;
  <input type="reset" name="cmdCancel" value="重  置">
</form>--%>
<form method="post" action= "./login2" name="login">
  <h1>用户登录</h1>
  用户名：<input type=text name='username'> <br>
  密码：<input type=password name='password'> <br>
  <input type="button" name="cmdOK" onclick="loginf(this.form);" value="提  交">  &nbsp;
  <input type="reset" name="cmdCancel" value="重  置">
</form>

</body>
</html>

