$("#addmore").click(function() {
			var clone =$("#product_detail").clone().removeAttr("id");
			$("#detail_container").append(clone);
		});