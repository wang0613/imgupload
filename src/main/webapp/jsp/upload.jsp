<%--
  Created by IntelliJ IDEA.
  User: 王海龙
  Date: 2020/12/4
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
    文件
    <input type="file" name="uploadFile"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
