<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
       <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <%@taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
WITHOUT JSTL 
<%
 String email = request.getParameter("email");
 if(email.startsWith("a") && email.endsWith("gmail.com") && email.contains("emp"))
 {%>
  
  <h1>VALID EMAIL</h1>
  <h3><%=email.toCharArray() %></h3>
  <h4><%=email.toLowerCase() %></h4>
 <%} %>
 
 --%>
 

  <%--WITH JSTL FUNCTION
 <c:set var="email" value="${param.email}"></c:set>
 <c:if test="${ fn:startsWith(email,'a') && fn:endsWith(email,'gmail.com') && fn:contains(email,'emp') }">
 <h1>VALID EMAIL</h1>
 <c:out value="${fn:toLowerCase(email)}"></c:out>
 <br>
 <br>
  <c:out value="${fn:toUpperCase(email)}"></c:out>
 </c:if>
 
 --%>
 
 <%-- JSTL NOT SELECT SQL --%>
 <sql:setDataSource 
 var="con"
 driver="com.mysql.cj.jdbc.Driver"
 user="root"
 password="Sachin(123)Jha"
 url="jdbc:mysql://localhost:3306?useSSL=false"
 />
 <%--- 
 
 <sql:update dataSource="${con}" var="row">
 insert into industrial.test(email) values(?)
 <sql:param value="${param.email}"></sql:param>
 </sql:update>
 
 <c:if test="${row==1 }">
 <h1> Data Inserted</h1>
 </c:if>
 
  --%>
  
  
  <sql:query var="rs" dataSource="${con }">
  select * from industrial.test;
  </sql:query>
  
  <c:forEach var="k" items="${rs.rows }">
  <c:out value="${k.id }"></c:out><br>
  <c:out value="${k.email }"></c:out><br>
  <c:out value="${k.create_at}"></c:out><br><br>
  </c:forEach>
</body>
</html>