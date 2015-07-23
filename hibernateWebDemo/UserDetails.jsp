<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List"%>
    <%@ page import="edu.javalearn.domain.hibernateBean.User"%>
    <%@ page import="java.util.Iterator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!List<User> list; %>
<%list=(List<User>)request.getAttribute("UserDetails");%>
<%! Iterator<User> iterator;%>
<%iterator=list.iterator(); %>
		<% while(iterator.hasNext()){  %>
		<%!String userName; %>
		<a href="<%userName=iterator.next().getUserName();%>"><%=userName%></a><br>
		 <%} %>
</body>
</html>