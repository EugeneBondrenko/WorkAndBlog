<%@ page import="workandblog.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Zhenya
  Date: 10.11.2017
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Get User By ID</title>

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


<% User user = (User) request.getAttribute("user");%>

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
    <tr>
        <td><%out.print(user.getId());%></td>


        <%--<% String url = "/getuserbyid/" + user.getId();%>--%>
        <%--<td><a href="<%out.print(url);%>"> <%out.print(user.getName());%></a> </td>--%>


        <td><%out.print(user.getName());%></td>
        <td><%out.print(user.getSurname());%></td>
        <td><%out.print(user.getEmail());%></td>
        <td><%out.print(user.getPassword());%></td>


        <% String url = "/user" + user.getId();%>
        <a href="<%out.print(url);%>"> <%out.print(user.getName());%></a>

    </tr>
</table>
</body>
</html>
