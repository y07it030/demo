package com.example.demo.runner;



import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.stereotype.Component;


import com.example.demo.Tools.PowMock.Adventure;
import com.example.demo.Tools.PowMock.AdventureList;

import junit.framework.Assert;


@Component
@RunWith(PowerMockRunner.class)
@PrepareForTest(Adventure.class)
public class AdventureTester {
	
	@Mock
	Adventure advn;
	
	@InjectMocks
	AdventureList adl=new AdventureList(advn);

	@Test
	public void testAdventure()
	{
		PowerMockito.mockStatic(Adventure.class);
		List<String> ai=new ArrayList<String>();
		ai.add("Swimming");

		PowerMockito.when(advn.Adventure()).thenReturn(ai);
		Assert.assertEquals("Swimming",adl.myPreference());
		
		
	}

}
