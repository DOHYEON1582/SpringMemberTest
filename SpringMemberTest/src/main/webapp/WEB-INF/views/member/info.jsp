<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>/member/info.jsp</h2>
	<h3>아이디 : ${resultVO.userid }</h3>
	<h3>비밀번호 : ${resultVO.userpw }</h3>
	<h3>이름 : ${resultVO.username }</h3>
	<h3>이메일 : ${resultVO.useremail }</h3>
	<h3>회원가입일 : ${resultVO.regdate }</h3>
	<h3>마지막수정일 : ${resultVO.updatedate }</h3>
	
	<h4><a href="/member/main">메인으로</a></h4>

</body>
</html>