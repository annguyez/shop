<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm sản phẩm</title>
<link rel="stylesheet"
	href='<c:url value="/resources/home/css/bootstrap.min.css"/>' />
<link rel="stylesheet"
	href='<c:url value="/resources/css/style.css"/>' />
	
</head>
<body>
	<div style="witdh:500px; margin: 50px">
		<form>
				<label for="product_name">Tên sản phẩm</label><br>
				<input type="text" id="product_name"><br>
			
			
				<label for="inputGroupSelect01">Danh mục</label><br>
				<select  id="inputGroupSelect01">
					<c:forEach items="${categories }" var="cat">
						<option value="${cat.getCategory_id() }">${cat.getCategory_name()}</option>
					</c:forEach>
				</select><br>
				
				<label for="price">Giá</label><br>
				<input type="number" id="price"><br>
				
				<label for="descriptions">Mô tả</label><br>
				<textarea rows="5" cols="40" id="descriptions"></textarea><br>
				
				<label for="price">Hình ảnh</label><br>
				<input type="file" id="image"><br>
				
				
				
				<!--Thông tin chi tiết-->
				<div id="detail_container">
					<div  class="product_detail">
				
					
					<span>Màu sắc</span><br>	
					<select  >
						<c:forEach items="${colors }" var="color">
							<option value="${color.getColor_id() }">${color.getColor_name()}</option>
						</c:forEach>
					</select><br>
					
					
					<span>Kích cỡ</span><br>
					<select>
						<c:forEach items="${sizes }" var="size">
							<option value="${size.getSize_id() }">${size.getSize()}</option>
						</c:forEach>
					</select><br>
				
					<label for="price">Số lượng</label><br>
					<input type="number" ><br>
					
					</div>
				
				
				</div>
				
				
				
				
				<!--Thông tin chi tiết clone-->
				<div id="product_detail" class="product_detail">
				
					
					<span>Màu sắc</span><br>	
					<select  >
						<c:forEach items="${colors }" var="color">
							<option value="${color.getColor_id() }">${color.getColor_name()}</option>
						</c:forEach>
					</select><br>
					
					
					<span>Kích cỡ</span><br>
					<select>
						<c:forEach items="${sizes }" var="size">
							<option value="${size.getSize_id() }">${size.getSize()}</option>
						</c:forEach>
					</select><br>
				
					<label for="price">Số lượng</label><br>
					<input type="number"><br>
					
				</div>
			
			<button id="addmore"type="button">Thêm chi tiết</button>
			<button type="button">Thêm sản phẩm</button>

		</form>
	</div>


</body>
<script src='<c:url value="/resources/js/jquery-3.4.1.min.js"></c:url>'></script>
<script src='<c:url value="/resources/js/addProduct.js"></c:url>'></script>
</html>