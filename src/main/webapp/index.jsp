<%--
  Created by IntelliJ IDEA.
  User: 36214
  Date: 2018/3/13
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成绩分析系统</title>
</head>
<body>
    <form action="user_login.action" method="post">
        <input type="text" name="user.username" placeholder="输入用户名" />
        <br/>
        <input type="password" name="user.password" placeholder="输入密码" />
        <br />
        <input type="submit" value="登录">
        <input type="reset" value="重置">
    </form>
</body>
</html>
