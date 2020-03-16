package CoreJavaProgramsPractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/*
class Harsha {
	
	private static  Harsha obj;
	private Harsha() {}
	
	public static Harsha myInstance()
	{
		if(obj==null)
		{
			obj=new Harsha();
		}
		return obj;
	}
	*/
enum Harsha {
	
	 obj;
	
	
	public static Harsha myInstance()
	{
		return obj;
	}
	

}
public class SingleTonClassBreakingandFixing 
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Harsha t1=Harsha.myInstance();
		Harsha t2=Harsha.myInstance();
	//	Harsha t3=null;
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		Class cls=Harsha.class;
		Constructor[] construtor=cls.getDeclaredConstructors();
		for(Constructor c: construtor )
		{
			c.setAccessible(true);
		//	t3=(Harsha) c.newInstance();
		}
		
		//System.out.println(t1==t3);
		//System.out.println(t1.equals(t3));
		
	}
}
