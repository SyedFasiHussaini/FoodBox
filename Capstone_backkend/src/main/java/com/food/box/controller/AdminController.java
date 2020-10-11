package com.food.box.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.food.box.model.Admin;
import com.food.box.service.AdminService;


@RestController
public class AdminController {

	@Autowired(required=true)
	private AdminService service;
	
	@PostMapping("/admin")
	@CrossOrigin(origins="http://localhost:4200")
		public Admin addAdmin(@RequestBody Admin admin) throws Exception {
		String adminname=admin.getName();
		String adminpwd=admin.getPwd();
		if(adminname!=null && !"".equals(adminname))
		{ 
			Admin adminobj=service.getAdminByName(adminname);
			if(adminobj!=null)
			{
				throw new Exception("User with Name"+adminobj+"is already exist");
			}
		}
		if(adminpwd!=null && !"".equals(adminpwd))
		{ 
			Admin adminobj=service.getAdminByName(adminpwd);
			if(adminobj!=null)
			{
				throw new Exception("User with Name"+adminobj+"is already exist");
			}
		}
		Admin adminobj=null;
		adminobj=service.addAdmin(admin);
			return adminobj;
		}


	@PostMapping("/admin/login")
	@CrossOrigin(origins="http://localhost:4200")
	public Admin addAdminlogin(@RequestBody Admin admin) throws Exception {
		String name=admin.getName();
		String pwd=admin.getPwd();
		Admin adminobj=null;
		if(name!=null && pwd!=null)
		{
			adminobj=service.getAdminByNameAndPwd(name, pwd);
		}
		if(adminobj==null)
		{
			throw new Exception("Bad credentials ");
		}
			return adminobj;
		}
		
	@GetMapping("/admins")
		public List<Admin> getAllAdmin() {

			return service.getAllAdmin();
		}
	@GetMapping("/admin/name/{name}")
	public Admin getAdminByName(@PathVariable String name) {
		
		return service.getAdminByName(name);
	}
	@GetMapping("/admin/pwd/{pwd}")
	public Admin getAdminByPwd(@PathVariable String pwd) {
		
		return service.getAdminByPwd(pwd);
	}
	@GetMapping("/admin/name/{name}/pwd/{pwd}")
	public Admin getAdminByNameAndPwd(String name, String pwd) {
		
		return service.getAdminByNameAndPwd(name, pwd);
	}


	}


