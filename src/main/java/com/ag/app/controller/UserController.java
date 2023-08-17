package com.ag.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ag.app.model.UserInfo;
import com.ag.app.service.UserService;
import com.ag.app.service.UserServiceImpl;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// Show Add User form
	@GetMapping("/")
	public String showAddNew (UserInfo userInfo) {
		
		return "newuser";
		
	}
	// Show confirmation screen
	@PostMapping("/newuserreview")
	public String dataReview (@Valid UserInfo user, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			
			return "newuser";
		}
		model.addAttribute("userlist",userService.getAllUsers());
		model.addAttribute("userobj",user);
		return "review";
		
	}
	
	
	// Send data to db
	
	@PostMapping("/insert")
	public String insertUser(UserInfo user, BindingResult result, Model model, RedirectAttributes redirect){
		
		UserInfo userInfo=userService.saveUser(user);
		if (userInfo==null) {
			redirect.addFlashAttribute("error","An error occured while saving data in the db.");
		}
		else {
		redirect.addFlashAttribute("success","Success. The new data is now in the db.");
		}
		return "redirect:/showlist";
	}
	
	// Show user list
	
	@GetMapping("/showlist")
	public String viewList(Model model) {
		
		List<UserInfo> allUserInfo=userService.getAllUsers();
		model.addAttribute("userlist",userService.getAllUsers());
		return "index";
	}
	
	@GetMapping("/backtoform")
	public String backToForm() {
		
		return "redirect:/";
	}
	

}
