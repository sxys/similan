package com.dfj.similan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dfj.similan.dao.UserDao;
import com.dfj.similan.domain.User;

@Service 
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	



	public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  
          
    }  

}
