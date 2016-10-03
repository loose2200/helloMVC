<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>helloMVC Web Application</title>
</head>
<style>
div.ex{
		text-align: center;
		width: 35%;
		padding: 10px;
		border: 5px solid grey;
		margin: 20px
		}
</style>
<body>
 	<h1>Login Form</h1>
 	<div class="ex">
	<form action="/helloMVC/doLogin" method="get">
	
		<table cellpadding="5">
 		<tr>
 		<td>ID</td>
 		<td><input type="text" name="id"/></td>
 		</tr>
 		<tr>
 		<td>PassWord</td>
 	<td><input type="password" name="password" /></td>
 		</tr>
		<tr>
 		<td></td>
 		<td><input type="submit" value="login"/></td>
 		</tr>
 		</table>
 
	</form>
 </div>
</body>
</html>