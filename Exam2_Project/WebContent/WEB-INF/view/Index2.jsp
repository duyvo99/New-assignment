<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="info" class="com.hcc.advWeb.InfoList" scope="session"></jsp:useBean>
	<%
		ArrayList<com.hcc.advWeb.Info> infoList = info.getInfoList();
		for(com.hcc.advWeb.Info infos:infoList){
	%>
	<p>FullName: <%= infos.getFullName() %></p>
	<p>Email: <%= infos.getEmail() %>  </p>
	<p>Message: <%= infos.getMess() %>  </p>
	<hr>
	<% } %>
	
</body>
</html>