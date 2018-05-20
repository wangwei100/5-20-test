<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<body>
	<span>用户名</span>
	<input id="txt_username" type="text" ><span id="alert" style="color:red"></span>
	<br />
	<span>密码</span>
	<input id="txt_password" type="text">
	<br />
	<span>确认密码</span>
	<input id="txt_password_confirm" type="text">
	<span id="alertText" style="color: red"></span>
	<br />
	<span>邮箱</span>
	<input id="txt_email" type="text">
	<span id="alert1" style="color: red"></span>
	<br />
	<input id="btn_register" type="button" value="注册">
</body>
<script type="text/javascript" src="js/register.js"></script>
</html>