package com.food.box.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Admin") 
public class Admin {
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="Id")
		private long id;
		@Column(name="Admin_Name")
		private String name;
		@Column(name="Admin_Pwd")
		private String pwd;
		
		public Admin() {
			// TODO Auto-generated constructor stub
		}

		public Admin(long id, String name, String pwd) {
			super();
			this.id = id;
			this.name = name;
			this.pwd = pwd;
		}

		public Admin(String name, String pwd) {
			super();
			this.name = name;
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

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		@Override
		public String toString() {
			return "Admin [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
		}
}
