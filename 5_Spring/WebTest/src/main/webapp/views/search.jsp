<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>사원 정보</h1>
	<ul>
	${employee}
		<li>사원 번호 : ${employee.empId}empId</li>
		<li>사원 이름 : ${employee.empName}empName</li>	
		<li>사원 이메일 : ${employee.email}email</li>
		<li>사원 전화번호 : ${employee.emphone}phone</li>
	</ul>
	<a href="/">메인 페잊로 돌아가기</a>
</body>
</html>