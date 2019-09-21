<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zk
  Date: 19-8-11
  Time: 上午10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1>Your Profile</h1>
<c:out value="${spitter.username}" /> <br />
<c:out value="${spitter.firstName}" />
    <c:out value="${spitter.lastName}" />