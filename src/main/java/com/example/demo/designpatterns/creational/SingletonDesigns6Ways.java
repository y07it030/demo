package com.example.demo.designpatterns.creational;

public class SingletonDesigns6Ways {

	//First early initialization
/*	private static final SingletonDesigns6Ways obj=new SingletonDesigns6Ways();
	private SingletonDesigns6Ways() {}
	public static SingletonDesigns6Ways myInstance() {
		return obj;
	}*/
	
	//Second way classic way
/*	private static SingletonDesigns6Ways obj;
	private SingletonDesigns6Ways() {}
	public static SingletonDesigns6Ways myInstance()
	{
		if(obj==null)
			obj=new SingletonDesigns6Ways();
		return obj;
	}*/
	
   //Third way using synchronized keyword
/*	private static SingletonDesigns6Ways obj;
	private SingletonDesigns6Ways() {}
	public static synchronized SingletonDesigns6Ways myInstance()
	{
		if(obj==null)
			obj=new SingletonDesigns6Ways();
		return obj;
	}
	*/
	
	// Fourth way to use synchronized double checked method
	private static volatile SingletonDesigns6Ways obj3;
	private SingletonDesigns6Ways() {}
	public static SingletonDesigns6Ways myInstance()
	{
		if(obj3==null)
		{
			synchronized (SingletonDesigns6Ways.class) {
				
				if(obj3==null)
					obj3=new SingletonDesigns6Ways();
			}
		}
		return obj3;
	}
	 


	public static void main(String[] args) {
		SingletonDesigns6Ways obj1=new SingletonDesigns6Ways();
		SingletonDesigns6Ways obj2=new SingletonDesigns6Ways();
		
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
	}
}
