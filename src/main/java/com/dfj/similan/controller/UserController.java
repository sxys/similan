package com.dfj.similan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dfj.similan.domain.User;
import com.dfj.similan.service.UserService;


@Controller
@RequestMapping("/dfj/user/*")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	



	@RequestMapping("query")
	public @ResponseBody String query() {
		User user = userService.selectUserById(11);
		
		return user.getCountry();
	}
}
