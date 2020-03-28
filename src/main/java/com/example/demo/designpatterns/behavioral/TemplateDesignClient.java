package com.example.demo.designpatterns.behavioral;
//This pattern is used to design a template which shows step by step process that the child class should also implement to accomplish similar tasks.

//The main idea is to use a template method that should be final to avoid overriding of the same by child classes. Only overriding is given for unique functionalities with respect to different impls of template method.

abstract class Template {
	public final void buildTemplate() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildDoors();
	}

	public void buildFoundation() {
		System.out.println("This is to build foundation for all houses");
	}

	public void buildPillars() {
		System.out.println("This is to build pillars");

	}

	public abstract void buildWalls();

	public abstract void buildDoors();

}

class WoodenHouse extends Template {
	public void buildWalls() {
		System.out.println("Wooden walls");
	}

	public void buildDoors() {
		System.out.println("Wooden doors");
	}
}

class GlassHouse extends Template {
	public void buildWalls() {
		System.out.println("Glass walls");
	}

	public void buildDoors() {
		System.out.println("Glass doors");
	}
}

public class TemplateDesignClient {

	public static void main(String[] args) {

		Template tdc = new WoodenHouse();
		Template tdc1 = new GlassHouse();
		tdc.buildFoundation();
		tdc.buildPillars();
		tdc.buildWalls();
		tdc.buildDoors();
		tdc1.buildFoundation();
		tdc1.buildPillars();
		tdc1.buildWalls();
		tdc1.buildDoors();

	}

}
