<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="./resources/css/bootstrap.css">
    <link rel="stylesheet" href="./components/header.css">
    <link rel="stylesheet" href="./root.css">
</head>

<body>
<%@include file="components/header.jsp"%>
<c:forEach var="i" begin="1" end="5" step="1">
    <p>${i} - FIAP</p>
</c:forEach>
</body>
</html>