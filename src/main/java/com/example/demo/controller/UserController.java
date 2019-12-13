package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication(scanBasePackages = "com.example.demo.controller")
@Controller
public class UserController {

	public static void main(String[] args) {
		SpringApplication.run(UserController.class, args);
	}


	@RequestMapping("/register")
	public String register(@ModelAttribute("form") User user, Model model)
	{
		model.addAttribute(user);
		return "/success.html";
	}
}
