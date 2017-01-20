package com.dfj.similan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dfj.similan.domain.User;
import com.dfj.similan.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Controller
@RequestMapping(value="/dfj/user/*",  produces="text/plain;charset=UTF-8")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	



	@RequestMapping("selectUserById")
	public @ResponseBody String selectUserById(@RequestParam Integer userId) throws JsonProcessingException {
		User user = userService.selectUserById(userId);
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = mapper.writeValueAsString(user);
		
		return jsonInString;
	}
	
	
	@RequestMapping("selectUsers")
	public @ResponseBody String selectUsers() throws JsonProcessingException {
		List<User> users = userService.selectUsers();
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = mapper.writeValueAsString(users);
		
		return jsonInString;
	}
	
}
