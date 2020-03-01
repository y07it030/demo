package DesignPatterns;

class Singleton4 {
	private static volatile Singleton4 obj;

	private Singleton4() {
	}

	public static Singleton4 myInstance() {
		if (obj == null) {
			synchronized (Singleton4.class) {
				if (obj == null)
					obj = new Singleton4();
			}
		}
		return obj;

	}

}

public class Singleton4Client {
	public static void main(String[] args) {
		Singleton4 obj1 = Singleton4.myInstance();
		Singleton4 obj2 = Singleton4.myInstance();
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
	}
}
