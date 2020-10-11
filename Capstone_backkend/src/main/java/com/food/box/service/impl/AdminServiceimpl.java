package com.food.box.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.box.dao.AdminDao;
import com.food.box.dao.UserDao;
import com.food.box.model.Admin;
import com.food.box.model.User;
import com.food.box.service.AdminService;
import com.food.box.service.UserService;


@Service
public class AdminServiceimpl implements AdminService{
	
	@Autowired
	private AdminDao dao;
	
	@Override
	public Admin addAdmin(Admin admin) {
		return dao.save(admin);
	}

	@Override
	public List<Admin> getAllAdmin() {
		return dao.findAll();
	}

	@Override
	public Admin getAdminByName(String name) {
		return dao.findByName(name);
	}



	@Override
	public Admin getAdminByPwd(String pwd) {
		return dao.findByPwd(pwd);
	}

	@Override
	public Admin getAdminByNameAndPwd(String name, String pwd) {
		return dao.findByNameAndPwd(name, pwd);
	}

	@Override
	public Admin addAdminlogin(Admin admin) {
		return dao.save(admin);
	}
	
}

