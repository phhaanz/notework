package com.notework.nw.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member/search/")
@Controller("memberSearchController")
public class SearchController {

	@GetMapping("index")
	public String index()
	{
		return "member.search.index";
	}
}
