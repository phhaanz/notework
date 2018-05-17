package com.notework.nw.controller.member;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.notework.nw.entity.view.NoteView;
import com.notework.nw.entity.view.PresetView;
import com.notework.nw.service.member.PresetService;

@Component
@RequestMapping("/member/preset/")
public class PresetController {
	
	@Autowired
	private PresetService service;
	
	@GetMapping("list")
	public String list(Principal principal ,Model model) {
		String memberId = principal.getName();
		List<PresetView>  presetList = service.getPresetList(memberId);
		model.addAttribute("presetList", presetList);
		
		return "member.preset.list";
	}
	
	@GetMapping("{id}")
	public String noteList(@PathVariable("id") Integer id, Principal principal, Model model) {
		String memberId = principal.getName();
		List<NoteView> noteList = service.getPresetNoteList(id);
		model.addAttribute("noteList", noteList);
		
		return "member.preset.detail";
	}
	
}
