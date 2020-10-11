package com.food.box.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.box.model.Admin;

@Repository	
	public interface AdminDao extends JpaRepository<Admin, Long>{

		Admin findByName(String name);
		Admin findByPwd(String pwd);
		Admin findByNameAndPwd(String name, String pwd);
		
	
	
}
