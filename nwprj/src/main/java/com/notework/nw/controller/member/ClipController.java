package com.notework.nw.controller.member;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.notework.nw.entity.view.NoteView;
import com.notework.nw.service.member.ClipService;
import com.notework.nw.service.member.NoteService;

@Controller("memberClipController")
@RequestMapping("/member/clip")
public class ClipController {

	@Autowired
	private ClipService service;
	
	@GetMapping("list")
	public String list(Principal principal, Model model)	{
		
		String memberId = principal.getName();
		List<NoteView> noteViews = service.getNoteListByClip(memberId);
		model.addAttribute("noteViews", noteViews);
		model.addAttribute("pageName", "MyClip List");
		
		return "member.clip.list";
	}
}
