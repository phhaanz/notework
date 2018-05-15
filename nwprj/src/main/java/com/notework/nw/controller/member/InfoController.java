package com.notework.nw.controller.member;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.notework.nw.entity.Member;
import com.notework.nw.service.member.MemberService;

@Controller
@RequestMapping("/member/info/")
public class InfoController {

	@Autowired
	private MemberService service;
	
	@GetMapping("{id}/index")
	public String index(@PathVariable("id") String id, Model model) {
		
		Member member = service.getMember(id);
		model.addAttribute("member", member);
		
		return "member.info.index";
	}
	
	@GetMapping("{id}/edit")
	public String edit(@PathVariable("id") String id, Principal principal, Model model) {
		
		Member member = service.getMember(id);
		
		String memberId = principal.getName();
		
		if(id.equals(memberId))	{
			model.addAttribute("member", member);
			return "member.info.edit";
		}
		else
			return "redirect:index?error";
	}
	
	@PostMapping("{id}/edit")
	public String edit(Member member, MultipartFile multipart) {
		
		return "redirect:index";
	}
}
