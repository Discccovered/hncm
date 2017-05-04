function loginClick(event) {
	var params = {
		account : $('#account').val(),
		password : $('#password').val(),
	};
	$.ajax({
		url : "/hncm/user/user_Login.action",
		data : params,
		type : "post",
		cache:false,
		dateType : "json",
		success : function(data) {
			console.log(data);
			if(data.res=="0000"){
				console.log("success");
				window.location.href = '/hncm/app/tableList/table.jsp';
			}else{
				console.log("false");
			}
		},
		error : function(error) {
			/*alert(${message});*/
		}
	});
}
