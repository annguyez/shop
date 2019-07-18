package com.gr21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gr21.entity.Category;
import com.gr21.entity.Product;
import com.gr21.services.imp.CategoryServicesImp;
import com.gr21.services.imp.ProductServicesImpl;

@Controller
@RequestMapping(value = {"home","/"})
public class HomeController {
	@Autowired
	ProductServicesImpl productService;
	
	@Autowired
	CategoryServicesImp categoryService;
	
	@GetMapping
	@Transactional
	public String getListProduct(Model m) {
		List<Product> list = productService.getListProduct();
		List<Product> listShirt = productService.getListProductShirt();
		List<Category> listCategory = categoryService.getListCategory();
		for(Product pr : list) {
			System.out.println(pr.getProduct_name());
		}
		m.addAttribute("category", listCategory);
		m.addAttribute("shirt", listShirt);
		m.addAttribute("pr", list);
		return "index";
		
	}
}
