<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<style>
 div.ex {
 	text-align: center;
 	width: 50%;
 	padding: 10px;
 	border: 5px solid grey;
 	margin: 20px;
 }
 </style>
 
 <body>
 	<h1>Registration Form</h1>
 	<div class="ex">
 		<form action="/helloMVC/doRegister" method="post">
 			<table cellpadding="5">
 				<caption><strong>Enter Information Here</strong></caption>
 				<tr>
 					<td width="150">id</td>
 					<td width="300"><input type="text" name="id" /></td>
 				</tr>
 				<tr>
 					<td>password</td>
 					<td><input type="password" name="password" /></td>
 				</tr>
 				<tr>
 					<td>name</td>
 					<td><input type="text" name="name" /></td>
 				</tr>
 				<tr>
 					<td>gender</td>
 					<td>
 						<input type="radio" name="gender" value="male" checked />male
 						<input type="radio" name="gender" value="female" />female
 					</td>
 				</tr>
 				<tr>
 					<td>email</td>
 					<td><input type="text" name="email" /></td>
 				</tr>
 				<tr>
 					<td></td>
 					<td><input type="submit" value="register" /></td>
 				</tr>
 			</table>
 		</form>
 	</div>
</body>
</html>