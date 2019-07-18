package com.gr21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gr21.entity.Category;
import com.gr21.entity.Color;
import com.gr21.entity.Product;
import com.gr21.entity.Size;
import com.gr21.services.CategoryServices;
import com.gr21.services.ColorServices;
import com.gr21.services.ProductServices;
import com.gr21.services.SizeServices;

@Controller
@RequestMapping("/admin/product")
public class ProductController {
	
	@Autowired
	ProductServices productServices;
	@Autowired
	CategoryServices categoryServices;
	@Autowired
	ColorServices colorServices;
	@Autowired
	SizeServices sizeServices;

	@GetMapping
	public String product(ModelMap modelMap) {
		List<Product> list = productServices.getListProduct();
		modelMap.addAttribute("list", list);
		return "product";
		
	}
	
	@GetMapping("/add")
	public String addProduct(ModelMap modelMap) {
		List<Category> categories = categoryServices.getListCategory();
		List<Size> sizes = sizeServices.getListSize();
		List<Color> colors = colorServices.getListColor();
		modelMap.addAttribute("categories", categories);
		modelMap.addAttribute("sizes", sizes);
		modelMap.addAttribute("colors", colors);
		return "addproduct";
		
	}
	
	
	
	@GetMapping("/delete")
	@ResponseBody
	public String deleteProduct(@RequestParam int product_id) {
		productServices.delete(product_id);
		return "true";
	}
	

}
