package com.example.demo.designpatterns.behavioral;
//This Pattern to used to apply operations on a similar kind of objects

//For example a shopping cart where items are added finally their total price is calculated 

abstract class Visitor {

	public abstract int getBookPrice();

	public abstract int getFruitsPrice();

}

class Items1 extends Visitor {
	int totalPrice = 0;

	public Items1() {
		totalPrice = getBookPrice() + getFruitsPrice();
		System.out.println("The total Price is" + totalPrice);
	}

	@Override
	public int getBookPrice() {
		return 20;
	}

	@Override
	public int getFruitsPrice() {
		return 30;
	}

}

class VisitorImpl {
	public static Visitor CalculateTotalPrice() {
		Visitor i = new Items1();
		return i;
	}
}

public class visitorDesignPattern {
	public static void main(String[] args) {
		VisitorImpl.CalculateTotalPrice();
	}
}
