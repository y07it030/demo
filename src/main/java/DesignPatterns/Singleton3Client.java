package DesignPatterns;

class Singleton3 {
	private static Singleton3 obj;

	private Singleton3() {
	}

	public static synchronized Singleton3 myInstance() {
		if (obj == null)
			obj = new Singleton3();
		return obj;
	}

}

public class Singleton3Client {

	public static void main(String[] args) {
		Singleton3 obj1 = Singleton3.myInstance();
		Singleton3 obj2 = Singleton3.myInstance();
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
	}

}
