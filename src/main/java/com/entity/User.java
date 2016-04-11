package com.entity;

import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String username;
	private int age;
	private String eMail;
	private String password;
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@ManyToOne
	private User user;
	public User(int id2, String username2) {
	}
	public User(String valueOf, String password2,
			Collection<SimpleGrantedAuthority> authorities) {
		// TODO Auto-generated constructor stub
	}
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Object getRole() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setOrders(Orders orders) {
		// TODO Auto-generated method stub
		
	}
	
	}
	
	
	
	


