<%--
  Created by IntelliJ IDEA.
  User: Bluerkangkang
  Date: 2023/10/20
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="HomeWork1Servlet.Information" %>
<html>
<head>
    <title>Detail</title>
</head>
<body>
<h1>Detail</h1>
<%
    Information information = (Information) request.getAttribute("information");
%>
<div>
    <p>name:<%=information.getName()%></p>
    <p>age:<%=information.getAge()%></p>
    <p>sex:<%=information.getSex()%></p>
    <p>hobby:<%=information.getHobby()%></p>
</div>
</body>
</html>
