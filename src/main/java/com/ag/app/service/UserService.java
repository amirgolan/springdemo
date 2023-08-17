package com.ag.app.service;

import java.util.List;

import com.ag.app.model.UserInfo;

public interface UserService {
	
	
	List<UserInfo> getAllUsers();
	UserInfo saveUser(UserInfo user);

}
