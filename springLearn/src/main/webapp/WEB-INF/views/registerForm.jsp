<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/30
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Register</h1>
   <form method="post" enctype="multipart/form-data">
        First Name:<input type="text" name="firstName"/><br/>
        Last Name:<input type="text" name="lastName"/><br/>
        Username Name:<input type="text" name="username"/><br/>
        Password Name:<input type="text" name="password"/><br/>
        Profile Picture:<<input type="file" name="profilePicture" accept="image/jpeg, image/png, image/gif"/><br/>
        <input type="submit" value="Register">
    </form>
<%--    <sf:form method="post" commandName="spitter">
            First Name:<sf:input path="firstName"/><sf:errors path="firstName"/><br/>
        Last Name:<sf:input path="lastName"/><br/>
        Username Name:<sf:input path="username"/><br/>
        Password Name:<sf:password path="password"/><br/>
        <input type="submit" value="register"/>
    </sf:form>--%>
</body>
</html>






















