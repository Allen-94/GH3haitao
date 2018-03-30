package com.GH3haitao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.GH3haitao.module.User;
import com.GH3haitao.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	UserServiceImpl userService;

	//发送这个请求的时候form中的method与ajax中的type要写get
	@GetMapping(value = "/getList")
	@ResponseBody
	public List<User> getList() {
		return userService.getUserList();
	}

	//发送这个请求的时候form中的method与ajax中的type要写post
	@PostMapping(value = "/addUser")
	@ResponseBody
	public User addUser(@ModelAttribute("user") User user) {
		return userService.addUser(user.getName(), user.getPassword(),
				user.getAge(), user.getGender(), user.getStatus());
	}

	//发送这个请求的时候form中的method与ajax中的type要写put
	@PutMapping(value = "/updateUser")
	@ResponseBody
	public User updateUser(@ModelAttribute("user") User user) {
		return userService.updateUser(user.getId(), user.getName(),
				user.getPassword(), user.getAge(), user.getGender(),
				user.getStatus());
	}

	//发送这个请求的时候form中的method与ajax中的type要写delete
	@DeleteMapping(value = "/delUser")
	@ResponseBody
	public void delUser(Integer id) {
		userService.delUser(id);
		;
	}

}
