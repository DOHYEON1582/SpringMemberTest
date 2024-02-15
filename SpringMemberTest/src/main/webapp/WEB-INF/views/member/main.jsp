<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${empty resultVO}">
		<c:redirect url="/member/login"/>
	</c:if>


	<h2>/member/main.jsp</h2>
	<h2>${resultVO.userid }님 환영합니다!</h2>
	<h2>${resultVO.useremail }</h2>
	<input type="button" value="로그아웃" onclick="location.href='/member/logout';">
	<hr>
	
	

</body>
</html>