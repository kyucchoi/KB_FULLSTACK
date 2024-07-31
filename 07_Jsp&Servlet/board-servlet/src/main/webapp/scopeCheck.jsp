<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h1>SCOPE CHECK</h1>

<h2>Request Scope</h2>
<p>${request != null ? request : "없는데요"}</p>

<h2>Session Scope</h2>
<p>${session != null ? session : "없는데요"}</p>

<h2>Application Scope</h2>
<p>${application != null ? application : "없는데요"}</p>

<h2>Page Scope</h2>
<p>${page != null ? page : "없는데요"}</p>
</body>
</html>