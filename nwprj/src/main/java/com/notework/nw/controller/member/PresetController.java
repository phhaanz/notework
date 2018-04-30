package com.notework.nw.controller.member;

import java.util.Scanner;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/member/preset/")
public class PresetController {
	
	@GetMapping("list")
	public String list()	{
		return "member.preset.list";
	}

	
	
}
