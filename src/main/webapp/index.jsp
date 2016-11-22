<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>输入数据</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/Node/add" method="get">
		<c:out value="节点号" />
		<input type="text" placeholder="节点号" name="Id" /><br />
		<c:out value="PH值" />
		<input type="text" placeholder="PH值" name="PH" /><br />
		<c:out value="温度" />
		<input type="text" placeholder="温度" name="temperature" /><br />
		<c:out value="浊度" />
		<input type="text" placeholder="浊度" name="turbidity" /><br />
		<c:out value="离子浓度" />
		<input type="text" placeholder="离子浓度" name="Ion" /><br />
		<c:out value="微生物量" />
		<input type="text" placeholder="微生物量" name="microbial" /> <input
			type="submit" value="提交">
	</form>
	<a href="${pageContext.request.contextPath}/Node/getAll">查看所有已经输入的数据</a>
	<h1 style="color: red">${info}</h1>
</body>
</html>