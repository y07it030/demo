package com.example.demo.JPA;

class Age
{
	private int year;
	public Age()
	{
		
	}
	public Age(int year)
	{
		this.year=year;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}

final class immute 
{
	private final Age age; 
	public immute(Age age)
	{
		Age cloneAge=new Age();
		cloneAge.setYear(age.getYear());
		this.age=cloneAge;
	}
	public Age getAge()
	{
		return this.age;
	}
}

public class ImmutableClass {
public static void main(String[] args) {
	Age age=new Age();
	age.setYear(2013);
	immute im=new immute(age);
	System.out.println(im.getAge().getYear()); //2013
	age.setYear(2014);
	System.out.println(im.getAge().getYear());  //2013
	
	
			
	
}
}
