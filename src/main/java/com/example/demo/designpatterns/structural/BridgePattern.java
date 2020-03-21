package com.example.demo.designpatterns.structural;
//This pattern is used to implement multiple interfaces hierarchy easily by establishing a bridge between the common interfaces.

interface color {
	public void applyColor();
}

class RedColor implements color {
	public void applyColor() {
		System.out.println("RedColor");
	}
}

class GreenColor implements color {
	public void applyColor() {
		System.out.println("GreenColor");
	}
}

abstract class Shapes implements color {
	color c;

	public Shapes(color c) {
		this.c = c;
	}

	public abstract void applyColor();
}

class Triangles extends Shapes {
	public Triangles(color c) {
		super(c);
	}

	public void applyColor() {
		System.out.println("Traingle is drwan with color");
		c.applyColor();
	}
}

class Circles extends Shapes {
	public Circles(color c) {
		super(c);
	}

	public void applyColor() {
		System.out.println("Circles is drwan with color");
		c.applyColor();
	}
}

public class BridgePattern {

	public static void main(String[] args) {
		Shapes s = new Triangles(new RedColor());
		Shapes s1 = new Circles(new GreenColor());
		s.applyColor();
		s1.applyColor();
	}

}
