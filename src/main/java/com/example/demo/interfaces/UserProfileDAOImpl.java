package com.example.demo.interfaces;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import static java.lang.Integer.*;

@Component
public class UserProfileDAOImpl implements UserProfileDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public int getExpiryDate() {
		String str=jdbcTemplate.queryForObject("Select 1 from dual",String.class);
		System.out.println("dthsfhsftt"+str);
		return parseInt(str);
	}

}
