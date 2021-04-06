package com.example.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springboot.model.User;
import com.example.springboot.model.Product;
import com.example.springboot.service.UserService;
import com.example.springboot.service.ProductService;

@Controller
public class OrdersController {

//	@Autowired
//	UserService userService;
//
//	@Autowired
//	ProductService productService;

	@RequestMapping("/")
	public String index() {
		return "Hello!";
	}

//	@RequestMapping("/users")
//	public List<User> users() {
//		return  userService.listUsers();
//	}
//
//	@RequestMapping("/products")
//	public List<Product> products() {
//		return  productService.listProducts();
//	}

}
