<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/query2" method="post" enctype="multipart/form-data">
        姓名:<input type="text" name="username"><br/>
        文件:<input type="file" name="uploadFile"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
