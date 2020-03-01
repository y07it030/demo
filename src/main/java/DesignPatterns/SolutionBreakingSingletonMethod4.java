package DesignPatterns;

//Breaking using Cloneable interface and cloning the object
//Solution to remove breaking
class Singleton8 implements Cloneable
{
	private static Singleton8 obj;
	private Singleton8() {}
	public static Singleton8 myInstance()
	{
		if(obj==null)
			obj=new Singleton8();
		return obj;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return Singleton8.obj;
	} 
}


public class SolutionBreakingSingletonMethod4 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton8 obj1=Singleton8.myInstance();
		Singleton8 obj2=(Singleton8)obj1.clone();
		Singleton8 obj3=Singleton8.myInstance();
		System.out.println(obj3==obj2);
		System.out.println(obj3.equals(obj2));
	}
}
