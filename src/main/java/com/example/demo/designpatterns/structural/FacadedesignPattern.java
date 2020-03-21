package com.example.demo.designpatterns.structural;
//This pattern is used to help the clients to get the implementations of multiple interafaces easily by accessing through the 

//high level facade interface

import java.sql.Connection;

class MySQlConnection {
	public Connection getConnection() {
		System.out.println("MySQLConnection acquired");
		return null;
	}

	public void generateReports(String type) {
		if (type == "pdf")
			System.out.println("printing pdf report");
		else
			System.out.println("printing csv report");

	}
}

class OracleConnection {
	public Connection getConnection() {
		System.out.println("OracleConnection acquired");
		return null;
	}

	public void generateReports(String type) {
		if (type == "pdf")
			System.out.println("printing pdf report");
		else
			System.out.println("printing csv report");

	}
}

class Facade {
	public Facade(String type) {
		switch (type) {
		case "mysql":
			new MySQlConnection().getConnection();
			new MySQlConnection().generateReports("pdf");
			break;
		case "oracle":
			new OracleConnection().getConnection();
			new OracleConnection().generateReports("csv");
			break;
		}
	}
}

public class FacadedesignPattern {
	public static void main(String[] args) {
		new Facade("oracle");
		new Facade("mysql");

	}
}
