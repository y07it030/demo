package com.example.demo.bean;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class CustomerBean {
	
	@Pattern(regexp="^[A-Za-z][a-z0-9#]*")
	@Size(min=4,max=8)
	private String password;
	private String confirmpassword;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

}
