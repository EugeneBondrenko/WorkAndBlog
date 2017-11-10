<%@ page import="workandblog.entity.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="workandblog.entity.Book" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%Integer integer = (Integer) request.getAttribute("key");  %>
<%ArrayList<User> users = (ArrayList<User>) request.getAttribute("UserRegistrations"); %>

<h1>Hello   <%out.print(integer);%></h1>
<br>
<a href="/create">Регистрация</a>
<br>
<a href="/form"> Form </a>
<br>
<a href="/userlist">Users List</a>
<br>
<a href="/custom">User Bank System</a>



<%--<%--%>

    <%--for(int i =0; i<users.size();i++){--%>

        <%--User user = users.get(i);--%>
<%--%>--%>

    <%--name: <%out.print(user.getName());%>  surname:  <%out.print(user.getSurname());%>--%>
    <%--<br>--%>
    <%--<%--%>
        <%--List<Book> bookList = user.getBooks();--%>
        <%--for (Book book:bookList){--%>
    <%--%>--%>
    <%--Book name ---: <%out.print(book.getTitle());%>--%>
    <%--<br>--%>

    <%--<%}%>--%>



<%--<%}%>--%>



</body>
</html>
