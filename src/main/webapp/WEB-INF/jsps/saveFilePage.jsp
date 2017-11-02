
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

<img src="/show-image/2e48f744-e0ed-4ac4-8c25-63b26ad41d72.jpg/">

</body>
</html>
