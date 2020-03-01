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
	

	private static UserProfile up;
	List userIds=new ArrayList();
	
@Before
	
	public void addUserIds()
	{
	up=new UserProfile();
		userIds.add("harsvard");
		userIds.add("vishvard");
		userIds.add("harshari");	}
	
	@Test(timeout=2000)
	public void testCreateProfileSuggesstion() throws TestTimedOutException,InterruptedException
	{
				Thread.sleep(2000);		
		assertEquals("harsvard1",up.CreateUserProfile(userIds,"harsvard"));
		
	}
	@Test
	public void testUserProfileSuggesstion()
	{
		assertEquals("harsvard",up.UserProfileSuggestion("harsha","vardhan"));
	}
	
@After
public void after()
{
	up=null;
}
	
}
