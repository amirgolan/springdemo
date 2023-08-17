package com.ag.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ag.app.model.UserInfo;
import com.ag.app.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override public List<UserInfo> getAllUsers(){
		
		return userRepository.findAll();
	}
	@Override public UserInfo saveUser(UserInfo user) {
		
		UserInfo newUser=userRepository.save(user);
		return newUser;
	}

}
