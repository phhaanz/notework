package com.notework.nw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.notework.nw.entity.Member;
import com.notework.nw.entity.MemberRole;
import com.notework.nw.service.UserService;


@Controller("userController")
@RequestMapping("/user/")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("login")
	public String login()	{
		return "user.login";
	}
	
	@PostMapping("login")
	public String loginAuth()	{
		
		
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
	public String join(Member member, MemberRole memberRole) {
		
		int result = service.insertMember(member, memberRole);
		
		return "redirect:../index";
	}

}
