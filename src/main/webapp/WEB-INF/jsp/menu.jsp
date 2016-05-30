<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>menu</title>
<link rel="icon" type="image/ico" href="${pageContext.request.contextPath}/images/network.gif" />
<link rel="stylesheet" href="${pageContext.request.contextPath}/styles/styles.css" type="text/css" >
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<%--<script type="text/javascript" defer="defer" src="${pageContext.request.contextPath}/js/clientQuestionToAdmin.js"></script>--%>
</head>
<body>
  <div id="wrapper">
	<div id="header">
		<%-- HEADER --%>
		<%@ include file="/WEB-INF/jspf/header.jspf"%>
		<%-- HEADER --%>
	</div>
	
	<div id="menu_block">
	    <%@ include file="/WEB-INF/jspf/menu.jspf"%>	
	</div>	
	
	
	<div id="content">
	

	 </div><!-- #content-->
	 
	
	 
  </div><!-- #wrapper -->
 
</body>
</html>