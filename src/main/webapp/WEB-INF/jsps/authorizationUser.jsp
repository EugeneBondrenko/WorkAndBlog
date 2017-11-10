<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link type="text/css" href="<c:url value="/resources/css/authorizationStile.css" />" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration</title>

</head>
<body>

<h1>Authorization</h1>

<form class="reg-form" action="/" method="get">

    <%--<div class="form-row">--%>
        <%--&lt;%&ndash;Связь lable с id&ndash;%&gt;--%>
        <%--<label for="rorm_name"> Name : </label>--%>
        <%--<input type="text" id="rorm_name" name="name" required>--%>
    <%--</div>--%>

    <%--<div class="form-row">--%>
        <%--<label for="rorm_surname"> Surname : </label>--%>
        <%--<input type="text" id="rorm_surname" name="surname">--%>
    <%--</div>--%>

    <div class="form-row">
        <label for="rorm_@email"> @Email : </label>
        <input type="text" id="rorm_@email" name="@mail">
    </div>

    <div class="form-row">
        <label for="rorm_pass"> Password : </label>
        <input type="text" id="rorm_pass" name="password">
    </div>

    <%--<div class="form-row">--%>
        <%--<label for="rorm_confpass"> Confirm Password : </label>--%>
        <%--<input type="text" id="rorm_confpass" name="confpassword">--%>
    <%--</div>--%>

    <%--<div class="form-row">--%>
        <%--<label for="rorm_about"> About </label>--%>
        <%--<textarea name="about" id="rorm_about"></textarea>--%>
    <%--</div>--%>

    <div class="form-row">
    <input type="submit" name="Go" value="SUBMIT">
    </div>

</form>
</body>
</html>
