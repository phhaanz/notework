package com.notework.nw.controller.member;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.notework.nw.entity.Note;
import com.notework.nw.service.member.NoteService;

@Controller("memberNoteController")
@RequestMapping("/member/note/")
public class NoteController {
	
	@Autowired
	private NoteService service;
	
	@RequestMapping("list")
	public String list(@RequestParam(value="p", defaultValue="1")Integer page, Model model) {
		List<Note> notes = service.getNoteList(page);
		model.addAttribute("notes", notes);

		return "member.note.list";
	}
	
	@RequestMapping("{id}")
	public String detail(@PathVariable("id")Integer id, Model model) {
		Note note = service.getNote(id);
		model.addAttribute("note", note);
		
		return "member.note.detail";
	}
	
	@RequestMapping("edit")
	public String edit(Note note) {
		
		return "member.note.edit";
	}
	
	@GetMapping("reg")
	public String reg() {
		
		return "member.note.reg";
	}

	@PostMapping("reg")
	public String reg(Note note, MultipartFile file, HttpServletRequest request)
	{
		int result = service.insertNote(note);
		
		try {
			ServletContext ctx = request.getServletContext();
			String path = ctx.getRealPath("/resources/upload/");
			String id = "himan";
			
			File f = new File(path+id);
			
			if(!f.exists())
				f.mkdirs();
			
			InputStream is = file.getInputStream();
			String fname = file.getOriginalFilename();
			
			FileOutputStream os = new FileOutputStream(path+id+File.separator+fname);
			
			byte[] buf = new byte[1024];
			
			int size=0;
			
			while((size=is.read(buf, 0, 1024)) != -1)
				os.write(buf, 0, size);
			
			os.close();
			is.close();
		} 
		catch (IOException e) {
			//에러페이지 따로 지정해주는게 무조건 좋음
			e.printStackTrace();
		}
		
		return "redirect:list";
	}
	
}
