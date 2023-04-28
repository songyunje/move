package com.ssafy.board.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.User;
import com.ssafy.board.model.service.UserService;

@RestController
@RequestMapping("/api-user")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> userList() {
		return userService.getUserList();
	}
	
	@PostMapping("/signup")
	public ResponseEntity<Integer> signup(User user){
		int result = userService.signup(user);
		return new ResponseEntity<Integer>(result,HttpStatus.CREATED);
	}
	
	@PostMapping("login")
	public ResponseEntity<?> login(User user, HttpSession session) {
		User tmp = userService.login(user.getId(), user.getPassword());
		if(tmp == null) {
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		}
		session.setAttribute("loginUser", tmp);
		return new ResponseEntity<String>(tmp.getName(),HttpStatus.OK);
	}
	
	@GetMapping("logout")
	public ResponseEntity<Void> logout(HttpSession session) {
		session.invalidate();

		return new ResponseEntity<Void>(HttpStatus.OK);	
	}
}
