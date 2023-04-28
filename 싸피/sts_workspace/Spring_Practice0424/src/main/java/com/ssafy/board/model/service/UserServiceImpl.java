package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.board.model.dao.UserDao;
import com.ssafy.board.model.dto.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userdao;

	@Override
	public List<User> getUserList() {
		return userdao.selectAll();
	}

	@Override
	public void signup(User user) {
		userdao.insertUser(user);
	}

	@Override
	public User login(String id, String password) {
		User temp = userdao.selectById(id);
		
		if(temp != null && temp.getPassword().equals(password)) {
			return temp;
		}
		return null;
	}
}
