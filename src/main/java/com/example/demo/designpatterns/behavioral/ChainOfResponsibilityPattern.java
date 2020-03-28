package com.example.demo.designpatterns.behavioral;
//This patten is used to pass and execute a task to a group of objects and 

//let the objects decide whether to execute and passon to another object if required to execute
//Best example is ATM machine dispenser.

class Currency {
	int amount;

	public Currency(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return this.amount;
	}
}

interface ATM {
	public void dispense(int amount);

	public void chain(ATM atm);
}

class FiftyDollarDispenser implements ATM {
	private ATM atm;

	@Override
	public void chain(ATM atm) {
		this.atm = atm;
	}

	public void dispense(int amount) {
		int reminder;
		if (amount >= 50) {
			int countOfFifties = amount / 50;
			reminder = amount % 50;
			System.out.println("50's : " + countOfFifties);
			if (reminder != 0)
				this.atm.dispense(reminder);
		}
	}

}

class TenDollarDispenser implements ATM {
	private ATM atm;

	@Override
	public void chain(ATM atm) {
		this.atm = atm;
	}

	public void dispense(int amount) {
		int reminder;
		if (amount >= 10) {
			int countOfFifties = amount / 10;
			reminder = amount % 10;
			System.out.println("10's : " + countOfFifties);
			if (reminder != 0) {
				this.atm.dispense(reminder);
			}
		}
	}

}

class TwentyDollarDispenser implements ATM {
	private ATM atm;

	@Override
	public void chain(ATM atm) {
		this.atm = atm;
	}

	public void dispense(int amount) {
		if (amount >= 20) {
			int countOfTwenties = amount / 20;
			int reminder = amount % 20;
			System.out.println("20's : " + countOfTwenties);
			if (reminder != 0) {
				this.atm.dispense((reminder));
			}
		}
	}

}

public class ChainOfResponsibilityPattern {
	ATM giveMoney;

	public ChainOfResponsibilityPattern() {
		this.giveMoney = new FiftyDollarDispenser();
		ATM c2 = new TwentyDollarDispenser();
		ATM c3 = new TenDollarDispenser();
		this.giveMoney.chain(c2);
		c2.chain(c3);

	}

	public static void main(String[] args) {
		ChainOfResponsibilityPattern cr = new ChainOfResponsibilityPattern();
		cr.giveMoney.dispense(530);
	}
}
