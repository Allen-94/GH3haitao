package com.GH3haitao.service;

import java.util.List;

import com.GH3haitao.module.User;

public interface UserService {

	// 增加用户
	public User addUser(String name, String password, Integer age,
			Integer gender, Integer status);

	// 根据id删除用户；这边不推荐使用，因为jpa中的delete方法执是没有返回值的，没有返回值就不能判断是否删除成功，
	// 并且并不建议使用这种物理的方式，容易导致外键关联出错，比较建议使用状态码，进行标记用户状态
	public void delUser(Integer id);

	// 更新用户信息
	public User updateUser(Integer id, String name, String password,
			Integer age, Integer gender, Integer status);

	// 查看所有用户信息
	public List<User> getUserList();

	// 通过id获取单个用户信息
	public User getUserById(Integer id);
}
