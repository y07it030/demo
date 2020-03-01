package DesignPatterns;

class Singleton1 {

	private static Singleton1 obj;

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		if (obj == null) {
			obj = new Singleton1();
		}
		return obj;
	}

}

public class Singleton1Client {
	public static void main(String[] args) {
		Singleton1 obj1 = Singleton1.getInstance();
		Singleton1 obj2 = Singleton1.getInstance();
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));

	}
}
