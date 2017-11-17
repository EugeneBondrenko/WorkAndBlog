
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/save-new-file" method="post" enctype="multipart/form-data">

    <input multiple  name="filePicture[]" type="file" >

    <button type="submit" >save</button>

</form>


<%--<img src="<%out.print("/show-image/" + object.getGeneratedName + "/")%>">--%>

<img src="/show-image/c2bd2746-11e4-491c-a819-7b5b05f25e72.jpeg/">

</body>
</html>
