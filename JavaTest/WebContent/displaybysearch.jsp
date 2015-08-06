<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List"%>
    <%@ page import="edu.java.test.beans.Employee"%>
    <%@ page import="java.util.Iterator"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!List<Employee> list; %>
<%list=(List<Employee>)request.getAttribute("list");%>
<%! Iterator<Employee> iterator;%>
<%iterator=list.iterator(); %>
		<% while(iterator.hasNext()){  %>
		<%!String firstName,lastName,address,emailAddress; %>
		<%!String phoneNumber; %>
		<%Employee employee=iterator.next(); %>
		<%firstName=employee.getFirstName();%>"><%=firstName%>
		<%lastName=employee.getLastName();%>"><%=lastName%>
		<%address=employee.getAddress();%>"><%=address%>
		<%phoneNumber=employee.getPhoneNumber();%>"><%=phoneNumber%>
		<%emailAddress=employee.getEmailAddress();%>"><%=emailAddress%>
		<br>
		 <%} %>
		 
</body>
</html>