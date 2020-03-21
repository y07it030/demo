package com.example.demo.designpatterns.creational;
//This design pattern is used to avoid using if and else bloks of factory method pattern

//Also this is used to create factory of factories that each child class has each factory class
// the client calls a abstract class to get the objects of the child class.

//model
abstract class Computer1 {
	public abstract String getRam();

	public abstract String getHdd();
}

//Client1
class Desktop extends Computer1 {
	private String ram;
	private String hdd;

	public Desktop(String ram, String hdd) {
		this.ram = ram;
		this.hdd = hdd;
	}

	public String getRam() {
		return this.ram;
	}

	public String getHdd() {
		return this.hdd;
	}
}

//Client2
class Laptop extends Computer1 {
	private String ram;
	private String hdd;

	public Laptop(String ram, String hdd) {
		this.ram = ram;
		this.hdd = hdd;
	}

	public String getRam() {
		return this.ram;
	}

	public String getHdd() {
		return this.hdd;
	}
}
//Consumerentry

class ConsumerEntry {
	public static AbsFactory getConfiguration(AbsFactory af) {
		return af;
	}
}

//abstract factory class

abstract class AbsFactory {
	public abstract Computer1 getDetails();
}

// PCFactory
class PCFactory extends AbsFactory {
	public Computer1 getDetails() {
		System.out.println("10GB"+ "30GB");
		return new Desktop("10GB", "30GB");

	}
}

//LaptopFactory
class LaptopFactory extends AbsFactory {
	public Computer1 getDetails() {
		System.out.println("5GB"+ "12GB");
		return new Laptop("5GB", "12GB");

	}
}

public class AbstractFactory {
	public static void main(String[] args) {
		AbsFactory desktop = ConsumerEntry.getConfiguration(new PCFactory());
		AbsFactory laptop = ConsumerEntry.getConfiguration(new LaptopFactory());
		desktop.getDetails();
		laptop.getDetails();
	}

}
