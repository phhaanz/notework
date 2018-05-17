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
	public String listByTags(@RequestParam("tags") String tags, Principal principal, Model model) {
		
		String writerId = principal.getName();
		List<NoteView> noteList = service.getNoteListByTags(tags, writerId);
		
		tags.replace("%23", "#");
		model.addAttribute("noteList", noteList);
		model.addAttribute("tags", tags);
		
		return "member.search.list-by-tags";
	}
	
	@PostMapping("list-by-tags/reg")
	@ResponseBody
	public String regPreset(String tags, Preset preset , Principal principal, HttpServletRequest request) {
		
		preset.setLinkAddress(tags);
		preset.setMemberId(principal.getName());
		
		int result = service.insertPreset(preset);
		
		String message = "등록에 실패하였습니다.";
		
		if(result!=0)
			message = "성공적으로 등록되었습니다.";
		
		return message;
	}
}
