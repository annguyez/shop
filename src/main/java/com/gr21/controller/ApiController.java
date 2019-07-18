//package com.gr21.controller;
//
//import java.util.*;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.gr21.dao.ProductDAO;
//import com.gr21.entity.Size;
//
//@Controller
//@RequestMapping("/size/getcolor")
//public class ApiController {
//	@Autowired
//	ProductDAO productDAO;
//	@ResponseBody
//	@GetMapping
//	public String Default(@RequestParam int color_id) {
//		
//		Size s1 = new Size();
//		Size s2 = new Size();
//		Size s3 = new Size();
//		Size s4 = new Size();
//		s1.setSize_id(1);
//		s1.setSize("1");
//		
//		s2.setSize_id(2);
//		s2.setSize("2");
//		
//		
//		s3.setSize_id(3);
//		s3.setSize("3");
//		
//		s4.setSize_id(4);
//		s4.setSize("4");
//		
//		
//	}
//	
//}
