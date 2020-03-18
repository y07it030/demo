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
		Integer str=jdbcTemplate.queryForObject("Select id from harsha where id=?",Integer.class,new Object[] {10});
		System.out.println("dthsfhsftt"+str);
		return str;
	}

}
