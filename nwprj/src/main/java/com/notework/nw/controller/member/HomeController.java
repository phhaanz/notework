package com.notework.nw.controller.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member/")
public class HomeController {

	@GetMapping("index")
	public String index()
	{
		
		return "member.index";
	}
}
