function insert() {
	var name = $("#txtName").val();
	var math = $("#txtMath").val();
	var english = $("#txtEnglish").val();
	var tr = "<tr>" 
		+ "<td>" + name + "</td>" 
		+ "<td>" + math + "</td>"
		+ "<td>" + english + "</td>" 
		+ "</tr>"
	$("#tb tbody").append(tr);
}