package com.example.demo.java8practice;

import java.util.HashMap;

import java.util.*;

public class LambdaToIterateMap {
	
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap();
		hm.put("harsha","vardhan");
		hm.put("Vishnu","Guttikonda");
		
		hm.keySet().forEach((key)->{
			System.out.println(key+" "+hm.get(key));		
		}
		);
	}

}
