package com.example.demo.designpatterns;


class Singleton implements Cloneable
{
	public static final Singleton obj=new Singleton();
	private Singleton() {}	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return obj;
	}
	
}

public class BreakingSingleTonUsingCloning {

	public static void main(String[] args) throws Exception {
		Singleton st=Singleton.obj;
		Singleton st2=(Singleton)st.clone();
		System.out.println(st==st2);
		System.out.println(st.equals(st2));
		
	}
}
