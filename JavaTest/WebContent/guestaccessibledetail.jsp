<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%request.setAttribute("user","guest"); %>
	<FORM ACTION="addressBookDetails" METHOD="POST">
		<INPUT TYPE="radio" NAME="radios"
			VALUE="Get address Book Details in csv" CHECKED> Get address
		Book Details in csv <BR> <INPUT TYPE="radio" NAME="radios"
			VALUE="Get address Book Details in pdf"> Get address Book
		Details in pdf <BR> <INPUT TYPE="submit" VALUE="Submit">
	</FORM>

	<a href="searchAddressBook.jsp">Search through address book</a>
</body>
</html>