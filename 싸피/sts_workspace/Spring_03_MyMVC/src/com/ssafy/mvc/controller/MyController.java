package com.ssafy.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssafy.mvc.model.dto.User;
import com.ssafy.mvc.model.service.MyService;

@Controller
public class MyController {
	
	private MyService myService;
	
	@Autowired
	public void setMyService(MyService myService) {
		this.myService=myService;
	}
	
	@RequestMapping("home")
//	@RequestMapping(value="home", method=RequestMethod.GET)
	public ModelAndView homeHandle() {
		ModelAndView mav = new ModelAndView();
		System.out.println("home 요청이 왔다");
		
//		mav.addObject("키","벨류")
		mav.addObject("msg","Welcome to Spring World");
		
		myService.doSomething();
		// view 이름을 지정을 해주자.
		// 포워딩을 한 것과 동일하다.
		mav.setViewName("home");
		return mav;
	}
	
	// Get 요청만 혹은 Post 요청만 처리할 수 있는게 있다면 좋겠다.
	// GetMapping
	// PostMapping
	
	// 반환타입이 문자열이다. (문자열 -> viewname이 된다.)
	@GetMapping("test1")
	public String test1() {
		// /WEB-INF/view/test1.jsp
		return "test1";
	}
	
	// 반환타입이 문자열일 때 가져가고 싶은 값이 있다면
	// 바구니를 준비
	@GetMapping("test2")
	public String test2(Model model) {
		model.addAttribute("msg","바구니에 데이터를 넣어서 보냈다.");
		return "test2";
	}
	
	// 파라미터로 여러 개의 값을 받고 싶다.
	// 만약 내가 쓴 파라미터 이름과 넘겨온 name의 이름이 다르다면
	// @RequestParam(value = "myid")String id -> 처리가 가능하다.
	// @RequestParam(value = "myid", required = false)String id -> required 속성을 사용하면 필수 결정 가능
	// 기본으로는 null 값
	// 기초자료형에 null 들어가는 말 되나? 기본값으로 설정을 할 수도 있다.
	// @RequestParam(defaultValue = "1")
	
	@GetMapping("test3")
	public String test3(Model model, String id, String pw, @RequestParam(defaultValue = "1")int age) {
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		
		System.out.println(age);
		return "test3";
	}
	
	// 적절한 DTO를 준비해 놓으면 알아서 들어간다.
	@PostMapping("test4")
	public String test4(Model model, User user) {
		
		System.out.println(user);
		
		return "test4";
	}
}
