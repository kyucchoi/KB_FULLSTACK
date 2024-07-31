<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <title>Insert title here</title>
</head>
<body>
<h1>scope 데이터 보기</h1>

pageScope 의 속성값은 : ${pageScope.scopeName}<br>
requestScope 의 속성값은 : ${requestScope.scopeName}<br>
sessionScope 의 속성값은 : ${sessionScope.scopeName}<br>
applicationScope 의 속성 값은 : ${applicationScope.scopeName}<br>

scopeName 자동 찾기 : ${scopeName}<br>
member : ${member.name}(${member.userid})<br>
</body>
</html>