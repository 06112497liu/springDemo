<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%--
  Created by IntelliJ IDEA.
  User: IRues
  Date: 2017/10/29
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${spittleList}" var="spittle">
        <li id="spittle_<c:out value='spittle.id'/>">
            <div class="spittleMessage">
                <c:out value="${spittle.message}"/>
            </div>
            <span class="spittleTime">
                <fmt:formatDate value="${spittle.time}" pattern="yyyy年MM月dd日"/>
            </span>
            <br/>
            <span class="spittleLocation">
                (<c:out value="${spittle.latitude}"/>, <c:out value="${spittle.longitude}"/>)
            </span>
        </li>
    </c:forEach>
</body>
</html>
