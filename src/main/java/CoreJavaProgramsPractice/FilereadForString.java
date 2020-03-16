package CoreJavaProgramsPractice;

import static org.mockito.Matchers.intThat;

import java.io.*;

public class FilereadForString {
	
	public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException{
		String searchWord="hello";
		int count=0;
/*	
		BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\home\\Desktop\\Online learned Points.txt")));
      for(String s= br.readLine();s!=null;s=br.readLine())
		{ 
			System.out.println(s);
			String[] str=s.split(" ");
			for(int i=0;i<=str.length-1;i++)
			{
				if(str[i].equals(searchWord))
					count++;
			}
		}
		System.out.println(searchWord+"is repeated this many times"+count);
	}*/
	
	FileReader fr=new FileReader(new File("C:\\Users\\home\\Desktop\\Online learned Points.txt"));
      for(int i=fr.read();i>=0;i=fr.read())
      {
    	if((char)i=='a')
    		count++;
      }
	
      System.out.println("a is repeated this many times"+count);

} 
	
/*	FileInputStream fis=new FileInputStream(new File("C:\\Users\\home\\Desktop\\Online learned Points.txt"));
	System.out.println(fis.read());
	for(int i=fis.read();i>=0;i=fis.read())
	{
		System.out.println((char)i);
	}
	
}*/
}
