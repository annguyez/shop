$(".btn-cart").click(function() {
	var product_detail_id = $(this).attr("data-product_detail_id");
	var color_id = $(this).closest("tr").find(".color").attr("data-color_id");
	var color_name = $(this).closest("tr").find(".color").text();
	var size_id = $(this).closest("tr").find(".size").attr("data-size_id");
	var size = $(this).closest("tr").find(".size").text();
	var product_name = $(".product_id").text();
	var product_id = $(".product_id").attr("data-product_id");
	var price = $("#price").attr("data-price");
	var quantity = $(this).closest("tr").find(".quantity").text();
	var image = $(".image").attr("data-image");
	alert("Added")
	$.ajax({
		url:"/Shop/addCart",
		type: "GET",
		data: {
			product_id: product_id,
			color_id: color_id,
			size_id: size_id,
			color_name: color_name,
			size:size,
			product_name: product_name,
			price:price,
			quantity:quantity,
			image:image,
			product_detail_id:product_detail_id
		}		
	})
	
});
$(".delete-cart").click(function() {
	var a = $(this);
	var product_id = $(".product_id").attr("data-product_id");
	var size_id = $(this).closest("tr").find(".size").attr("data-size_id");
	var color_id = $(this).closest("tr").find(".color").attr("data-color_id");
	$.ajax({
		url:"/Shop/deleteCart",
		type: "GET",
		data: {
			product_id: product_id,
			size_id: size_id,
			color_id: color_id
		},
		success: function(value){
			a.closest("tr").remove();
		}
	})
	alert("Deleted");
});
