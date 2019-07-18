



	$("#chkAll").change(function() {
		if(this.checked){
			$("#tbProduct tbody input").each(function() {
				$(this).attr("checked",true);
			})
			
		}else{
				$("#tbProduct tbody input").each(function() {
					$(this).attr("checked",false);
				})
			}
	}
	);

	

	$("#delete").click(function() {

		 if (confirm("Xác nhận xóa")) {
			 $("#tbProduct tbody input:checked").each(function() {
				 var id=$(this).val();
				var This = $(this)
				 This.closest("tr").remove;
				  $.ajax({
		                url: '/Shop/admin/product/delete',
		                type: 'get',
		                data: {
		                	product_id: id,
		                },
	              		success: function(value){
	              			This.closest("tr").remove();
	                  		},
	              		error: function(){
							alert("Sản phẩm có mã " +id+" đã được đặt hàng,\n cần xóa các đơn hàng của sản phẩm này trước");
							confirm("Xác nhận xóa");
	                  		}
		            });
			})
		    }
		    return false;
		
	});
	
