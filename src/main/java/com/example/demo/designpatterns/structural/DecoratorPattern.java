package com.example.demo.designpatterns.structural;

//This pattern is used to change the obj during runtime without any impact for other instances
// This pattern is used highly in situations to make structures from mutilple existing structures.

interface Cars {
	public void assemble();
}

class BasicCar implements Cars {
	public void assemble() {
		System.out.println("Basic car assembled");
	}
}

class Decorators implements Cars {
	Cars c;

	public Decorators(Cars c) {
		this.c = c;
	}

	public void assemble() {
		this.c.assemble();
	}
}

class SportsCar extends Decorators {

	public SportsCar(Cars c) {
		super(c);
	}

	public void assemble() {
		super.assemble();
		System.out.println("Sports car assembled");
	}
}

class LuxuryCars extends Decorators {

	public LuxuryCars(Cars c) {
		super(c);
	}

	public void assemble() {
		super.assemble();
		System.out.println("Luxury car assembled");
	}
}

public class DecoratorPattern {
	public static void main(String[] args) {
		Decorators sportsAndBasicCar = new SportsCar(new BasicCar());
		Decorators sportsAndBasicAndLuxuryCar = new SportsCar(new LuxuryCars(new BasicCar()));
		sportsAndBasicCar.assemble();
		sportsAndBasicAndLuxuryCar.assemble();
	}
}
