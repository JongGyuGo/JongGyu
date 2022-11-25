<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<!-- include libraries(jQuery, bootstrap) -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<!-- include summernote css/js -->
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
<style>
	#wapper{
		width: 1200px;
   		margin: auto;
	}
	
	#wapper2{
		width: 700px;
		margin: auto;
		text-align: center;
	}
	
	h2{
		text-align: center;
	}
	
	input.underLine {
		BORDER-BOTTOM: grey 1px solid;
		BORDER-LEFT:  none;
		BORDER-RIGHT:  none;
		BORDER-TOP:  none;
		margin : 10px;
		padding: 20px;
	}
	
	#buttonDiv {
		
	}

</style> 
 
 
<meta charset="EUC-KR">
<title>�Խù� �ۼ�</title>
</head>
<body>
	
		<h2>�Խù� �ۼ�</h2>
			<div id="wapper">
				<div id="wapper2">
				<form action="/board/writeBoard" method="get">
					<input type="text" class="underLine" name="boardTitle" size='50' required  placeholder="����"><br>
					
					<input type="text" class="underLine" name="boardWiter" size='50' value="${memberId }" placeholder="�ۼ���"><br><br><br>
					
					<textarea class="summernote"></textarea>
					
					<div id="buttonDiv" align="center">
						<button type="submit">�ۼ�</button>
					</div>
				</form>
				</div>
			</div>
<script>
	// ���ӳ�Ʈ
    $(document).ready(function() {
    	$('.summernote').summernote({
    		  height: 300,                 // ������ ����
    		  minHeight: null,             // �ּ� ����
    		  maxHeight: null,             // �ִ� ����
    		  focus: true,                  // ������ �ε��� ��Ŀ���� ������ ����
    		  lang: "ko-KR",					// �ѱ� ����
    		  placeholder: '�ִ� 2048�ڱ��� �� �� �ֽ��ϴ�'	//placeholder ����
              
    	});
    });
</script>			
</body>
</html>