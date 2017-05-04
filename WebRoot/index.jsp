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
* {
	margin: 0;
	padding: 0
}
.containerT {
	padding: 0;
	margin: 0
}

.bodyT{
	background-color: #0c9dd9;
	height:100%
}

.bodyT .leftbody{
	width:50%;
	display:inline-block;
	float: left;
}

.bodyT .leftbody .leftbodyimg{
	position: relative;
	left:30%;
	top: 50%;
}


.headT {
	background-color: #39afe1;
	margin: 0;
	padding:10px
}

</style>

</head>

<body>
	<div class="containerT">
		<div class="headT">
			<span class="title"><img  src="img/logo图标.png"></span>
		</div>
		<div class="bodyT">
			<div class="leftbody">
				<div class="leftbodyimg"><img src="img/登录页面左边的图片.png" >
				</div>
			</div>
			<div class="rightbody">
				<span>管理登录</span><br>
				<span><span class="glyphicon glyphicon-user" aria-hidden="true"></span><span><input type="text" placeholder="请输入用户名" id="username"  /></span></span><br> <input
					type="password" placeholder="请输入密码" id="password"><br>
				<input type="checkbox" id="remember">记住密码<br> <input
					type="button" id="submit" value="登录">
			</div>
			<div class="clearfix"></div>
		</div>
		<div class="foot"></div>
	</div>
</body>
</html>
