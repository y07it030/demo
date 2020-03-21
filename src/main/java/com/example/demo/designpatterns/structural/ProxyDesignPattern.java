package com.example.demo.designpatterns.structural;
//This pattern is used to define a surrogate for a class to control access to it.

//This eases to implement restrictions to access the object.

interface Executor {
	public void executeCommand();
}

class ExecutorImpl implements Executor {
	public void executeCommand() {
		System.out.println("Execute this command");
	}
}

class Proxy {
	Executor exe = new ExecutorImpl();
	boolean isAdmin;

	public void proxy(String command, String role) {
		if ((command.startsWith("ls") || command.startsWith("rm")) && role.equals("Admin")) {
			exe.executeCommand();
		} else if (!role.equals("Admin")) {
			System.out.println("Not Authorised to execute the command");
		}
	}
}

public class ProxyDesignPattern {

	public static void main(String[] args) {
		new Proxy().proxy("rm", "Admin");
		new Proxy().proxy("ls", "User");
	}

}
