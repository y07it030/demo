package com.example.demo.bean;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class CustomerBean {
	
	@Pattern(regexp="^[A-Za-z][a-z0-9#]*")
	@Size(min=4,max=8)
	private String password;
	private String confirmpassword;
	private String country;
	public String getCountry() {
		return country;
	}



	



	public void setCountry(String country) {
		this.country = country;
	}
	public Map countries=new HashMap();
	
	public CustomerBean()
	{
		this.countries.put("Australia","Australia");
		this.countries.put("INDIA","India");
	}
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Map getCountries() {
		return countries;
	}
	public void setCountries(Map countries) {
		this.countries = countries;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

}
