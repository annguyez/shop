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
                <img src="../resources/images/jeans/${pr.image }" alt="">
                <img src="../resources/images/jeans/${pr.image }" alt="">
                <img src="../resources/images/jeans/${pr.image }" alt="">
            </div>
        </div>

        <!-- Single Product Description -->
        <div class="single_product_desc clearfix">
            <span>mango</span>
            <a href="cart.html">
                <h2 class="product_id" data-product_id="${pr.product_id }" >${pr.product_name }</h2>
            </a>
            <p class="product-price " id="price" data-price="${pr.price} "><span class="old-price">$65.00</span> ${pr.price}</p>
            <p class="product-desc">${pr.descriptions }</p>

            <!-- Form -->
           <form class="cart-form clearfix" method="post">
                <!-- Select Box -->
                <div class="select-box d-flex mt-50 mb-30">
                
                    <select class="" name="select" id="productSize" class="nice-select mr-5 open">
                    <c:forEach var="sp" items="${pr.products_detail}">
                        <option value="${sp.size.size_id }">Size: ${sp.size.size }</option>
                        </c:forEach>
                    </select>
                    <select class="open nice-select mr-5" name="select" id="productColor">
                    <c:forEach var="sp" items="${pr.products_detail}">
                        <option value="${sp.color.color_id }">Color: ${sp.color.color_name }</option>
                        </c:forEach>
                    </select>
                </div>
                <!-- Cart & Favourite Box -->
                <div class="cart-fav-box d-flex align-items-center">
                    <!-- Cart -->
                    <c:forEach var="s" items="${pr.products_detail}">
                    <button type="button" name="addtocart" data-product_detail_id="${s.product_detail_id}" class="btn essence-btn btn-cart">Add to cart</button>
                    </c:forEach>
                    <!-- Favourite -->
                    <div class="product-favourite ml-4">
                        <a href="#" class="favme fa fa-heart"></a>
                    </div>
                </div>
            </form>
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
    <script src='<c:url value="../resources/home/js/cart2.js"/>'></script>
    <script src='<c:url value="../resources/home/js/ajax.js"/>'></script>
</body>
</html>