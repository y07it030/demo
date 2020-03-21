package com.example.demo.designpatterns.structural;

import java.util.*;
//This pattern is used to represent part-Whole hierarchy that multiple objects of the same class when they have a common feature to be implemented.

interface Shape {
	public void draw(String fillColor);
}

class Triangle implements Shape {
	public void draw(String fillColor) {
		System.out.println("Triangle is filled with " + fillColor);
	}
}

class Circle implements Shape {
	public void draw(String fillColor) {
		System.out.println("Circle is filled with " + fillColor);
	}
}

class composite implements Shape {
	List<Shape> shapes = new ArrayList();

	public void draw(String fillcolor) {

		for (Shape s : shapes) {
			s.draw(fillcolor);
		}

	}

	public void add(Shape s) {
		this.shapes.add(s);
	}

	public void remove(Shape s) {
		this.shapes.remove(s);
	}

	public void clear() {
		this.shapes.clear();
	}
}

public class CompositeDesignPattern {

	public static void main(String[] args) {
		composite s = new composite();
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();
		s.add(tri);
		s.add(tri1);
		s.add(cir);
		s.draw("RedColor");
		s.clear();
		s.add(tri1);
		s.add(cir);
		s.draw("Green Color");

	}
}
