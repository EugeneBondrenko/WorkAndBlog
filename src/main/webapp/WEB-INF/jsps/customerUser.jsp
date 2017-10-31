<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>--%>
<%--<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>--%>
<%--<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>--%>
<%--<%@ page session="false" %>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Внесение данных о человеке</title>
</head>
<body>
<fieldset>
    <legend> Человек: </legend>
    <%--@elvariable id="userInfo" type="workandblog.entity.UserInfo"--%>
    <form:form action="/customer1" modelAttribute="userInfo" method="post">
        <span> Name: </span> <form:input path="name"/><br>
        <span>Surname:</span><form:input path="surname"/><br/>
        <span>Email:</span><form:input path="email"/><br/>
        <span>CompanyName:</span><form:input path="companyName"/><br/>
        <span>CountryName:</span><form:input path="countryName"/><br/>
        <span>CityName</span><form:input path="cityName"/><br/>
        <input type="submit" value="Submit">
    </form:form>
</fieldset>

</body>
</html>
