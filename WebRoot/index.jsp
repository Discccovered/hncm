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
	#head{
	margin-top:0;
		height:5%;
		width:100%;
		background-color: #39afe1;
	}
	#head #title{
		margin-top: ;
		font-weight: bold;
		color: #FFFFFF;
	}
</style>
</head>
	
<body>
	<div id="head">
		<span id="title">淮南市企业信息管理</span>
	</div>
</body>
</html>
