<%--
  Created by IntelliJ IDEA.
  User: Julia
  Date: 19.04.2016
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <fmt:setLocale value="${sessionScope.local}"/>
    <fmt:setBundle basename="local" var="loc"/>

    <fmt:message bundle="${loc}" key="local.registration" var="registration"></fmt:message>
    <fmt:message bundle="${loc}" key="local.fn" var="fn"></fmt:message>
    <fmt:message bundle="${loc}" key="local.ln" var="ln"></fmt:message>
    <fmt:message bundle="${loc}" key="local.login" var="login"></fmt:message>
    <fmt:message bundle="${loc}" key="local.password" var="password"></fmt:message>
    <fmt:message bundle="${loc}" key="local.useremail" var="useremail"></fmt:message>
    <fmt:message bundle="${loc}" key="local.done" var="done"></fmt:message>
    <fmt:message bundle="${loc}" key="local.back" var="back"></fmt:message>
    <title>Registration page</title>
</head>
<body>


<div align="center">
    <form method="post" action='/registration' name="registrationUser">
        <input type="hidden" name="action" value="insert"/>

        <p><b>${registration}</b></p>
        <table>
            <tr>
                <td><c:out value='${login}'/></td>
                <td><input type="text" name="login" value=""/></td>
            </tr>
            <tr>
            <tr>
                <td><c:out value='${password}'/></td>
                <td><input type="text" name="password" value=""/></td>
            </tr>
            <tr>
                <td><c:out value='${fn}'/></td>
                <td><input type="text" name="firstName" value=""/></td>
            </tr>
            <tr>
                <td><c:out value='${ln}'/></td>
                <td><input type="text" name="lastName"/></td>
            </tr>
            <tr>
                <td><c:out value='${useremail}'/></td>
                <td><input type="text" name="email"/></td>
            </tr>
        </table>
        <br>

        <input type="hidden" name="action" value="update"/>
        <input type="submit" value='${done}'/> <c:out value='${recordadded}'/>
    </form>
    <br>

    <form action="/index">
        <input type="submit" value="${back}">
    </form>
</div>

</body>
</html>
