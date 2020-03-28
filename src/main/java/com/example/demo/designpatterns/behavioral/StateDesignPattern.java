package com.example.demo.designpatterns.behavioral;
//This pattern is used when the object changes its behavior based on the state. For example: The states of TV when TV remote is turned on and turned off

interface State {
	public void doAction();
}

class TVStartState implements State {
	public void doAction() {
		System.out.println("TV is turned ON");
	}
}

class TVStopState implements State {
	public void doAction() {
		System.out.println("TV is turned OFF");
	}
}

class TVContext {
	public static State getAction(String action) {
		if (action.equalsIgnoreCase("Start"))
			return new TVStartState();
		if (action.equalsIgnoreCase("Stop"))
			return new TVStopState();
		else
			return null;
	}
}

public class StateDesignPattern {
	public static void main(String[] args) {
		State on = TVContext.getAction("Start");
		State off = TVContext.getAction("Stop");
		on.doAction();
		off.doAction();
	}
}
