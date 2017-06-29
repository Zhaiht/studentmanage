<%--
  Created by IntelliJ IDEA.
  User: zhaihuitao
  Date: 17/6/18
  Time: 下午11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="user" class="com.zhaihuitao.student.entity.User"></jsp:useBean>
<jsp:useBean id="userDao" class="com.zhaihuitao.student.dao.UserDao"></jsp:useBean>
<jsp:setProperty name="user" property="*" />
<%
    out.print(user.getUsername());
    %>
</body>
</html>
