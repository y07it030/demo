package DesignPatterns;

//Breaking using Cloneable interface and cloning the object
class Singleton6 implements Cloneable
{
	private static Singleton6 obj;
	private Singleton6() {}
	public static Singleton6 myInstance()
	{
		if(obj==null)
			obj=new Singleton6();
		return obj;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	} 
}


public class BreakingSingletonMethod2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton6 obj1=Singleton6.myInstance();
		Singleton6 obj2=(Singleton6)obj1.clone();
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
	}
}
