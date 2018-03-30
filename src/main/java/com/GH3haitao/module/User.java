package com.GH3haitao.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer id;// 用户ID主键
	private String name;
	private String password;
	private Integer age;
	private Integer gender;
	private Integer status;

	// private Role role;外键角色id，暂时不加，后期规划好角色表和权限表之后再进行修改
	// 角色表其实是中间表，用户与权限之间的中间表，从而通过他来划分限制用户权限
	// private Address address;外键地址id，暂时不加，后期规划好地址表之后再进行修改
	// 用户和地址是一对多的关系，一个人可以有多个收货地址，所以需要一张单独的地址表

	public User() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
