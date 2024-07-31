<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h1>EL 문법의 Scope 확인용 페이지</h1>

<h2>Request Scope</h2>
<p>${request}</p>
<p><%= request.getAttribute("request") %>
</p>

<h2>Session Scope</h2>
<p>${session}</p>

<h2>Application Scope</h2>
<p>${application}</p>

<h2>Page Scope</h2>
<%
    pageContext.setAttribute("page", "Page Scope 에 저장한 데이터");
%>
<p>${page}</p>
</body>
</html>