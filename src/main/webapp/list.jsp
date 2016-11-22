<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>列表</title>
<style type="text/css">
table{text-align: center;}
</style>
</head>
<body>
	<table>
		<tr>
			<td>节点号</td>
			<td>PH值</td>
			<td>温度</td>
			<td>浊度</td>
			<td>电导率</td>
			<td>溶解氧</td>
<<<<<<< HEAD
			<td>采集时间</td>
=======
			<td>导入时间</td>
>>>>>>> origin/master
		</tr>
		<c:forEach var="ele" items="${list}">
			<tr>
				<td>${ele.id}</td>
				<td>${ele.PH}</td>
				<td>${ele.temperature}</td>
				<td>${ele.turbidity}</td>
				<td>${ele.ion}</td>
				<td>${ele.microbial}</td>
				<!-- 格式化时间输出 -->
				<td><fmt:formatDate value="${ele.date}"
						pattern="yyyy-MM-dd HH:mm:ss" /></td>
		</c:forEach>
	</table>
	<a href="${pageContext.request.contextPath}/Node/index">添加数据</a>
</body>
</html>