<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<!DOCTYPE html>
<html>
<head>

    <link href="<c:url value="/resources/css/authorizationStile.css"/>" rel="stylesheet" >
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Create</title>
    <%--Позволяет подключать библиотеки --%>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>


    <script type="text/javascript">
        function doAjax() {
            $.ajax({
                url: 'check',
                data: ({password: $('#password').val()}),
                success: function (data) {
                    $('#value').html(data);
                }
            });
        }
        function doAjax2() {
            $.ajax({
                url: 'identical',
                data: ({compass: $('#compass').val()}),
                success: function (data) {
                    $('#ident').html(data);
                }
            });

        }
    </script>

</head>
<body>


        <h3>Sing Up</h3>
        <form class="reg-form" action="/createusers" method="post">


                <div class="form-row">
                    <label for = "name">
                      <span class="reg">Last Name : </span>
                    </label>
                    <input type="text" id="name" name="name" placeholder="Last Name" required>
                </div><br>

                <div class="form-row">
                    <label for="surname">
                      <span class="reg">First Name : </span>
                        <input type="text" id="surname" name="surname" placeholder="First Name">
                    </label>
                </div><br>

                <div class="form-row">
                    <label for="email">
                       <span class="reg">@Email : </span>
                        <input type="text" id="email" name="email" placeholder="@Email">
                    </label>
                </div><br>

                <div class="form-row">
                    <label for="password" onkeyup="doAjax()">
                     <span class="reg">Password : </span>
                        <input type="text" id="password" name="password" placeholder="Password"><br>
                        <span id="value"/>
                    </label>
                </div><br>

                <%--<div class="form-row">--%>
                    <%--<label for="compass" onkeyup="doAjax2()">--%>
                        <%--<span class="reg">Confirm password : </span>--%>
                        <%--<input type="text" id="compass" name="compass" placeholder="Confirm password"><br>--%>
                        <%--<span id="ident"/>--%>
                    <%--</label>--%>
                <%--</div><br>--%>

            <div class="form-row">
                <input type="submit" class="button button-blocl" value="Get Started">
            </div>

        </form>

</body>
</html>
