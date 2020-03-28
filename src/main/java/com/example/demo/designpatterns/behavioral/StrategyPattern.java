package com.example.demo.designpatterns.behavioral;
//This pattern is used when the task has multiple algorithms to execute and client chooses one of them at runtime based on input.

//example: payement methods can be two and client can choose one of them to execute.

interface Payment {
	public void pay(int amount);
}

class CreditCardStrategy implements Payment {
	String cardNumber;
	String cvv;

	public CreditCardStrategy(String cardNumber, String cvv) {
		this.cardNumber = cardNumber;
		this.cvv = cvv;

	}

	@Override
	public void pay(int amount) {
		System.out.println("Payment is done through card payment of amount" + amount);
	}

}

class Items
{
	private String itemCode;
	private int itemCost;
	public Items(String itemCode,int itemCost)
	{
		this.itemCode=itemCode;
		this.itemCost=itemCost;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public int getItemCost() {
		return itemCost;
	}
	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}
}

class ShoppingCart
{

	static int  totalItemsCost=0;
	public void addToCart(Items item)
	{
		totalItemsCost+=item.getItemCost();
	}
	public void pay(Payment payment)
	{
	payment.pay(totalItemsCost);
	}
}

class PayPalStrategy implements Payment {

	String userName;
	String password;

	public PayPalStrategy(String userName, String password) {
		this.userName = userName;
		this.password = password;

	}

	@Override
	public void pay(int amount) {
		System.out.println("Payment is done through PayPal payment of amount" + amount);
	}

}

public class StrategyPattern {
public static void main(String[] args) {
	ShoppingCart sc=new ShoppingCart();
	sc.addToCart(new Items("1",20));
	sc.addToCart(new Items("1",40));
	sc.pay(new CreditCardStrategy("1234","546"));
	sc.pay(new PayPalStrategy("guttikonda@gmail.com","jfahgbjdb"));
}
}
