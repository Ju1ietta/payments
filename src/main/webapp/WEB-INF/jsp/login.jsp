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
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.2.6/jquery.min.js"></script>
    <title>Login Page</title>
</head>
<body>
<div id="wrapper">
    <div class="user-icon"></div>
    <div class="pass-icon"></div>
    <br><br>
    <form name="login-form" class="login-form" action="controller" method="post">
        <div class="header">
            <h1>Authorization</h1>
            <span>Please enter your login information to access into your personal account. </span>
        </div>
        <br>
        <div class="content">
            <input name="j_username" type="text" class="input username" value="username" onfocus="this.value=''"/>
            <input name="j_password" type="password" class="input password" value="password" onfocus="this.value=''"/>
        </div>
        <div class="footer">
            <input type="submit" value="Sign in" class="button"/>
            <input type="hidden" name="command" value="login">
        </div>
    </form>

</div>
<div id="login_addition_menu">
    <div id="reg_line">

        <form action="controller" method="post">
            <input type="hidden" name="command" value="registerPage">
            <input type="submit" class="addition_menu_button submit" value="Sign up">
        </form>
    </div>
</div>

<div class="gradient"></div>

<script type="text/javascript">
    $(document).ready(function () {
        $(".username").focus(function () {
            $(".user-icon").css("left", "-48px");
        });
        $(".username").blur(function () {
            $(".user-icon").css("left", "0px");
        });

        $(".password").focus(function () {
            $(".pass-icon").css("left", "-48px");
        });
        $(".password").blur(function () {
            $(".pass-icon").css("left", "0px");
        });
    });
</script>
</body>
</html>
<%--<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>--%>
<%--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>login</title>--%>
    <%--<link rel="icon" type="image/ico" href="${pageContext.request.contextPath}/images/network.gif"/>--%>
    <%--<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/styles.css" type="text/css">--%>
    <%--<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div id="wrapper">--%>
    <%--<div id="header">--%>
        <%--&lt;%&ndash; HEADER &ndash;%&gt;--%>
        <%--<%@ include file="/WEB-INF/jspf/header.jspf" %>--%>
        <%--&lt;%&ndash; HEADER &ndash;%&gt;--%>
    <%--</div>--%>

    <%--<div id="login_addition_menu">--%>
        <%--<!-- <div id="reg_line"><a href="controller?command=registerPage">Registration</a> &nbsp;</div> -->--%>
        <%--<div id="reg_line">--%>

            <%--<form action="controller" method="post">--%>
                <%--<input type="hidden" name="command" value="registerPage">--%>
                <%--<input class="addition_menu_button" type="submit"--%>
                       <%--value="<ct:i18n propertyKey="page.login.Registration"/>" class="submit">--%>
            <%--</form>--%>

            <%--&lt;%&ndash;  <a href="controller?command=registerPage"><ct:i18n propertyKey="page.login.Registration"/>--%>
             <%--</a>  &ndash;%&gt;--%>
            <%--&nbsp;--%>
        <%--</div>--%>
        <%--<div id="lang_line">--%>
            <%--<div id="Lang_ru">--%>
                <%--<form class="form_lang" action="controller" method="post">--%>
                    <%--<input type="hidden" name="command" value="selectLocale">--%>
                    <%--<input type="hidden" name="locale" value="ru_RU">--%>
                    <%--<input class="addition_menu_button" type="submit" value="ru">--%>
                <%--</form>--%>
            <%--</div>--%>

            <%--<div id="Lang_en">--%>
                <%--<form class="form_lang" action="controller" method="post">--%>
                    <%--<input type="hidden" name="command" value="selectLocale">--%>
                    <%--<input type="hidden" name="locale" value="en_US">--%>
                    <%--<input class="addition_menu_button" type="submit" value="eng">--%>
                <%--</form>--%>
            <%--</div>--%>

        <%--</div>--%>
    <%--</div>--%>


    <%--<div id="content_one_col">--%>
        <%--<form id="form_login" action="controller" method="post">--%>
            <%--<input type="hidden" name="command" value="login"> <br/>--%>
            <%--<ct:i18n propertyKey="page.login.Login"/>: <br/>--%>
            <%--<!-- Login: <br/> -->--%>
            <%--<input class="in" type="text" name="j_username" required placeholder="login">--%>
            <%--<br/>--%>
            <%--<ct:i18n propertyKey="page.login.Password"/>: <br/>--%>
            <%--<!--  Password: <br/> -->--%>
            <%--<input class="in" type="password" name="j_password" required--%>
                   <%--placeholder="password"> <br/>--%>
            <%--<input type="submit" value="enter" class="submit">--%>

        <%--</form>--%>
    <%--</div><!-- #content-->--%>


<%--</div><!-- #wrapper -->--%>

<%--</body>--%>
<%--</html>--%>