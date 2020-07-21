<%@page import="com.webapp.myclass.model.fetch_from_database"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello Baby !!!

<%		fetch_from_database data = (fetch_from_database)request.getAttribute("data"); 
       out.print(data);    
%>
</body>
</html>