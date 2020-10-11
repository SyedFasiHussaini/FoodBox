package com.food.box.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                //important
@Table
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="emailid")
	private String emailid;
	
	@Column(name="pwd")
	private String pwd;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String emailid, String pwd) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.pwd = pwd;
	}

	public User(long id, String name, String emailid, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.pwd = pwd;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailid=" + emailid + ", pwd=" + pwd + "]";
	}
	
	
}
