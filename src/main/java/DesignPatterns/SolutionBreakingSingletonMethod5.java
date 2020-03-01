package DesignPatterns;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Breaking using Serialization and deserialization technique
//Solution for breaking

class Singleton9 implements Serializable
{
	private static Singleton9 obj;
	private Singleton9() {}
	public static Singleton9 myInstance()
	{
		if(obj==null)
			obj=new Singleton9();
		return obj;
	}
	protected Object readResolve()
	{
		return obj;
	}
}


public class SolutionBreakingSingletonMethod5 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Singleton9 obj1=Singleton9.myInstance();
		Singleton9 obj2=null;
		Singleton9 obj3=Singleton9.myInstance();
		//Serialization
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\home\\Desktop\\Haari.txt")));
		oos.writeObject(obj1);
		oos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("C:\\Users\\home\\Desktop\\Haari.txt") ));
		obj2=(Singleton9)ois.readObject();
      	System.out.println(obj3==obj2);
		System.out.println(obj3.equals(obj2));
	}
}
