<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServlet" method="post">
<div id = "top" style=height:100px></div>
<div id = "middle" style = height:250px;border:solid>
<center><h1> Login</h1>
username <input type="text" name="uid"/><br><br>
password<input type ="Password" name="pwd"/><br><br>
<input type="submit" value="submit" style="border:solid;font-weight: bold;">&emsp;
<input type="reset" value="clear" style="border:solid;font-weight: bold;">&emsp;
<input type="reset"value="cancle"style="border:solid;font-weight: bold;"></center></div>
<div id="bottom"></center></div>
</form>
</body>
</html>