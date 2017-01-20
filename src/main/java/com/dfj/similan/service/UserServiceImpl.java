package com.dfj.similan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dfj.similan.dao.UserDao;
import com.dfj.similan.domain.User;
import com.dfj.similan.domain.UserExample;

@Service 
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	



	public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  
          
    }





	@Override
	public List<User> selectUsers() {
		UserExample user = new UserExample();
		user.setOrderByClause("id desc");
		return userDao.selectByExample(user);
	}  

}
