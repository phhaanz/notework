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
		String writerId = request.getUserPrincipal().getName();
		
		List<TagView> tagList = service.getTagListByWriterId(writerId);
		List<TagView> favTagList = service.getTagFavListByWriterId(writerId);
		
		model.addAttribute("tagList", tagList);
		model.addAttribute("favTagList", favTagList);

		return "member.tag.index";
	}

	@GetMapping("list")
	public String list(@RequestParam(value="t", defaultValue="") String tagId, HttpServletRequest request, Model model) {
		String writerId = request.getUserPrincipal().getName();
		
		List<TagView> tagList = null;
		
		if(tagId==null || tagId.equals(""))
			tagList = service.getTagListByWriterId(writerId);
		else
			tagList = service.getTagListByTagId(writerId, tagId);
		
		model.addAttribute("tagList", tagList);
		
		return "member.tag.list";
	}
	
}
