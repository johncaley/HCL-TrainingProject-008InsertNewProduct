<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>
<body>
<h1>Enter Book Info Here:</h1>
<form action="" method="post">
	<table style="width:25%">
		<tr>
			<th>Enter Title: <input type="text" name = "title"/></th>
			<th>Enter Author: <input type="text" name = "author"/></th>
			<th>Enter Price: <input type="text" name = "price"/></th>
		</tr>
		<tr>
			<th></th>
			<th><input type="submit" name="register" value="Insert into Database"/></th>
			<th></th>
		</tr>
	
	</table>



	
	
	
	
</form>

<% if(request.getParameter("register")!=null){ %>
		<jsp:useBean id="book" class="com.Book" scope="request"></jsp:useBean>
		<jsp:setProperty property="*" name="book"/>
		<jsp:forward page="RegisterServlet"></jsp:forward>
<%} %>



</body>
</html>