<%@ page import="workandblog.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Zhenya
  Date: 13.11.2017
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update User</title>
</head>
<body>


<%

    User user = (User) request.getAttribute("user");

%>

<h1>Edit User</h1>

    <br>

<form action="/update-user" method="post">

    <input type="hidden" name="user_id" value="<%out.print(user.getId());%>">

        <br>

    <input name="user_name" value="<%out.print(user.getName());%>">

        <br>

    <input name="user_surname" value="<%out.print(user.getSurname());%>">

        <br>

    <input name="user_email" value="<%out.print(user.getEmail());%>">

        <br>

    <button type="submit">Edit </button>

</form>

    <br>

<h1>Change Password</h1>

    <br>

<form action="/update-user-password" method="post">

        <br>

    <input name="user_password" value="">

        <br>

    <input name="user_confirm_password" value="">

        <br>

    <button type="submit">Change Password </button>

</form>


</body>
</html>
