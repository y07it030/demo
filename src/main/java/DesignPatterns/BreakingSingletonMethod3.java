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

class Singleton7 implements Serializable
{
	private static Singleton7 obj;
	private Singleton7() {}
	public static Singleton7 myInstance()
	{
		if(obj==null)
			obj=new Singleton7();
		return obj;
	}
}


public class BreakingSingletonMethod3 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Singleton7 obj1=Singleton7.myInstance();
		Singleton7 obj2=null;
		//Serialization
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\home\\Desktop\\Haari.txt")));
		oos.writeObject(obj1);
		oos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("C:\\Users\\home\\Desktop\\Haari.txt") ));
		obj2=(Singleton7)ois.readObject();
      	System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
	}
}
