<%@ page import="java.util.ArrayList" %>
<%@ page import="workandblog.entity.User" %>
<%@ page import="java.util.List" %>
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

        <%
            List<User> userList = (List<User>) request.getAttribute("userList");

            for(User user : userList){

                String goToUserInfoLink = "/get-user/" + user.getId() + "/";
                String goToEditUserLink = "/edit-user/" + user.getId() + "/";
        %>
                <tr>
                    <td><%out.print(user.getId());%></td>
                    <td><a href="<%out.print(goToUserInfoLink);%>"><%out.print(user.getName());%></a></td>
                    <td><%out.print(user.getSurname());%></td>
                    <td><%out.print(user.getEmail());%></td>
                    <td><%out.print(user.getPassword());%></td>
                    <td>
                        <form action="/remove" method="post">
                            <input type="hidden" name="user_id" value="<%out.print(user.getId());%>">
                            <button type="submit">Delete</button>
                        </form>
                    </td>
                    <td>
                        <a href="<%out.print(goToEditUserLink);%>">
                            <button >
                                Edit
                            </button>
                        </a>
                    </td>

                </tr>
       <%}%>
    </table>

    <a href="/remove"> Стартовая страницаа </a><br>
    <h3>Тестовые ссылки</h3><br>








</body>
</html>
