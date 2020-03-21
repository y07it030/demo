package com.example.demo.designpatterns.structural;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

//This pattern is used to reuse an object if it is already present when the object creation is too expensive
interface Vehicle {

}

public class FlyWeightDesignPattern {
	public static Color newColor = null;
	private static Map<Color, Vehicle> hm = new HashMap<Color, Vehicle>();

	private FlyWeightDesignPattern() {
	}

	public static Vehicle createVehicle(Color color) {
		Vehicle createdVehicle = hm.computeIfAbsent(color, newColor -> {
			Engine engine = new Engine();
			Vehicle newVehicle = new Carz(engine, newColor);
			return newVehicle;
		});
		System.out.println(createdVehicle);
		return createdVehicle;
	}

	public static void main(String[] args) {
		FlyWeightDesignPattern.createVehicle(Color.green);
		FlyWeightDesignPattern.createVehicle(Color.green);
		FlyWeightDesignPattern.createVehicle(Color.orange);
	}
}

class Carz implements Vehicle {
	private Engine engine;
	private Color color;

	public Carz(Engine engine, Color color) {
		this.engine = engine;
		this.color = color;
	}

}

class Engine {
	public void start() {

	}

	public void stop() {

	}
}
