$(".quantity").change(function() {
	var quantity = $(this).val();
	var price = $(this).closest("tr").find(".price").text();
	var total = quantity * parseInt(price);
	alert(total);
	$(this).closest("tr").find(".total").html(total)+"đ";
	
})
var total = 0;
$(".totalCart").click(function() {
	var tongtien = $(".total").closest("tr").find(".total").text();
	total = total + parseInt(tongtien);
	alert(total);
	$(".totalCart").html(total);
	
})