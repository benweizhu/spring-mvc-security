package me.zeph.springview.demo.domain;


import org.hibernate.validator.constraints.NotEmpty;

public class User {

	@NotEmpty
	private String name;
	@NotEmpty
	private String password;

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
}
