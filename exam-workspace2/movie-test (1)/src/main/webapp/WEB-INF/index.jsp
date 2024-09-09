<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>

	<div>
		<a href="/index">영화 목록</a>
		<a href="/">영화 정보 추가</a>
	</div>
	
	<h1>영화 정보 추가</h1>
	
	<form>
	<input placeholder="영화 제목 입력" />
	<input placeholder="영화 장르 입력" />
	<input placeholder="영화 배우들 입력" />
	<input type="submit" />
	</form>
</body>
</html>