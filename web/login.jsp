<%--
  Created by IntelliJ IDEA.
  User: zhaihuitao
  Date: 17/6/9
  Time: 下午9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>

    <link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
<form action="validate.jsp" method="post">
    <div class="login_m">
        <div class="login_logo">
        <img src="img/logo.png" width="220" height="50">
        </div>
        <div class="login_border">
        <input type="text" name="usename" class="txt_input txt_input2">
        <input type="password" name="password" class="txt_input txt_input2">
        <input type="submit" value="登录" class="login_button">
        </div>
    </div>
</form>
</body>
</html>
