package com.notework.nw.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("memberTagController")
@RequestMapping("/member/tag/")
public class TagController {
	
	@GetMapping("index")
	public String index() {
		
		
		return "member.tag.index";
	}

	@GetMapping("list")
	public String list() {
		
		
		return "member.tag.list";
	}
	
}