<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
	<form action="AddInAddressBook" method="post">
		Enter FirstName:<input type="text" name="firstName"
			placeholder="Firstname" /><br /> <br /> Enter LastName:<input
			type="text" name="lastName" placeholder="Lastname" /> <br /> <br />
		Enter Address:<input type="text" name="address" placeholder="Address" /><br />
		<br /> Enter EmailAddress:<input type="email" name="emailaddress"
			placeholder="email" /> <br /> <br /> Enter PhoneNumber:<input
			type="text" name="phoneNumber" placeholder="phoneNumber" /><br /> <br />
		<input type="submit" value="Add Employee" />
	</form>
</body>
</html>