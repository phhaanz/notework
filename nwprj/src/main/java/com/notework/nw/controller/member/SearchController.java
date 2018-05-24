package com.notework.nw.controller.member;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.notework.nw.entity.Preset;
import com.notework.nw.entity.view.NoteView;
import com.notework.nw.service.member.SearchService;

@RequestMapping("/member/search/")
@Controller("memberSearchController")
public class SearchController {

	@Autowired
	private SearchService service;
	
	@GetMapping("index")
	public String index(Model model) {
		model.addAttribute("pageName", "Note Search");
		
		return "member.search.index";
	}
	
	@GetMapping("list-by-title")
	public String listByTitle(@RequestParam(value="title", defaultValue="") String title, Principal principal, Model model) {
		
		String writerId = principal.getName();
		List<NoteView> noteList = service.getNoteListByTitle(title, writerId);
		model.addAttribute("noteList", noteList);
		model.addAttribute("pageName", "title : "+title);
		return "member.search.list-by-title";
	}
	
	@GetMapping("list-by-tags")
	public String listByTags(@RequestParam(value="tags", defaultValue="") String tags, Principal principal, Model model) {
		
		String writerId = principal.getName();
		List<NoteView> noteList = service.getNoteListByTags(tags, writerId);
		
		tags.replace("%23", "#");
		model.addAttribute("noteList", noteList);
		model.addAttribute("tags", tags);
		model.addAttribute("pageName", "tags : "+tags);
		
		return "member.search.list-by-tags";
	}
	
	@PostMapping("list-by-tags/reg")
	public String regPreset(String tags, Preset preset , Principal principal, HttpServletRequest request) {
		
		preset.setLinkAddress(tags);
		preset.setMemberId(principal.getName());
		
		int result = service.insertPreset(preset);
		
		return "redirect:../index";
	}
}
