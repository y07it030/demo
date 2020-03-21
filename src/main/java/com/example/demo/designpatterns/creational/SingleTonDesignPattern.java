package com.example.demo.designpatterns.creational;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.*;

class SingleTon12 implements Serializable {
	private static SingleTon12 obj;

	private SingleTon12() {

	}

	public static SingleTon12 myInstance() {
		if (obj == null)
			obj = new SingleTon12();
		return obj;
	}

	protected Object readResolve() {
		return obj;
	}
}

/*
 * class SingleTon12 { private static final SingleTon12 obj=new SingleTon12();
 * private SingleTon12() {
 * 
 * } public static SingleTon12 myInstance() { return obj; } }
 */
/*
 * class SingleTon12 { private static SingleTon12 obj; private SingleTon12() {
 * 
 * } public static synchronized SingleTon12 myInstance() { if(obj==null) obj=new
 * SingleTon12(); return obj; } }
 */
/*
 * class SingleTon12 { private static volatile SingleTon12 obj; private
 * SingleTon12() {
 * 
 * } public static SingleTon12 myInstance() { if(obj==null) {
 * synchronized(SingleTon12.class) { if(obj==null) { obj=new SingleTon12(); } }
 * } return obj; } }
 */
public class SingleTonDesignPattern {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException {
		SingleTon12 st = SingleTon12.myInstance();
		SingleTon12 st2 = null;

		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(new File("C:\\Users\\home\\Desktop\\harsha.txt")));
		oos.writeObject(st);
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(new File("C:\\Users\\home\\Desktop\\harsha.txt")));
		st2 = (SingleTon12) ois.readObject();
		System.out.println(st == st2);
		System.out.println(st.equals(st2));
	}
}
