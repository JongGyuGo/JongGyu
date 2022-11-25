<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style>
	#hader{
   	    text-align: center;
	}

	#serch{
		text-align: center;
	}
	
	#boardCount{
		width: 1200px;
	    margin: auto;
	}
	
	#boardCount2{
		width: 70%;
		margin:auto;
		
	}
	#contents{
		width: 1200px;
    	margin: auto;
	}
	table{
		border-top : 1px solid;
		border-bottom: 1px solid;
		width: 70%;
		border-collapse: collapse;
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
	
	thead tr {
		background-color : #ad8e71;
		color : #ffffff;
	}
</style>
<meta charset="EUC-KR">
<title>자유게시판</title>
</head>
<body>

		<div id="hader">
			<h1>자유게시판</h1>
		</div>
			
		<div  id="serch">
			<input type="text" name="serchVal" placeholder="검색어를 입력하세요.">
			<button type="submit">검색</button>
		</div>
		
		<div id="boardCount">
			<div id="boardCount2">
				<span>총 게시물 <strong>${boardCount }</strong>건</span>
			</div>
		</div>
		
		<div id="contents">
			<table>
				<thead>
					<tr>
						<th>순번</th>
						<th>제목</th>
						<th>작성자</th>
						<th>등록일</th>
						<th>조회수</th>
					</tr>
				</thead>
					<tbody>	
				<c:forEach items="${bList }" var="board">
						<tr style="text-align: center;">
							<td>${board.boardNo }</td>
							<td><a href='/board/boardDetail?boardNo=${board.boardNo }'>${board.boardTitle }</a></td>
							<td>${board.boardWiter }</td>
							<td>${board.boardDate }</td>
							<td>${board.viewCount }</td>
						</tr>
				</c:forEach>
					</tbody>	
			</table><br>
			
			<c:if test="${sessionScope.loginUser.id ne null}">
				<div align="right">
					<button style="margin-right: 175px;" onclick="location.href='/board/writeBoardView'">글쓰기</button>
				</div>
			</c:if>
		</div>	
</body>
</html>