package DesignPatterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import DesignPatterns.Singleton10.insteadOfClass;

//Break Using Reflection technique in java by chaging the behaviour of private constructor
//Solution for breaking

class Singleton10
{
//	private static Singleton10 obj;
	enum insteadOfClass{
		obj;
	}
	private Singleton10() {}
	public static insteadOfClass myInstance()
	{
		return insteadOfClass.obj;
	}
}

public class SolutionBreakingSingletonMethod6 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		insteadOfClass obj1=Singleton10.myInstance();
		insteadOfClass obj2 =null;
		
		Class cls=obj1.getClass();
		Constructor[] cons=cls.getDeclaredConstructors();
		for(Constructor c: cons)
		{
			c.setAccessible(true);
			obj2=(insteadOfClass)c.newInstance();
		}
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
	}
}
