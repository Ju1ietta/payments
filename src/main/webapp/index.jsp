<%--
  Created by IntelliJ IDEA.
  User: Julia
  Date: 15.04.2016
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.2.6/jquery.min.js"></script>
    <title>Login Page</title>
</head>
<body>
<div id="wrapper">
    <div class="user-icon"></div>
    <div class="pass-icon"></div>
<br><br>
<form name="login-form" class="login-form" action="" method="post">
    <div class="header">
        <h1>Authorization</h1>
        <span>Please enter your login information to access into your personal account. </span>
    </div>
    <br>
    <div class="content">
        <input name="username" type="text" class="input username" value="username" onfocus="this.value=''" />
        <input name="password" type="password" class="input password" value="password" onfocus="this.value=''" />
    </div>
    <div class="footer">
        <input type="submit" name="submit" value="Sign in" class="button" />
        <input type="submit" name="submit" value="Sign up" class="register" />
    </div>
</form>
</div>
<div class="gradient"></div>

<script type="text/javascript">
    $(document).ready(function() {
        $(".username").focus(function() {
            $(".user-icon").css("left","-48px");
        });
        $(".username").blur(function() {
            $(".user-icon").css("left","0px");
        });

        $(".password").focus(function() {
            $(".pass-icon").css("left","-48px");
        });
        $(".password").blur(function() {
            $(".pass-icon").css("left","0px");
        });
    });
</script>
</body>
</html>