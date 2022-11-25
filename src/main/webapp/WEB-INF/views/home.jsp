<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

<style>
	.login-area{
		height: 100px;
	}
	
	.nav-bar {
		width : 100%;
		height: 50px;
		background-color: #96796e;
		display: flex;
	}
	
	.menu{
		width: 25%;
		height : 50px;
		display: table-cell;
		text-align: center;
		vertical-align : middle;
		color: black;
		font-size : 20px;
		line-height: 50px;
	}
	
	.menu:hover {
		cursor : pointer;
		font-size : 20px;
		background-color: #ad8e71;
	}
	
</style>

</head>
	<title>게시판을 만들어볼까</title>



<body>
		<h1 align="center">종로전통떡집</h1>
		<hr>
		
		
		
	<div class="login-area">
		<c:if test="${empty loginUser }">
			<form action="gyu/loginUser" method="post">
				<table align="right">
					<tr>
						<td>아이디 : </td>
						<td><input type="text" name="id"></td>
						<td rowspan="2"><input type="submit" value="로그인"></td>
					</tr>
					<tr>
						<td>비밀번호 : </td>
						<td><input type="text" name="pw"></td>
					</tr>
					<tr>
						<td>
							<a href="/gyu/registerMemberView">회원가입</a>
						</td>
					</tr>
				</table>
			</form>
		</c:if>
		
		<c:if test="${sessionScope.loginUser.id ne null}">
			<table align="right">
				<tr>
					<td colspan="2"><b>${sessionScope.loginUser.id }</b>님 환영합니다.</td>
					<td></td>
				</tr>
				<tr>
					<td>정보수정</td>
					<td><a href="/gyu/logout">로그아웃</a></td>
				</tr>
			</table>
		</c:if>	
	</div>
	
	<div class="nav-bar">
		<div class="menu" onclick="location.href='/gyu/home'">Home</div>
		<div class="menu" >공지사항</div>
		<div class="menu" onclick="location.href='/board/freeboardView'">자유게시판</div>
		<div class="menu">사진게시판</div>
	</div>
	
	<script>
	</script>
</body>
</html>
