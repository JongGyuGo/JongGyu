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
<title>ȸ������</title>
</head>
<body>
		<div class="wapper">
			<h2>ȸ������</h2>
			<form action="/gyu/registerMember" method="post">
			<div>
				<b>�̸�</b><br>
				<span><input type="text" id="name" name="name"></span>
			</div>
			<div>
				<b>���̵�</b><br>
				<span><input type="text" id="id" name="id"></span>
			</div>
			<div>
				<b>��й�ȣ</b><br>
				<span><input type="text" id="pw" name="pw"></span>
			</div>
			<div>
				<b>�г���</b><br>
				<span><input type="text" id="pw" name="nick"></span>
			</div>
			<div>
				<b>��ȭ��ȣ</b><br>
				<span><input type="text" id="phone" name="phone"></span>
			</div>
			<div>
				<button type="submit">ȸ������</button>
				<button type="reset">���</button>
			</div>
			</form>
		</div>

</body>
</html>