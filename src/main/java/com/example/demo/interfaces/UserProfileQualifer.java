package com.example.demo.interfaces;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component

public class UserProfileQualifer implements UserProfileDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public int getExpiryDate() {
	String x=	jdbcTemplate.queryForObject("select ID from harsha where rownum=?",String.class,new Object[] {"1"});
	System.out.println("xxxx"+x);
      // jdbcTemplate.execute("create table hari (id number(10) primary key, name varchar2(255))");
      // jdbcTemplate.update("insert into hari values(?,?)",new Object[] {101,"hello this is my second"});
    //   jdbcTemplate.update("delete from hari where id=?",new Object[] {100});

	
	
   //  jdbcTemplate.update("insert into hari values(?,?)",new Object[] {105,"hello this is my second"});
    // jdbcTemplate.update("delete from hari where id=?",new Object[] {100});
		return Integer.valueOf(x);
	}

}
