<%--
  Created by IntelliJ IDEA.
  User: Julia
  Date: 05.05.2016
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error Page</title>
</head>
<body>
Invalid username and/or password, please try
<a href='<%= response.encodeURL("login.html") %>'>again</a>.
</body>
</html>
