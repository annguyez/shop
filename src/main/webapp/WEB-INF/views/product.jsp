<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sản phẩm</title>
</head>
<body>
	<button id="delete" onclick="myFunction()">Xóa sản phẩm</button>
	<table id="tbProduct">
		<thead>
			<tr>
				<th><input id="chkAll" type="checkbox"></th>
				<th>Mã sản phẩm</th>
				<th>Tên sản phẩm</th>
				<th>Giá tiền</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="pr">
				<tr>
					<th><input class="chkProduct" type="checkbox"
						value="${pr.getProduct_id()}"></th>
					<th>${pr.getProduct_id()}</th>
					<th>${pr.getProduct_name()}</th>
					<th>${pr.getPrice()}</th>
				<tr>
			</c:forEach>

		</tbody>
	</table>

</body>
	<script src='<c:url value="/resources/js/jquery-3.4.1.min.js"></c:url>' ></script>
	<script src='<c:url value="/resources/js/deleteProduct.js"></c:url>'></script>

</html>