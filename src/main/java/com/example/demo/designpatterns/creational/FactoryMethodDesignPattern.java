package com.example.demo.designpatterns.creational;
//This design pattern is used to hide the logic of creating objects for dependent class by implemeting a factory abstract or interface or a normal class

//and client will get the objects through this factory class.
//it provides abstraction with inheritance

//Model
abstract class Computer {
	public abstract String getRam();

	public abstract String getHdd();
}

//Factory class

class Factory {
	public static Computer getConfiguration(String computerType, String ram, String hdd) {
		if (computerType.equals("PC"))
			return new PC(ram, hdd);
		if (computerType.equals("Mobile"))
			return new Mobile(ram, hdd);
		else
			return null;
	}

}

//Child1
class PC extends Computer {
	private String ram;
	private String hdd;

	public PC(String ram, String hdd) {
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
//Child2
class Mobile extends Computer {
	private String ram;
	private String hdd;

	public Mobile(String ram, String hdd) {
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

public class FactoryMethodDesignPattern {
public static void main(String[] args) {
	Computer pc=Factory.getConfiguration("PC","2GB","10GB");
	Computer mobile=Factory.getConfiguration("Mobile","1GB","2GB");
	System.out.println(pc.getRam()+pc.getHdd());
	System.out.println(mobile.getRam()+mobile.getHdd());
}
}
