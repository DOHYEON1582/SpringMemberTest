<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>/member/list.jsp</h2>
	
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>이메일</th>
			<th>가입일</th>
			<th>마지막정보수정일</th>
		</tr>
		
		<c:forEach var="list" items="${mList }">
		<tr>
			<td>${list.userid }</td>
			<td>${list.userpw }</td>
			<td>${list.username }</td>
			<td>${list.useremail }</td>
			<td>${list.regdate }</td>
			<td>${list.updatedate }</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>