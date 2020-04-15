<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
    <title><spring:message code="title"></spring:message></title>
</head>
<body>
<span style="float: right">
    <a href="?locale=en">en</a>
    |
    <a href="?locale=ru">ru</a>
    </span>
<h1 style="text-align: center"><spring:message code="h1"></spring:message></h1>
<hr color="red">
<table class="table">
    <tbody>
    <tr>
        <th><b><spring:message code="name"></spring:message> </b></th>
        <th><b><spring:message code="model"></spring:message> </b></th>
        <th><b><spring:message code="price"></spring:message></b></th>
        <th><b><spring:message code="year"></spring:message></b></th>
    </tr>
    <c:forEach var="car" items="${cars}">
        <tr>
            <td>${car.getName()}</td>
            <td>${car.getModel()}</td>
            <td>${car.getPrice()}</td>
            <td>${car.getYear()}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
