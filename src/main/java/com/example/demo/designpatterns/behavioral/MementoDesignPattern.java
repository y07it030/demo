package com.example.demo.designpatterns.behavioral;

class Originator {
	private String fileName;
	private StringBuffer content;

	public Originator(String fileName) {
		this.fileName = fileName;
		this.content = new StringBuffer();
	}

	public void write(String str) {
		content.append(str);
	}

	public String toString() {
		return this.content.toString();
	}

	public Memento save() {
		return new Memento(this.fileName, this.content);
	}

	public void undo(Object obj) {
		Memento m = (Memento) obj;
		this.fileName = m.fileName;
		this.content = m.content;
	}

	private class Memento {
		private String fileName;
		private StringBuffer content;

		public Memento(String fileName, StringBuffer content) {
			this.fileName = fileName;
			this.content = new StringBuffer(content);
		}
	}
}

class CareTaker {
	private Object obj;

	public void save(Originator or) {
		this.obj = or.save();
	}

	public void undo(Originator or) {
		or.undo(obj);
	}
}

public class MementoDesignPattern {
	public static void main(String[] args) {
		CareTaker cr=new CareTaker();
		Originator or=new Originator("Data.txt");
		or.write("FirstData");
		cr.save(or);
		System.out.println(or.toString());
		or.write("SecondData");
		System.out.println(or.toString());
		cr.undo(or);
		System.out.println(or.toString());
	}

}