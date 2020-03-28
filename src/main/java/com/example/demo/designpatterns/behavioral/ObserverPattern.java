package com.example.demo.designpatterns.behavioral;
//This pattern is used when we want to get notice about the change in behivour of the object

// Example is when message is send by the subject the same is received and updated in Observers.

import java.util.ArrayList;
import java.util.List;

interface Subject {
	public void register(Observer obj);

	public void unRegister(Observer obj);

	public void sendUpdate(String message);

	public void sendNotifications(String message);
}

interface Observer {
	public void update(String message);
}

class SubjectImpl implements Subject {
	List<Observer> observersList;

	public SubjectImpl() {
		observersList = new ArrayList<>();
	}

	@Override
	public void register(Observer obj) {

		observersList.add(obj);
	}

	@Override
	public void unRegister(Observer obj) {

		observersList.remove(obj);
	}

	@Override
	public void sendUpdate(String Messgae) {
		sendNotifications(Messgae);
	}

	@Override
	public void sendNotifications(String message) {

		for (Observer obj : this.observersList) {
			if(message.equals(""))
			{
				obj.update(message);
				break;
			}
			obj.update(message);

		}
	}

}

class ObserversImpl implements Observer {
	private String name;

	public ObserversImpl(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		if (message == null || message.equals(""))
			System.out.println(this.name+"No new messages"+message);
		else {
			System.out.println(this.name+"Consuming messages"+message);
		}
	}

}

public class ObserverPattern {
	public static void main(String[] args) {
		Subject subject = new SubjectImpl();
		Observer ob1 = new ObserversImpl("obj1");
		Observer ob2 = new ObserversImpl("obj2");
		Observer ob3 = new ObserversImpl("obj3");
		subject.register(ob1);
		subject.register(ob2);
		subject.register(ob3);
		subject.sendUpdate("hello");

	}
}
