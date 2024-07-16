package com.balram.user.service.UserService.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name="micro_users")
public class User {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="Id")
	private Integer userId;
	
	@Column(name ="Name",length=20)
	private String name;
	@Column(name ="Email")
	private String email;
	@Column(name ="About")
	private String about;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", about=" + about + "]";
	}
	public User(Integer userId, String name, String email, String about) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.about = about;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
