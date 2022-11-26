<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>배너 등록</title>
</head>
<body>
<jsp:include page="../../admin/menuBar.jsp"></jsp:include>
<div class="page-wrapper">
	<div class="container">
		<div class="row">
			<div class="col-md-10">
				<table align="center" class="table col-10 mb-3">
					<thead align='center'>
						<tr>
						<td>#</td>
						<td>배너 이미지</td>
						<td>메세지</td>
						<td>URL주소</td>
						<td>작성자</td>
						<td></td>
						</tr>
					
					</thead>
	<c:forEach items="${bList }" var="banner" >
		<c:if test="${empty banner.bannerFileName}">
			<form action="/admin/banner/register.kh" method="post" enctype="multipart/form-data" id="bannerForm">
		</c:if>
		<c:if test="${not empty banner.bannerFileName}">
			<form action="/admin/banner/updateContents.kh" method="post" enctype="multipart/form-data" id="bannerForm">
		</c:if>
					<tbody>
					<tr>
						<td > ${banner.bannerNo }</td>
						<td align='center' width = '100px'>
						<c:if test="${not empty banner.bannerFileName}">
							<img alt="본문이미지" src="/resources/images/slider/${banner.bannerRename }" width = '100px'>
							<br><input type = 'button' class='btn' value='배너이미지 변경' onclick ='changeImageWindow(${banner.bannerNo})'>
						</c:if>
						<c:if test="${empty banner.bannerFileName}">
							<img id="preview" width='150px'/>
							<br><input type="file" name="uploadFile" id="uploadFile" onchange="readURL(this);" required="required">
						</c:if>
						</td>
						<td ><input type="text" name="bannerMsg" class = "form-control"  value="${banner.bannerMsg }" required="required"> </td>
						<td ><input type="text" name="bannerLink" class = "form-control" value="${banner.bannerLink }" required="required"> </td>
						<td ><input type="text" name="writer" class = "form-control"  value = "관리자" required="required"></td>
						<c:if test="${empty banner.bannerFileName}">
							<td><input type="submit" value="저장" class="btn btn-primary" "></td>
						</c:if>
						<c:if test="${not empty banner.bannerFileName}">
							<td  ><input type="submit" value="저장" class="btn btn-primary"  ">
							<input type="button" value="삭제" class="btn btn-danger" onclick = 'removeBanner(${banner.bannerNo})'></td>
						</c:if>
					</tr>
					</tbody>
				<input type="hidden" name="bannerNo" value='${banner.bannerNo }' >
			</form>
		</c:forEach>
				</table>
		
		
			</div>		
		</div>
	</div>
</div>
</body>
</html>