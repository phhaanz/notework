package com.notework.nw.controller.member;

import java.security.Principal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.notework.nw.entity.view.NoteView;
import com.notework.nw.service.member.SearchService;

@RequestMapping("/member/search/")
@Controller("memberSearchController")
public class SearchController {

	@Autowired
	private SearchService service;
	
	@GetMapping("index")
	public String index() {
		return "member.search.index";
	}
	
	@GetMapping("list-by-title")
	public String listByTitle(@RequestParam(value="title", defaultValue="") String title, Principal principal, Model model) {
		
		String writerId = principal.getName();
		List<NoteView> noteList = service.getNoteListByTitle(title, writerId);
		model.addAttribute("noteList", noteList);
		
		return "member.search.list-by-title";
	}
	
	@GetMapping("list-by-tags")
	public String listByTags(@RequestParam Map<String, Object> tags, Principal principal, Model model) {
		
		String writerId = principal.getName();
		List<NoteView> noteList = service.getNoteListByTags(tags, writerId);
		model.addAttribute("noteList", noteList);
		
		return "member.search.list-by-tags";
	}
}
