package com.notework.nw.controller.member;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.notework.nw.entity.Preset;
import com.notework.nw.service.member.PresetService;

@Component
@RequestMapping("/member/preset/")
public class PresetController {
	
	@Autowired
	private PresetService service;
	
	@GetMapping("list")
	public String list()	{
		return "member.preset.list";
	}

	
	@PostMapping("reg")
	@ResponseBody
	public void reg(Preset preset , Principal principal) {
		
		preset.setMemberId(principal.getName());
		
		int result = service.insertPreset(preset);
		
	}
	
	
}
