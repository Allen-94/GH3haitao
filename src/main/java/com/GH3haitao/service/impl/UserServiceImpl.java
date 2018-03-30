package com.GH3haitao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GH3haitao.dao.UserRepository;
import com.GH3haitao.module.User;
import com.GH3haitao.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User addUser(String name,String password,Integer age,Integer gender,Integer status) {
		User user=new User();
		user.setName(name);
		user.setGender(gender);
		user.setAge(age);
		user.setPassword(password);
		user.setStatus(status);
		return userRepository.save(user);
	}

	@Override
	public void delUser(Integer id) {
		userRepository.delete(id);
	}

	@Override
	public User updateUser(Integer id,String name,String password,Integer age,Integer gender,Integer status) {
		User user=new User();
		user.setId(id);
		user.setName(name);
		user.setGender(gender);
		user.setAge(age);
		user.setPassword(password);
		user.setStatus(status);
		return userRepository.save(user);
	}

	@Override
	public List<User> getUserList() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Integer id) {
		return userRepository.findOne(id);
	}

}
