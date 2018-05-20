function register() {
	var username = $("#txt_username").val();
	var password = $("#txt_password").val();
	var passwordConfirm = $("#txt_password_confirm").val();
	if (password != passwordConfirm) {
		$("#alertText").html("两次输入不同，请重新输入");
		return;
	}
	var email = $("#txt_email").val();
	var reg = /^.*@.*$/;

	if (!reg.test(email)) {
		$("#alert1").html("邮箱格式不正确！");
		return;

	}
	var params = {
		"username" : username,
		"password" : password,
		"email" : email
	};

	$.get("/register", params, function(resp) {
		$("#alert").html(resp);
	});
}
$(document).ready(function() {
	$("#btn_register").click(register);
});