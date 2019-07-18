<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<meta name="description" content="">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport"
		content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	
	<!-- Title  -->
	<title>Essence - Fashion Ecommerce Template</title>
	
	<!-- Favicon  -->
	<link rel="icon" href='<c:url value="../resources/home/img/core-img/favicon.ico" />'/>
	
	<!-- Core Style CSS -->
	<link rel="stylesheet" href='<c:url value="../resources/home/css/core-style.css"/>'/>
	<link rel="stylesheet" href='<c:url value="../resources/home/css/style.css"/>'/>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	 <section class="single_product_details_area d-flex align-items-center">

        <!-- Single Product Thumb -->
        <div class="single_product_thumb clearfix">
            <div class="product_thumbnail_slides owl-carousel image" data-image = ${pr.image }>
                <img src="../resources/images/${pr.image }" alt="">
                <img src="../resources/images/${pr.image }" alt="">
                <img src="../resources/images/${pr.image }" alt="">
            </div>
        </div>

        <!-- Single Product Description -->
        <div class="single_product_desc clearfix">
            <span>mango</span>
            <a href="../cart">
                <h2 class="product_id" data-product_id="${pr.product_id }" >${pr.product_name }</h2>
            </a>
            <p class="product-price " id="price" data-price="${pr.price} "><span class="old-price">$65.00</span> ${pr.price}</p>
            <p class="product-desc">${pr.descriptions }</p>

            <!-- Form -->
            <table class="table">
            	<thead>
            		<tr>
            			<td><h5 >Màu sản phẩmm</h5></td>
            			<td><h5>Size</h5></td>
            			<td><h5>Số lượng</h5></td>
            			<td></td>
            		</tr>
            		<c:forEach var="sp" items="${pr.products_detail}">
            		<tr>
            			<td class="color" data-color_id="${sp.color.color_id }">${sp.color.color_name }</td>
            			<td class="size" data-size_id="${sp.size.size_id }">${sp.size.size }</td>
            			<td class="quantity" data-quantity="${sp.quantity}">${sp.quantity }</td>
            			<td><button data-product_detail_id="${sp.product_detail_id}" class="btn-success btn-cart">Thêm Giỏ hàng</button></td>
            		</tr>
            		</c:forEach>
            	</thead>
            </table>
        </div>
    </section>
	
	<jsp:include page="footer.jsp"></jsp:include>
	<script src='<c:url value="../resources/home/js/jquery/jquery-2.2.4.min.js"/>'></script>
    <!-- Popper js -->
    <script src='<c:url value="../resources/home/js/popper.min.js"/>'></script>
    <!-- Bootstrap js -->
    <script src='<c:url value="../resources/home/js/bootstrap.min.js"/>'></script>
    <!-- Plugins js -->
    <script src='<c:url value="../resources/home/js/plugins.js"/>'></script>
    <!-- Classy Nav js -->
    <script src='<c:url value="../resources/home/js/classy-nav.min.js"/>'></script>
    <!-- Active js -->
    <script src='<c:url value="../resources/home/js/active.js"/>'></script>
    <script src='<c:url value="../resources/home/js/cart.js"/>'></script>
</body>
</html>