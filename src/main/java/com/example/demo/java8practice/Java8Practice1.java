package com.example.demo.java8practice;

import java.util.*;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.lang.*;

import java.util.*;

//This class is written to explain the various cases with Lambda Expressions
@Component
public class Java8Practice1 {
	
	static Logger log=Logger.getLogger(Java8Practice1.class);

	public static void main(String[] args) {
		List<Employee> ai = new ArrayList<Employee>();
		ai.add(new Employee(103, "Harsha"));
		ai.add(new Employee(102, "Lucky"));
		ai.add(new Employee(101, "Harika"));
//		Collections.sort(ai);

	for (Employee empo : ai) {
			log.info("Sorted by ID using comparable : " + empo.getEmpId() + " " + empo.getEmpName());
		} 
		Collections.sort(ai, new SortByName());
		for (Employee e2 : ai) {
			log.info("Sorted by Name using comparator" + e2.getEmpId() + "" + e2.getEmpName());
		}
ai.add(new Employee(105, "Harsha"));
ai.add(new Employee(106, "Harika"));
	//	ai.sort((e1,e2) -> Employee::compare(e1,e3);
	}



}

class SortByName implements Comparator<Employee> {
	private int empId;
	private String empName;

	public SortByName() {

	}

	public SortByName(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public int compare(Employee e1, Employee e2) {
		return (e1.getEmpName().compareTo(e2.getEmpName()));
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}
}

class Employee implements Comparator<Employee> {

	private int empId;
	private String empName;

	public int getEmpId() {
		return empId;
	}

	public Employee() {
	}

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public int compare(Employee o1,Employee o2) {
		return (o1.empId-(o2.empId));
	}
}
