<%@ page import="workandblog.entity.User" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <%--Подключаем с самого начала--%>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/7.0.0/normalize.css">
    <link rel="stylesheet" href="/resources/css/myContactPhone.css">
    <%--<link rel="shortcut icon" type="image/x-icon" href="/resources/img/fons/myContactPhone.jpg">--%>
    <title>My Contact Phone</title>
</head>
<body>

<div class="header">


    <div class="menu">
        <div class="item">
            <h3>Work & Blog</h3>
        </div>
        <div class="item">
            <h3>HOME</h3>
        </div>
        <div class="item">
            <h3>ABOUT US</h3>
        </div>
        <div class="item">
            <h3>CONTACT</h3>
        </div>
        <div class="item">
            <h3>LOG IN</h3>
        </div>
    </div>

    <div class="content">
        <div class="sidebar">
            <div class="sidebar_menu">
                <h3>Side Bar Menu</h3>
            </div>
            <div class="sidebar_item">
                <h3>List</h3>
            </div>
            <div class="sidebar_item">
                <h3>User</h3>
            </div>
            <div class="sidebar_item">
                <h3>New</h3>
            </div>
            <div class="sidebar_item">
                <h3>Delete</h3>
            </div>


        </div>
        <div class="phone_list">
            <div class="phone_list_menu">

                <div class="phone_list_item">
                    <h3>ID</h3>
                </div>
                <div class="phone_list_item">
                    <h3>Name</h3>
                </div>
                <div class="phone_list_item">
                    <h3>Surname</h3>
                </div>
                <div class="phone_list_item">
                    <h3>@Mail</h3>
                </div>
                <div class="phone_list_item">
                    <h3>Password</h3>
                </div>
                <div class="phone_list_item">
                    <h3>Delete</h3>
                </div>
                <div class="phone_list_item">
                    <h3>Update</h3>
                </div>

            </div>

            <%
                List<User> userList = (List<User>) request.getAttribute("userBy");

                for(User user : userList){

                    String goToUserInfoLink = "/get-user/" + user.getId() + "/";
                    String goToEditUserLink = "/edit-user/" + user.getId() + "/";
            %>


            <div class="phone_list_menu">

                <div class="phone_list_user">
                    <%out.print(user.getId());%>
                </div>
                <div class="phone_list_user">
                    <a href="<%out.print(goToUserInfoLink);%>"><%out.print(user.getName());%></a>
                </div>
                <div class="phone_list_user">
                    <%out.print(user.getSurname());%>
                </div>
                <div class="phone_list_user">
                    <%out.print(user.getEmail());%>
                </div>
                <div class="phone_list_user">
                    <%out.print(user.getPassword());%>
                </div>
                <div class="phone_list_user">
                    <form action="/remove" method="post">
                        <input type="hidden" name="user_id" value="<%out.print(user.getId());%>">
                        <button type="submit">Delete</button>
                    </form>
                </div>
                <div class="phone_list_user">
                    <a href="<%out.print(goToEditUserLink);%>">
                        <button >
                            Edit
                        </button>
                    </a>
                </div>

            </div>

            <%}%>

            <%--<div class="phone_list_menu">--%>

                <%--<div class="phone_list_user">ID</div>--%>
                <%--<div class="phone_list_user">Name</div>--%>
                <%--<div class="phone_list_user">Surname</div>--%>
                <%--<div class="phone_list_user">@Mail</div>--%>
                <%--<div class="phone_list_user">Password</div>--%>
                <%--<div class="phone_list_user">Delete</div>--%>
                <%--<div class="phone_list_user">Update</div>--%>

            <%--</div>--%>

            <%--<div class="phone_list_menu">--%>

                <%--<div class="phone_list_user">ID</div>--%>
                <%--<div class="phone_list_user">Name</div>--%>
                <%--<div class="phone_list_user">Surname</div>--%>
                <%--<div class="phone_list_user">@Mail</div>--%>
                <%--<div class="phone_list_user">Password</div>--%>
                <%--<div class="phone_list_user">Delete</div>--%>
                <%--<div class="phone_list_user">Update</div>--%>

            <%--</div>--%>




        </div>
    </div>
</div>

</body>
</html>
