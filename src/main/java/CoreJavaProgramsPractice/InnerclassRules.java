package CoreJavaProgramsPractice;


import CoreJavaProgramsPractice.InnerclassRules.A;

public class InnerclassRules implements Test {
	

	class A
	{
		
		public void show1() {
		System.out.println("I am memeber class");
			
		}
	}
	static class B
	{

		public void show2() {
			System.out.println("I am an static memeber class");
			
		}
	}

	public static void main(String[] args) {
		
		InnerclassRules ic=new InnerclassRules();
		
		new InnerclassRules().new A().show1();
		InnerclassRules.B b=new InnerclassRules.B();
		
		b.show2();
		
		class C
		{
               
			public void show() {
				
				System.out.println("I am a local class");
				
			}
			
			
		}
		C c=new C();
		c.show();
		
		Test t=new InnerclassRules()
				{
			
			public void show()
			{
				System.out.println("I am an anyonymous class");
			}
				};
				t.show();
				
				
	}

	
	public void show5() {
		// TODO Auto-generated method stub
		
	}
	public void show() {
		// TODO Auto-generated method stub
		
	}
	

}
