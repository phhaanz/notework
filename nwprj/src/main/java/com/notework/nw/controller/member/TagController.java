package com.notework.nw.controller.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.notework.nw.entity.view.TagView;
import com.notework.nw.service.member.TagService;

@Controller("memberTagController")
@RequestMapping("/member/tag/")
public class TagController {
	
	@Autowired
	private TagService service;
	
	@GetMapping("index")
	public String index(HttpServletRequest request, Model model) {
		
		String memberId = request.getUserPrincipal().getName();
		
		List<TagView> tagList = service.getTagListByMemberId(memberId);
		List<TagView> favTagList = service.getTagFavListByMemberId(memberId);
		
		model.addAttribute("tagList", tagList);
		model.addAttribute("favTagList", favTagList);
		model.addAttribute("pageName", "MyTag List");

		return "member.tag.index";
	}

	@GetMapping("list")
	public String list(@RequestParam(value="t", defaultValue="") String id, HttpServletRequest request, Model model) {
		String memberId = request.getUserPrincipal().getName();
		
		List<TagView> tagList = null;
		
		if(id==null || id.equals(""))
			tagList = service.getTagListByMemberId(memberId);
		else
			tagList = service.getTagListById(memberId, id);
		
		model.addAttribute("tagList", tagList);
		model.addAttribute("pageName", "tag : #"+id);
		
		return "member.tag.list";
	}
	
}
