package com.asm1.demo01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asm1.demo01.interfaces.ShoppingCartService;

@Controller
@RequestMapping("asm")
public class MyController {
	@Autowired
	ShoppingCartService cart;

	@RequestMapping("index")
	public String index() {

		return "index";
	}

	@RequestMapping("shop")
	public String shop() {

		return "shop";
	}

	@RequestMapping("blog")
	public String blog() {

		return "blog";
	}


	@RequestMapping("about")
	public String about() {

		return "about";
	}
	

}
