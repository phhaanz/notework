package com.notework.nw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.notework.nw.entity.Note;
import com.notework.nw.service.NoteService;

@Controller
@RequestMapping("/note/")
public class NoteController {
	
	@Autowired
	private NoteService service;
	
	@RequestMapping("list")
	public String list(@RequestParam(value="p", defaultValue="1")Integer page, Model model) {
		List<Note> notes = service.getNoteList(page);
		model.addAttribute("notes", notes);
		model.addAttribute("pageName", "MyNote List");

		return "note.list";
	}
	
	@RequestMapping("{id}")
	public String detail(@PathVariable("id")Integer id, Model model) {
		Note note = service.getNote(id);
		model.addAttribute("note", note);
		
		return "note.detail";
	}

}
