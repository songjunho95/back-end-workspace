<%@page import="java.lang.reflect.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전체 회원 목록</h1>
	<a href="/">메인 페이지로 이동</a>
	<% List<Member> list = (List<Member>) request.getAttribute("list"); %>
	<table border = "1">
		<tr>
			<th>번호</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>	
		</tr>
		<c:forEach items="${list}" var="m" varStatus="status">
			<tr>
				<td>${status.index}</td>
				<td>${m.id}</td>
				<td>${m.password}</td>
				<td>{m.name}</td>
			</tr>
			</c:forEach>
	</table>

</body>
</html>