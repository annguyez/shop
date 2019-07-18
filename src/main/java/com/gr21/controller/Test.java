package com.gr21.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gr21.entity.Cart;
import com.gr21.entity.Product;
import com.gr21.entity.Size;
import com.gr21.services.ProductDetailService;
import com.gr21.services.imp.ProductServicesImpl;

@Controller
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
@SessionAttributes("cart")
@RequestMapping(value = "/details")
public class Test {
	
	@Autowired
	ProductServicesImpl productService;
	@Autowired
	ProductDetailService productDetailService;
	@GetMapping(value = "/{product_id}")
	public String getDetailProduct(@PathVariable int product_id,Model m,HttpSession session) {
		Product pr = productService.getProductDetailById(product_id);
		
		m.addAttribute("pr", pr);
		if(null != session.getAttribute("cart")) {
			List<Cart> list = (List<Cart>) session.getAttribute("cart");
			m.addAttribute("countProduct",list.size());
		}
		return "detailsProduct2";
	}
	@GetMapping(value = "/changeSize")
	@ResponseBody
	public String getSizeByColor(@RequestParam int product_id, @RequestParam int color_id) {
		
		List<Size> list = productDetailService.getSizeByColor(color_id, product_id); 
		String data ="";
		for(Size size:list) {
			data+="<option value='"+size.getSize_id()+"'> Size : "+size.getSize()+"</option>";
		}
		return data;
	}
}
