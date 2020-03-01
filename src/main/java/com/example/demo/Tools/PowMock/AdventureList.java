package com.example.demo.Tools.PowMock;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class AdventureList {
	
	Adventure adv;
	
	public AdventureList(Adventure adv)
	{
		this.adv=adv;
	}
	
	public String myPreference()
	{
		String myChoice="Swimming";
        List myList= adv.Adventure();	
        if(myList.contains(myChoice)) 
		return myChoice;
        else
        	return "My chioce is not considered";
	}

}
