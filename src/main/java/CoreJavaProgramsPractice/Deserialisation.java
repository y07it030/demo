package CoreJavaProgramsPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialisation {

	private static transient String value="hello";
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException  {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\home\\Desktop\\Online learned Points.txt")));
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("C:\\Users\\home\\Desktop\\Online learned Points.txt")));
		
		oos.writeObject(value);
		String str=(String)ois.readObject();
		System.out.println(str);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a')
				count++;
		}
		
		System.out.println("a is repeated four times"+count);
		String[] strArray=str.split("\n");
		System.out.println(strArray.length);
		int wordCount=0;
		for(int k=0;k<strArray.length;k++)
		{
		
				if(strArray[k].equals("Harsha"))
				{
					wordCount++;
				}
					
			}
		 System.out.println("Harsha is repeated"+wordCount);
		
		}
	}

