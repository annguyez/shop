$(".btn-cart").click(function() {
	var color_id = $("#productSize").val();
	var color_name = $("#productSize option:selected").text();
	var size_id = $("#productColor").val();
	var size_name = $("#productColor option:selected").text();
	var product_name = $(".product_id").text();
	var product_id = $(".product_id").attr("data-product_id");
	var price =  $("#price").attr("data-price");
	var image = $(".image").attr("data-image");
	var product_detail_id  = $(this).attr("data-product_detail_id");
	alert(color_id + size_id + color_name + size_name+product_name+product_id+"----"+price+image+"---"+product_detail_id);
});