<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: IRues
  Date: 2017/10/30
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:out value="${spitter.username}"/><br/>
    <c:out value="${spitter.firstName}"/><br/>
    <c:out value="${spitter.lastName}"/>
</body>
</html>
