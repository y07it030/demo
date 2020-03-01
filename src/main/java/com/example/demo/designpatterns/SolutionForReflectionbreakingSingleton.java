package com.example.demo.designpatterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.mockito.internal.util.reflection.Constructors;

import com.example.demo.designpatterns.MySingleTon.obj;

//import com.example.demo.designpatterns.MySingleTon.obj;

/*enum singletonSol
	{
		INSTANCE; //default public static final constants 
		//No constructors
		 int value;
		    public int getValue() {
		        return value;
		    }
		    public void setValue(int value) {
		        this.value = value;
		    }
	
	} */

	class MySingleTon
	{
		enum obj{
		INSTANCE;
		}
	//private static final MySingleTon sg=new MySingleTon();
		private MySingleTon () {}
		public static obj myInstance()
		{
			
			return obj.INSTANCE;
		}
	}
	
	class SolutionForReflectionbreakingSingleton
	{
	      public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
	    	  obj ms1=MySingleTon.myInstance();
	    	  obj ms2=null;
			
	    	Class c=MySingleTon.myInstance().getClass();
	    	Constructor[] constructor=c.getDeclaredConstructors();
	    	for(Constructor c1:constructor)
	    	{
	    		c1.setAccessible(true);
	    		ms2=(obj)c1.newInstance();
	    	}
	    	System.out.println(ms1.hashCode());
	    	System.out.println(ms2.hashCode());
	}
	}


	

