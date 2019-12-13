package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	@RequestMapping("/register")
	public String register(@ModelAttribute("form") User user, Model model)
	{
		model.addAttribute(user);
		return "success";
	}
}