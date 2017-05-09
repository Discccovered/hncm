<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<%@ include file="/app/common/jsp/common-head.jsp"%>
<style type="text/css">
#head {
	margin-top: 0;
	height: 5%;
	width: 100%;
	background-color: #39afe1;
}

#head #title {
	margin-top: 10px;
	font-weight: bold;
	color: #FFFFFF;
}

#body {
	height: 90%;
	background-color: #0c9dd9;
}

#body #left_body {
	display: inline-block;
	float: left;
	width: 50%;
	float: left;
}

#body #left_body #left_body_img {
	margin-top: 10%;
	float: right;
}

#foot {
	height: 5%;
	width: 100%;
	background-color: black;
}

#body #right_body {
	margin-left: 80px;
	display: inline-block;
	width: 40%;
}

#body #right_body #right_body_text {
	border-radius: 5px;
	width: 340px;
	height: 40%;
	background-color: #FFFFFF;
	margin-top: 10%;
	padding-bottom: 10px;
	padding-left: 10px;
	padding-right: 10px;
	padding-top: 10px;
}

#body #right_body #right_body_text  * {
	font-weight: bolder;
	font-family: inherit;
	color: blue;
}

#body #right_body #right_body_text input[type=text],input[type=password] {
	height: 42px;
	border-radius: 0;
	border-color: #dddddd;
	margin-top: 20px;
	font-size: 12px;
	color: #ccc;
	font-family: serif;
	font-weight: normal;
}

#body #right_body #right_body_text button {
	width:320px;
	background-color: #ff871d;
}
</style>
</head>

<body>
	<div id="head">
		<span id="title">淮南市企业信息管理</span>
	</div>

	<div id="body">
		<div id="left_body">
			<div id="left_body_img">
				<img src="img/登录页面左边的图片.png" id="left_body_img_name">
			</div>
		</div>
		<!-- <div class="clearfix"></div> -->
		<div id="right_body">
			<div id="right_body_text">
				<div id="right_body_text_inner">
					<div id="title">管理登录</div>
					<form>
						<div class="form-group">

							<input type="text" class="form-control" id="account"
								placeholder="请输入用户名">
						</div>
						<div class="form-group">
							<input type="password" class="form-control" id="password"
								placeholder="请输入密码"></input>
						</div>
						<div class="checkbox">
							<label> <input type="checkbox"> Check me out
							</label>
						</div>
						<div class="form-group text-center">
							<button type="submit"
								class="btn btn-success login-button btn-block"
								onclick="loginClick(event)">登录</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>


	<div id="foot"></div>
</body>
</html>
