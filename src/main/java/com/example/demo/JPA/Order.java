package com.example.demo.JPA;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "Orders")
public class Order {
	@Id
	@Column(name = "ORDERID")
	private String ID;
	@Column(name = "ORDERNAME")
	private String name;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="CUSTOMER_FK")
	private CutomerEntity ce;

	public CutomerEntity getCe() {
		return ce;
	}

	public void setCe(CutomerEntity ce) {
		this.ce = ce;
	}

	public Order()
	{
		
	}
	
	public Order(String ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
