<%@ page import="java.rmi.RemoteException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="error.jsp" %>
<%
    // 에러를 발생
    throw new RemoteException("테스트 예외 발생");
%>