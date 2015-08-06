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
	<br>
	<%!List<Employee> list; %>
	<%
		int index = 0;
	%>
	<%list=(List<Employee>)request.getAttribute("employees");%>
	<%! Iterator<Employee> iterator;%>
	<%iterator=list.iterator(); %>
	<% while(iterator.hasNext()){  %>
	<%!String firstName,lastName,address,emailAddress; %>
	<%!String phoneNumber; %>
	<%Employee employee=iterator.next(); %>
	Employee
	<%=index + 1%>: FirstName:
	<%firstName=employee.getFirstName();%>"<%=firstName%><br> LastName:
	<%lastName=employee.getLastName();%>"<%=lastName%><br> Address:
	<%address=employee.getAddress();%>"<%=address%><br> PhoneNumber:
	<%phoneNumber=employee.getPhoneNumber();%>"<%=phoneNumber%><br>
	Email Address:
	<%emailAddress=employee.getEmailAddress();%>"<%=emailAddress%><br>
	<br>
	<%index++; %>
	<%} %>
</body>
</html>