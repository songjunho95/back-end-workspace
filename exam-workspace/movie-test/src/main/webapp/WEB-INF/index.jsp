<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 목록</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
    <div>
        <a href="${pageContext.request.contextPath}/movies">영화 목록</a>
        <a href="${pageContext.request.contextPath}/add">영화 정보 추가</a>
    </div>
    
    <h1>영화 목록</h1>
    
    <c:if test="${not empty message}">
        <div>
            <p>${message}</p>
        </div>
    </c:if>
    
    <table>
        <thead>
            <tr>
                <th>제목</th>
                <th>장르</th>
                <th>영화배우</th>
                <th>삭제</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="movie">
                <tr>
                    <td>${movie.title}</td>
                    <td>${movie.genre}</td>
                    <td>${movie.actor}</td>
                    <td>삭제</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
