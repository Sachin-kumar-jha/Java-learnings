<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
JSTL CORE
<c:set var="myvar" value="${10}"></c:set>
<c:out value="${myvar}"></c:out>
<c:choose>
<c:when test="${myvar>200}">
<h1>ABCD</h1>
</c:when>
<c:when test="${myvar<200}">
<h1>SACHIN</h1>
</c:when>
<c:otherwise>
<h1>NO OTHER</h1>
</c:otherwise>
</c:choose>

<c:if test="${myvar<=10 }">
<h1>HELLO</h1>
</c:if>

<c:forEach var="i" begin="1" end="5">
<h1>HY THERE</h1>
</c:forEach> --%>

<%--JSTL FUNCTION --%>
<form action="home.jsp" method="post">
<input type="text" name="email" placeholder="enter email">
<button>Send</button>
</form>

</body>
</html>