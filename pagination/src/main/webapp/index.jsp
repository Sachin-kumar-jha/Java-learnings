<%@page import="com.dao.Employee"%>
<%@page import="com.dao.Pagination"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--RECORDS  -->
<%
String getStart = request.getParameter("start");
int start = 0;
int pageSize =8; // number of records per page

if (getStart != null) {
    try {
        start = Integer.parseInt(getStart);
        if (start < 0) start = 0;
    } catch (NumberFormatException e) {
        start = 0;
    }
}

Pagination p = new Pagination();
int totalRecords = p.getTotalRecord();

List<Employee> list = p.read(start);

for(Employee e:list){
%>
  EID:<%=e.getEid() %><br>
  ENAME:<%=e.getEname()%><br>
  EAddress:<%=e.getEaddress() %><br>
  ESalary<%=e.getEsalary() %>

  <br><br>
<% 
start++;


}

int prevStart = start - pageSize;
if (prevStart < 0) prevStart = 0;

boolean hasNext = start< totalRecords;

%>

<div>
    <% if (start > 0) { %>
        <form action="index.jsp" method="post" style="display:inline;">
            <input type="hidden" name="start" value="<%= prevStart %>">
            <button type="submit">Prev</button>
        </form>
    <% } %>

    <% if (hasNext) { %>
        <form action="index.jsp" method="post" style="display:inline;">
            <input type="hidden" name="start" value="<%=start %>">
            <button type="submit">Next</button>
        </form>
    <% } %>
</div>
</body>
</html>