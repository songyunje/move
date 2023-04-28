package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.User;

public interface UserService {
	
	// 사용자 전체 조회
	public List<User> getUserList();
	
	// 사용자 등록
	public void signup(User user);
	
	// 로그인
	public User login(String id, String password);
}
