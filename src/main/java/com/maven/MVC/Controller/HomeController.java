package com.maven.MVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maven.MVC.Entity.User;

@Controller
public class HomeController {

	@ModelAttribute
	public User setUpUserForm() {
		return new User();
	}

	@RequestMapping("/")
	public String home(Model model) {
		return "Home";
	}

	@RequestMapping("demo")
	public String getDmeo() {
		return "demo";
	}

	@RequestMapping("/userForm")
	public String userForm(Model model) {
		return "Userform";
	}

	@PostMapping("/submitUser")
	public String submitUser(@ModelAttribute User user, Model model) {
		model.addAttribute("message", "User submitted successfully.");
		return "Home";
	}
}