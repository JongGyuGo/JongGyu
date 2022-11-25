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

	#hader{
   	    text-align: center;
	}
	
	#tableDiv{
		width : 1200px;
		margin: auto;
	}

	table{
		border-top : 1px solid;
		border-bottom: 1px solid;
		border-left: none;
		border-right: 0px;		
		border-collapse: collapse;
		width: 70%;
		margin-left : auto;
		margin-right : auto;
	}
	
	th, td{
		border-left : 1px solid;
		border-bottom : 1px solid;
		padding : 10px;
	}
	
		th:first-child, td:first-child {
		border-left : none;
	}
	
</style>
<meta charset="EUC-KR">
<title>�Խñ� ����ȸ</title>
</head>
<body>
	<div id="hader">
		<h2>�Խñ� ����ȸ</h2>
	</div>
	<hr>
	
	<div id="tableDiv">
		<table>
			<colgroup>
				<col width="15%"/>
				<col width="35%"/>
				<col width="15%"/>
				<col width="35%"/>
			</colgroup>
			<thead>
				<tr>
					<th>�۹�ȣ</th><td>${board.boardNo }</td><th>��ȸ��</th><td>${board.viewCount }</td>
				</tr>
				<tr>
					<th>�ۼ���</th><td>${board.boardWiter }</td><th>�ۼ���</th><td>${board.boardDate }</td>
				</tr>
				<tr>
					<th>����</th><td colspan="4">${board.boardTitle }</td>
				</tr>
				<tr>
					<td colspan="4">
						<textarea class="summernote">${board.boardContent }</textarea>
					</td>
				</tr>
			</thead>
		</table>
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