package com.gr21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.gr21.entity.Category;
import com.gr21.entity.Product;
import com.gr21.services.imp.CategoryServicesImp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/searchProductByCategory")
public class CategoryController {
	@Autowired
	CategoryServicesImp categoryService;
	@GetMapping
	public String getProductByCategory(Model m,@RequestParam int id) {
		List<Product> list = categoryService.searchProductByCategory(id);
		m.addAttribute("product", list);
		for(Product pr : list) {
			System.out.println(pr.getProduct_name());
		}
		return "test";
	}
}
