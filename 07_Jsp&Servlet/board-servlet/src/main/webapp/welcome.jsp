<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-29
  Time: 오후 4:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<%@ include file="header.jsp" %>

<h1>로그인 성공!</h1>
<h2>환영합니다! <%= session.getAttribute("username") %>
</h2>
<h2>환영합니다! ${username}</h2>
</body>
</html>
