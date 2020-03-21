package com.example.demo.designpatterns.creational;

import java.util.ArrayList;
import java.util.List;

//This pattern aims at reusing the existing object and avoid creating multiple similar objects
//This suggests to use cloning and shallow or deep cloning is upto the requirement
//Shallow cloning is preffered when the object has primivite type dependencies and deep when object has reference type dependencies
class Courses implements Cloneable
{
	String sub1;
	String sub2;
	String sub3;
	
	public Courses(String sub1,String sub2,String sub3)
	{
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class Student implements Cloneable
{
	private List<String> studentList;
	public Courses course;
	public List<String> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<String> studentList) {
		this.studentList = studentList;
	}
	public Courses getCourse() {
		return course;
	}
	public void setCourse(Courses course) {
		this.course = course;
	}
	public Student(List<String> studentList,Courses course)
	{
		this.studentList=studentList;
		this.course=course;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		Student s=(Student)super.clone();
		s.course=(Courses)course.clone();
	return s;
	}
}
public class PrototypeDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		Courses c=new Courses("Phgysics","Maths","Science");
		Student s1=new Student(new ArrayList<String>(), c);
		System.out.println(s1.course.sub1);
		Student s2=(Student)s1.clone();
		s1.course.sub1="social";
		System.out.println(s1.course.sub1+"--"+s2.course.sub1);
	}
}
