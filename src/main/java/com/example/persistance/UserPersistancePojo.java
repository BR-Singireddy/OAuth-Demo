package com.example.persistance;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("users")
public class UserPersistancePojo {

	@PrimaryKey
	private int user_id;
	private String name;
	private String password;
	private String role;
	
	public UserPersistancePojo() {}
	
	public UserPersistancePojo(int user_id, String name, String password, String role) {
		this.user_id = user_id;
		this.name = name;
		this.password = password;
		this.role = role;
	}


	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserPersistancePojo [id=" + user_id + ", name=" + name + ", password=" + password + ", role=" + role + "]";
	}
	
	
}
