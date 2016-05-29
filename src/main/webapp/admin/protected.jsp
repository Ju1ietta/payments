<%--
  Created by IntelliJ IDEA.
  User: Vasilii
  Date: 29.05.2016
  Time: 18:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        Hello <%=request.getUserPrincipal().getName() %>
        You are able to view this page because you are authenticated user.
</body>
</html>
