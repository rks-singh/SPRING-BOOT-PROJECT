package com.ravi.binding;

public class User {
	
	private Integer id;
	private String name;
	private String gender;
	private Long phone;
	
	public User() {}
	
	public User(Integer id, String name, String gender, Long phone) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", phone=" + phone + "]";
	}
	
	

}
