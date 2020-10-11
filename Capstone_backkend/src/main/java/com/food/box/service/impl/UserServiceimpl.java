package com.food.box.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.box.dao.UserDao;
import com.food.box.dao.AdminDao;
import com.food.box.model.User;
import com.food.box.model.Admin;
import com.food.box.service.UserService;
import com.food.box.service.AdminService;

@Service
public class UserServiceimpl implements UserService{
	
	@Autowired
	private UserDao dao;
	
	@Override
	public User addUser(User user) {
		return dao.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return dao.findAll();
	}

	@Override
	public User getUserByName(String name) {
		return dao.findByName(name);
	}

	@Override
	public User getUserByPwd(String pwd) {
		return dao.findByPwd(pwd);
	}

	@Override
	public User getUserByEmail(String emailid) {
		return dao.findByEmailid(emailid);
	}


	@Override
	public User addUserLogin(User user) {
		return dao.save(user);
	}

	@Override
	public User getUserByEmailidAndPwd(String emailid, String pwd) {
		return dao.findByEmailidAndPwd(emailid, pwd);
	}

}
