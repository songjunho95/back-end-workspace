<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>회원검색</h1>
	<form action="/search">
		<input type="hidden" name="command" value="search">
		검색할 회원 아이디 : <input type="text" name="id"><br>
		<intput type="submit">
	</form>
	

</body>
</html>