package DesignPatterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//Break Using Reflection technique in java by chaging the behaviour of private constructor

class Singleton5
{
	private static Singleton5 obj;
	private Singleton5() {}
	public static Singleton5 myInstance()
	{
		if(obj==null)
			obj=new Singleton5();
		return obj;
	}
}

public class BreakingSingletonMethod1 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Singleton5 obj1=Singleton5.myInstance();
		Singleton5 obj2 =null;
		
		Class cls=obj1.getClass();
		Constructor[] cons=cls.getDeclaredConstructors();
		for(Constructor c: cons)
		{
			c.setAccessible(true);
			obj2=(Singleton5)c.newInstance();
		}
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
	}
}
