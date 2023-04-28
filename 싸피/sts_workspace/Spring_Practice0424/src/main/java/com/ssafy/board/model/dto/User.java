package com.ssafy.board.model.dto;

public class User {
	private String id;
	private String password;
	private String name;
	private int cCode;
	private String cName;
	
	public User() {
	}

	public User(String id, String password, String name, int cCode, String cName) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.cCode = cCode;
		this.cName = cName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getcCode() {
		return cCode;
	}

	public void setcCode(int cCode) {
		this.cCode = cCode;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", cCode=" + cCode + ", cName=" + cName
				+ "]";
	}
}
