<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>


<style>
	wapper {
		text-align: center;
	}
	
</style>
<meta charset="EUC-KR">
<title>회원가입</title>
</head>
<body>
		<div class="wapper">
			<h2>회원가입</h2>
			<form action="/gyu/registerMember" method="post">
			<div>
				<b>이름</b><br>
				<span><input type="text" id="name" name="name"></span>
			</div>
			<div>
				<b>아이디</b><br>
				<span><input type="text" id="id" name="id"></span>
			</div>
			<div>
				<b>비밀번호</b><br>
				<span><input type="text" id="pw" name="pw"></span>
			</div>
			<div>
				<b>닉네임</b><br>
				<span><input type="text" id="pw" name="nick"></span>
			</div>
			<div>
				<b>전화번호</b><br>
				<span><input type="text" id="phone" name="phone"></span>
			</div>
			<div>
				<button type="submit">회원가입</button>
				<button type="reset">취소</button>
			</div>
			</form>
		</div>

</body>
</html>