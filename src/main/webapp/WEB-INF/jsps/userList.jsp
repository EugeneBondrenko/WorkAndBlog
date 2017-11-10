<%@ page import="java.util.ArrayList" %>
<%@ page import="workandblog.entity.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users List</title>
    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }

        .tg .tg-4eph {
            background-color: #f9f9f9
        }
    </style>
</head>
<body>

<br>
<br>
<br>


<h1>User List</h1>

<c:if test="${!empty listUsers}">
    <table class="tg">
        <tr>
            <th width="60">ID</th>
            <th width="100">Name</th>
            <th width="100">Surname</th>
            <th width="100">@mail</th>
            <th width="100">password</th>
            <th width="100">Contacts</th>
            <th width="100">Delete</th>
        </tr>
        <c:forEach items="${listUsers}" var="user">
            <tr>
                <td>${user.id}</td>
                <td><a href="/user ${user.id}">${user.name}</a> </td>
                <td>${user.surname}</td>
                <td>${user.email}</td>
                <td>${user.password}</td>
                <%--<td>${user.compass}</td>--%>
                <%--<td><a href=" <c:url value='/edit ${user.id}'/>"> Edit </a> </td>--%>
                <td><a href=" <c:url value='/contact ${user.id}'/>"> Contacts </a> </td>
                <td><a href="<c:url value='/remove ${user.id}'/>" > Delete </a> </td>
                <%--&lt;%&ndash;%>
                    <%--String url = "/contact/" + id;--%>
                <%--%>--%>
                <%--<td><a href="<%out.print(url);%>"> Contacts </a> </td>--%>

            </tr>
        </c:forEach>
    </table>

    <a href="/remove"> Стартовая страницаа </a><br>
    <h3>Тестовые ссылки</h3><br>

</c:if>







</body>
</html>
