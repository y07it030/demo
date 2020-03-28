package com.example.demo.designpatterns.behavioral;
//This pattern is used to provide Mediator to enable communication between various objects.

import java.util.*;

// Examples: Chatting application has a medium where users can send and other can receive a message.
//Here the chatting application is the mediator for users to communicate with each other.

interface ChattingMediator {
	public void sendMessage(String message, User user);

	public void addUser(User user);
}

interface User {
	public void sendMessage(String Message);

	public void receiveMessage(String Message);
}

class ChattingMediatorImpl implements ChattingMediator {
	List<User> users = new ArrayList<User>();

	@Override
	public void sendMessage(String message, User user) {

		for (User u : users) {
			if (u != user)
				u.receiveMessage(message);
		}
	}

	@Override
	public void addUser(User user) {
		users.add(user);

	}

}

class UserImpl implements User {
	ChattingMediator cm;
	String name;

	public UserImpl(ChattingMediator cm, String name) {
		this.cm = cm;
		this.name = name;
	}

	@Override
	public void sendMessage(String Message) {
		System.out.println("Message sent is " + Message + "by" + this.name);
		this.cm.sendMessage(Message, this);

	}

	@Override
	public void receiveMessage(String Message) {
		System.out.println("message received" + Message + "by" + this.name);

	}

}

public class MediatorPatternClient {
	public static void main(String[] args) {
		ChattingMediatorImpl ci = new ChattingMediatorImpl();
		User user1 = new UserImpl(ci, "harsha");
		User user2 = new UserImpl(ci, "harika");
		User user3 = new UserImpl(ci, "vishnu");
		ci.addUser(user1);
		ci.addUser(user2);
		ci.addUser(user3);
		user1.sendMessage("HiALL");
	}
}
