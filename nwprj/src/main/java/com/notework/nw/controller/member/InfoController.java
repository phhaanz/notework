package com.notework.nw.controller.member;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Principal;

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
import org.springframework.web.multipart.MultipartFile;

import com.notework.nw.entity.Member;
import com.notework.nw.service.member.MemberService;

@Controller
@RequestMapping("/member/info/")
public class InfoController {

	@Autowired
	private MemberService service;
	
	@GetMapping("{id}/index")
	public String index(@PathVariable("id") String id, Model model) {
		
		Member member = service.getMember(id);
		model.addAttribute("member", member);
		model.addAttribute("pageName", "MyInfo Index");
		
		return "member.info.index";
	}
	
	@GetMapping("{id}/edit")
	public String edit(@PathVariable("id") String id, Principal principal, Model model) {
		
		Member member = service.getMember(id);
		
		String memberId = principal.getName();
		
		if(id.equals(memberId))	{
			model.addAttribute("member", member);
			model.addAttribute("pageName", "MyInfo Edit");
			return "member.info.edit";
		}
		else
			return "redirect:index?error";
	}
	
	@PostMapping("{id}/edit")
	public String edit(@PathVariable("id") String id, @RequestParam(value="new-password") String newPassword, Member member, HttpServletRequest request, @RequestParam("profile-image") MultipartFile file) throws IOException {
		
		if(!(newPassword.equals("") || newPassword == null))
			member.setPassword(newPassword);
		
		int result = service.updateMember(member);
		
		if(!file.isEmpty())
		{
			ServletContext ctx = request.getServletContext();
			String path = ctx.getRealPath("/resources/upload/profile/");
			
			File f = new File(path+id);
	
			InputStream is = file.getInputStream();
			FileOutputStream os = new FileOutputStream(path+id+File.separator+"profile.jpg");
			
			byte[] buf = new byte[1024];
			
			int size = 0;
			
			while((size=is.read(buf, 0, 1024)) != -1)
				os.write(buf, 0, size);
		}
		return "redirect:/index";
	}
}
