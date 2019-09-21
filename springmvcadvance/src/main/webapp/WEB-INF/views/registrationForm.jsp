<%--
  Created by IntelliJ IDEA.
  User: zk
  Date: 19-8-11
  Time: 下午6:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<html>
<head>
    <title>Registe</title>
</head>
<body>
    <form method="post" enctype="multipart/form-data"
        th:object="${spitter}">
        First Name: <input type="text" name="firstName" /> <br />
        Last Name: <input type="text" name="lastName" /> <br />
        Username: <input type="text" name="username" /> <br />
        Password: <input type="password" name="password" /> <br/>

        <label>Upload File:</label>
        <input type="file" name="file" />

        <input type="submit" name="Register" />
    </form>
</body>
</html>
