package com.notework.nw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.notework.nw.entity.Member;


@Controller("userController")
@RequestMapping("/user/")
public class UserController {
	
	@GetMapping("login")
	public String login()	{
		return "user.login";
	}
	
	@GetMapping("agree")
	public String agree() 	{
		
		return "user.agree";
	}
	
	@GetMapping("join")
	public String join() {
		
		return "user.join";
	}
	
	@PostMapping("join")
	public String join(Member member) {
		
		return "user.success";
	}

}
