package com.gr21.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.gr21.entity.Cart;

@Controller
@SessionAttributes("cart")
public class CartController {
	@GetMapping("addCart")
	@ResponseBody
	public void addCart(@RequestParam int product_id ,@RequestParam int size_id,@RequestParam int color_id,@RequestParam String product_name, @RequestParam String price,@RequestParam String color_name,@RequestParam String size,@RequestParam int quantity,@RequestParam String image,@RequestParam int product_detail_id,HttpSession session) {
		if(null == session.getAttribute("cart")){
			List<Cart> list = new ArrayList<Cart>();
			Cart cart = new Cart();
			cart.setProduct_name(product_name);
			cart.setProduct_id(product_id);
			cart.setProduct_detail_id(product_detail_id);
			cart.setPrice(price);
			cart.setColor_id(color_id);
			cart.setImage(image);
			cart.setQuantity(1);
			cart.setColor_name(color_name);
			cart.setSize(size);
			cart.setSize_id(size_id);
			list.add(cart);
			session.setAttribute("cart", list);
		}else {
			List<Cart> list = (List<Cart>) session.getAttribute("cart");
			int test = checkCart(list, product_id, size_id, color_id, session);
			if(test==-1) {
				Cart cart = new Cart();
				cart.setColor_id(color_id);
				cart.setImage(image);
				cart.setPrice(price);
				cart.setProduct_detail_id(product_detail_id);
				cart.setProduct_id(product_id);
				cart.setProduct_name(product_name);
				cart.setQuantity(1);
				cart.setSize(size);
				cart.setColor_name(color_name);
				cart.setSize_id(size_id);
				list.add(cart);
			}else {
				int new_quantity = list.get(test).getQuantity()+1;
				list.get(test).setQuantity(new_quantity);
			}
			for(Cart cart : list) {
				System.out.println(cart.getProduct_name() + " - "+ cart.getColor_name() + "-"+ cart.getSize() + "-"+ cart.getQuantity());
			}
		}
	}

	private int checkCart(List<Cart> list, int product_id, int size_id, int color_id, HttpSession session) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getProduct_id() == product_id && list.get(i).getSize_id() == size_id
					&& list.get(i).getColor_id() == color_id) {
				return i;
			}
		}
		return -1;
	}

	@GetMapping("/deleteCart")
	@ResponseBody
	public void deleteCart(@RequestParam int product_id,@RequestParam int size_id,@RequestParam int color_id,HttpSession session) {
		if(null!=session.getAttribute("cart")) {
			List<Cart> list = (List<Cart>) session.getAttribute("cart");
			int test = checkCart(list, product_id, size_id, color_id, session);
			list.remove(test);
		}
	}
}
