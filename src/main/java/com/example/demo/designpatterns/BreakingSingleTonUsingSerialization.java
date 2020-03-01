package com.example.demo.designpatterns;

import static org.hamcrest.CoreMatchers.describedAs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


 
public class BreakingSingleTonUsingSerialization  implements Serializable
 {
     private static final BreakingSingleTonUsingSerialization st=new BreakingSingleTonUsingSerialization();
	 private BreakingSingleTonUsingSerialization() {}
        protected Object readResolve()
         {
        	 return st;
         }
        public static void main(String[] args) {
			
        	BreakingSingleTonUsingSerialization instance1=BreakingSingleTonUsingSerialization.st;
        	BreakingSingleTonUsingSerialization instance2=null;
		try {
			
        File f=new File("C:\\Users\\home\\Desktop\\Harsha.txt");
		FileOutputStream fis=new FileOutputStream(f);
	    ObjectOutputStream oos=new ObjectOutputStream(fis);
    	oos.writeObject(instance1);
       	oos.close();
	      fis.close();
	      FileInputStream fos=new FileInputStream(f);
	   ObjectInputStream ooi=new ObjectInputStream(fos);
	   instance2=(BreakingSingleTonUsingSerialization)ooi.readObject();
	   System.out.println(instance1==instance2);
	   System.out.println(instance1.equals(instance2));
		}
		catch (Exception e) {
		System.out.println(e.getMessage()+e.getCause());
		}
		
        }
	 
 }
