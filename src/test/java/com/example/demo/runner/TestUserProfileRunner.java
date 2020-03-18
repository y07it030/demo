package com.example.demo.runner;



import org.springframework.stereotype.Component;

import com.example.demo.bean.UserProfile;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.model.TestTimedOutException;
import org.junit.AfterClass;


@Component
public class TestUserProfileRunner {
	

	public static UserProfile up;
static	List<String> userIds=new ArrayList<String>();
	
@BeforeClass
	
	public static void addUserIds()
	{
   	    up=new UserProfile();
		userIds.add("harsvard");
		userIds.add("vishvard");
		userIds.add("harshari");	}
	
	@Test
	public void testCreateProfileSuggesstion() throws TestTimedOutException,InterruptedException
	{
		
		assertEquals("harsvard1",up.CreateUserProfile(userIds,"harsvard"));
		
	}
	@Test
	public void testUserProfileSuggesstion()
	{
		assertEquals("harsvard",up.UserProfileSuggestion("harsha","vardhan"));
	}
	
@AfterClass
public static void after()
{
	up=null;
}
	
}
