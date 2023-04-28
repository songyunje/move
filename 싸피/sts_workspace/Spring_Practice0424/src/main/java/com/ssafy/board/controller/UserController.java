package com.ssafy.board.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssafy.board.model.dto.User;
import com.ssafy.board.model.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("login")
	public String loginform() {
		return "user/loginform";
	}
	
	@PostMapping("login")
	public String login(HttpSession session, User user, Model model) {
		User temp = userService.login(user.getId(), user.getPassword());
		
		if(temp == null) {
			model.addAttribute("msg","로그인 실패");
			return "user/loginform";
		}else {
			session.setAttribute("loginUser", temp.getName());
			return "redirect:list";	
		}
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:list";
	}
	
	@GetMapping("signup")
	public String signupform() {
		return "user/signupform";
	}
	
	@PostMapping("signup")
	public String signup(User user) {
		userService.signup(user);
		return "redirect:login";
	}
	
	@GetMapping("userlist")
	public String showList(Model model) {
		List<User> list = userService.getUserList();
		model.addAttribute("list",list);
		return "user/userlist";
	}
	
	@GetMapping("error/404")
	public void showError404() {
	}	
}
