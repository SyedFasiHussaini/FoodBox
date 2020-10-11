package com.food.box.service;

import java.util.List;
import com.food.box.model.Admin;

public interface AdminService {

	public Admin addAdmin (Admin admin);
	public List<Admin> getAllAdmin();
	public Admin getAdminByName(String name);
	public Admin getAdminByPwd(String pwd);
	public Admin getAdminByNameAndPwd(String name,String pwd);
	public Admin addAdminlogin (Admin admin);
}