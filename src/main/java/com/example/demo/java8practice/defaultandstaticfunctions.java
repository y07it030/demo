package com.example.demo.java8practice;

@FunctionalInterface
interface Test
{
	public void show(String s);
	
}

public class defaultandstaticfunctions{
public static void main(String[] args) {
	Test t=new Test()
			{
 	public	void show(String s)
		{
			System.out.println(s);
		}
			};
			t.show("hello");
}
}
