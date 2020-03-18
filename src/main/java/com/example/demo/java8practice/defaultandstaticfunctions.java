package com.example.demo.java8practice;

@FunctionalInterface
interface Test
{
	void hello();
	default void show(String s)
	{
		System.out.println(s+"hello world");
	}
}

public class defaultandstaticfunctions implements Test{
public static void main(String[] args) {
	Test t=new defaultandstaticfunctions()
			{
		
			};
			t.show("hello");
}

@Override
public void hello() {
	// TODO Auto-generated method stub
	
}
}
