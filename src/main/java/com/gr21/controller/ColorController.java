package com.gr21.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gr21.dao.ProductDAO;
import com.gr21.entity.Color;

import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/color")
public class ColorController {
	@Autowired
	ProductDAO productDao;
	@ResponseBody
	@GetMapping
	public String color() {
		return "heelo";
	}
}
