package com.example.demo.designpatterns;

import org.springframework.stereotype.Component;
import java.lang.reflect.*;

class Singleton1
{
	private static  Singleton1 obj=new Singleton1();
	private Singleton1() {}
	
	public static void main(String[] args) {
		Singleton1 s=Singleton1.obj;
	
		Class cls= s.getClass(); 
		Constructor[] c=cls.getDeclaredConstructors();
		
	}
}

