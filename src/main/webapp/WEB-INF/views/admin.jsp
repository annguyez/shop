<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang quản lý</title>
</head>
<body>
	<a href='<c:url value="/admin/category"></c:url>'>Danh mục sản phẩm</a>
	<a href='<c:url value="/admin/color"></c:url>'>Màu sắc</a>
	<a href='<c:url value="/admin/size"></c:url>'>Kích thước</a>
	<a href='<c:url value="/admin/product"></c:url>'>Sản phẩm</a>
	<a href='<c:url value="/admin/collection"></c:url>'>Bộ sưu tập</a>
</body>
</html>