package com.notework.nw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("tagController")
@RequestMapping("/tag/")
public class TagController {
	
	@GetMapping("index")
	public String index() {
		
		return "tag.index";
	}

	@GetMapping("list")
	public String list() {
		
		return "tag.list";
	}
}
