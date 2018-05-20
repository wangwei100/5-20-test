<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
<body>

	<input id="s1" type="text" class="rect" />+
	<input id="s2" type="text" class="rect" />
	<input type="button" value="=" onclick="acc();" />
	<input id="s3" type="text">
</body>
<script type="text/javascript">
	function acc() {
		$("#s1").val();
		$("#s2").val();
		var sum = parseInt($("#s1").val()) + parseInt($("#s2").val());
		$("#s3").val(sum);
	}
</script>
</html>