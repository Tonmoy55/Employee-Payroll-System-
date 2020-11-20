package com.techhub.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	private int id;
	private int age;
	private String username;
	private String firstname;
	private String lastname;
	private String password;
	
	
	public User() {
		
	}


	public User(int age, String username, String firstname, String lastname, String password) {
		super();
		this.age = age;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", username=" + username + ", firstname=" + firstname + ", lastname="
				+ lastname + ", password=" + password + "]";
	}
	
	
	
}
