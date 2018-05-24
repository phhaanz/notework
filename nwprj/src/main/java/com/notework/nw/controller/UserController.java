package com.notework.nw.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

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
	public String join(Member member, MemberRole memberRole, HttpServletRequest request) throws IOException {
		
		ServletContext ctx = request.getServletContext();
		
		String copyFile = ctx.getRealPath("/resources/images/dummy/member_profile_placeholder.png");
		File copy = new File(copyFile);
		
		
		String dir = ctx.getRealPath("/resources/upload/profile/")+member.getId();	
		File f = new File(dir);
		if(!f.exists())
			f.mkdirs();
		
		InputStream is = new FileInputStream(copy);
		FileOutputStream os = new FileOutputStream(dir+File.separator+"profile.jpg");
		
		byte[] buf = new byte[1024];
		
		int size = 0;
		
		while((size=is.read(buf, 0, 1024)) != -1)
			os.write(buf, 0, size);
		
		is.close();
		os.close();

		int result = service.insertMember(member, memberRole);
		
		return "redirect:../index";
	}

}
