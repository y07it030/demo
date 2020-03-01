package DesignPatterns;

class Singleton {
	private static final Singleton obj = new Singleton();

	private Singleton() {
	}

	public static Singleton myInstance() {
		return obj;
	}

}

public class Singleton2Client {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.myInstance();
		Singleton obj2 = Singleton.myInstance();
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
	}

}
