package com.contact.entity;

public class Contact {
	
	private Long cid;
	private String email;
	private String contactname;
	private long userId;
	
	public Contact(Long cid, String email, String contactname, long userId) {
		super();
		this.cid = cid;
		this.email = email;
		this.contactname = contactname;
		this.userId = userId;
	}
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	
	
	
	

}
