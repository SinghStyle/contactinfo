package com.contactinfo.contactinfo;

public class Contacts {
	
	private Long cId;
	private String email;
	private Long userId;
	public Contacts(Long cId, String email, Long userId) {
		super();
		this.cId = cId;
		this.email = email;
		this.userId = userId;
	}
	public Contacts() {
		super();
	}
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	

}
