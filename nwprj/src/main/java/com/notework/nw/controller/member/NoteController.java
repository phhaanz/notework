package com.notework.nw.controller.member;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Principal;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.notework.nw.entity.Comment;
import com.notework.nw.entity.Image;
import com.notework.nw.entity.Note;
import com.notework.nw.entity.view.CommentView;
import com.notework.nw.entity.view.NoteView;
import com.notework.nw.service.member.NoteService;

@Controller("memberNoteController")
@RequestMapping("/member/note/")
public class NoteController {
	
	@Autowired
	private NoteService service;
	
	@GetMapping("list")
	public String list(@RequestParam(value="p", defaultValue="1")Integer page, Model model, HttpServletRequest request) {
		
		String writerId = request.getUserPrincipal().getName();
		List<NoteView> noteViews = service.getNoteListByWriterId(writerId, page);

		model.addAttribute("noteViews", noteViews);
		model.addAttribute("pageName", "MyNote List");
		
		return "member.note.list";
	}
	
	@GetMapping("{id}")
	public String detail(@PathVariable("id")Integer id, Model model) {
		int result = service.updateNoteHit(id);
		NoteView noteView = service.getNote(id);

		model.addAttribute("noteView", noteView);
		
		return "member/note/detail";
	}
	
	@GetMapping("{id}/comment")
	public String noteComment(@PathVariable("id")Integer noteId, Model model) {
		
		List<CommentView> commentList = service.getCommentList(noteId);
		
		model.addAttribute("commentList", commentList);
		
		return "member.note.comment";
	}
	
	@PostMapping("{id}/comment/reg")
	public String noteComment(@PathVariable("id")Integer noteId, Comment comment, Principal principal) {
		
		String writerId = principal.getName();
		comment.setWriterId(writerId);
		comment.setNoteId(noteId);
		int result = service.insertComment(comment);
		
		return "redirect:../comment";
	}
	
	@GetMapping("{id}/clip")
	@ResponseBody
	public String clip(@PathVariable("id")Integer noteId, Principal principal) {
		String memberId = principal.getName();
		service.insertClip(noteId, memberId);
		int cnt = service.getClipCount(noteId);

		
		return String.valueOf(cnt);
	}
	
	
	@GetMapping("edit")
	public String edit(Note note) {
		
		return "member/note/edit";
	}
	
	@GetMapping("reg")
	public String reg() {

		return "member/note/reg";
	}

	@PostMapping("reg")
	public String reg(@RequestParam("images") MultipartFile[] files, HttpServletRequest request, Note note, String tags)
	{
		String writerId = request.getUserPrincipal().getName();
		note.setWriterId(writerId);

		int noteId = service.insertNote(note, tags);
		
		if(!(files.length == 0))
		{
			try {
				ServletContext ctx = request.getServletContext();
				String path = ctx.getRealPath("/resources/upload/note/");
				
				File f = new File(path+noteId);
				
				if(!f.exists())
					f.mkdirs();
				
				for(int i=0; i< files.length; i++)
				{
					InputStream is = files[i].getInputStream();
					String imageName = files[i].getOriginalFilename();
					
					FileOutputStream os = new FileOutputStream(path+noteId+File.separator+imageName);
					
					byte[] buf = new byte[1024];
					
					int size=0;
					
					while((size=is.read(buf, 0, 1024)) != -1)
						os.write(buf, 0, size);
					
					service.insertImage(new Image(noteId, imageName));
					
					os.close();
					is.close();
				}
			} 
			catch (IOException e) {
				//에러페이지 따로 지정해주는게 무조건 좋음
				e.printStackTrace();
			}
		}
			
		return "redirect:list";
	}
	
}
