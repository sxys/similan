package com.dfj.similan.service;

import java.util.List;

import com.dfj.similan.domain.User;

public interface UserService {
	
	
	User selectUserById(Integer userId) ;
	
	List<User> selectUsers();
		

}
