<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>배너 이미지 변경</title>
	<link rel="stylesheet" href="/resources/css/bootstrap/css/bootstrap.min.css">
</head>
<body>
<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>

	<table align="center">
		<tr>
			<td>변경 전</td>
			<td>
				<img src="/resources/images/slider/${banner.bannerRename}" width="50%">
			</td>
		</tr>
		<tr>
			<td>변경 후</td>
			<td>
				<img id="preview" width="150px">
			</td>
		</tr>
		<tr>
			<td>
				<input type="file" name="uploadFile" id="uploadFile" onchange="readURL(this);" required>
			</td>
		</tr>
		<tr>
			<input type="hidden" name="bannerNo" id="bannerNo" value="${banner.bannerNo}">
			<td>
				<input  type="button" value="저장" class="btn btn-primary" id="iSubmit" onclick = "iSubmit()">
			</td>
		</tr>
	</table>

<script>
	
	function iSubmit() {
		var form = new FormData();	
		form.append("uploadFile", $("#uploadFile")[0].files[0]);
		form.append("bannerNo", $("#bannerNo").val());	
		
		jQuery.ajax({
			url: "/baenner/updateImage",
			type: "post",
			data: form,
			success: function(data) {
				if(date == "success"){
					alert("성공하였습니다.");
					window.open('','_self').close();
					opener.location.reload();
				}else(
					console.log("실패");
				)
			}error: function() {
				alert("이미지를 업로드 하세요!");
			}
		});
	}	
	
function readURL(input) {	// 파일 미리보기
	if(input.files && input.files[0]){	// 인풋 태그에 파일이 있는 경우
		var reader = new FileReader();	// FileReader 생성
		reader.onload = function(e) {	// 이미지가 로드가 된 경우
			document.getElementById('preview').src = e.target.result; 
		};
		reader.readAsDataURL(input.files[0]);	// reader가 이미지 읽도록 하기
	}else{
		document.getElementById('preview').src = "";
	}
}
	
	
	
</script>

</body>
</html>