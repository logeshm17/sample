<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
 <!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<h2>nan html tag</h2>
<%
out.println("Welcome to jsp");
%>
<sql:setDataSource var="log" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/products" user="root" password="29-Aug-02"/>
<sql:query var="rs" dataSource="${log}">select * from food</sql:query>

<c:forEach items="${rs.rows}" var="food">
             <c:out value="${food.item }"></c:out> :   <c:out value="${food.price }"></c:out> 
</c:forEach>
</body>
</html>
