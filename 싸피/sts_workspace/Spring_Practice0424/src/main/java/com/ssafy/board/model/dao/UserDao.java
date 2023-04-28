package com.ssafy.board.model.dao;

import java.util.List;

import com.ssafy.board.model.dto.User;

public interface UserDao {

	// id로 특정 사용자 조회
	public User selectById(String id);
	
	// 전체 사용자 조회
	public List<User> selectAll();
	
	// 사용자 등록
	public void insertUser(User user);
}
