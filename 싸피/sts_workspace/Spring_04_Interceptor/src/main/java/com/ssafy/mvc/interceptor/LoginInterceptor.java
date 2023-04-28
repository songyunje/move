package com.ssafy.mvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		// 검사 진행
		HttpSession session = request.getSession();
		// 로그인 할 때 id를 세션에 저장
		if(session.getAttribute("id")==null) {
			response.sendRedirect("login");
			return false; // 메인으로 되돌림
		}
		return true; // 통과
	}
	
	

}
