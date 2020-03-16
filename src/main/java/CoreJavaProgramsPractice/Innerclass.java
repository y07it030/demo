package CoreJavaProgramsPractice;

interface Test
{
 void show();	
}

public class Innerclass implements Test {
	
	class A
	{
		public void show() {
		System.out.println("I am memeber class");
			
		}
	}
	static class B
	{
		public void show() {
			System.out.println("I am an static memeber class");
			
		}
	}

	public static void main(String[] args) {
		
		new Innerclass().new A().show();
		Innerclass.B b=new Innerclass.B();
		b.show();
		
		class C
		{
			public void show() {
				
				System.out.println("I am a local class");
				
			}
			
			
		}
		C c=new C();
		c.show();
		Test t=new Innerclass()
				{
			public void show()
			{
				System.out.println("I am an anyonymous class");
			}
				};
				t.show();
				
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	

}
