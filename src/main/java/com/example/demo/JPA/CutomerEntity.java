package com.example.demo.JPA;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.*;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Customer")
public class CutomerEntity {
	
	@Id
	@Column(name="ID")
	private String id;
	@Column(name="NAME")
	private String name;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy = "ce",orphanRemoval = false)
	//@JoinColumn(name = "CUSTOMER_FK",referencedColumnName ="ID")
	private Set<Order> orders;
	public CutomerEntity()
	{
		
	}
	@Override
	public String toString() {
		return "CutomerEntity [id=" + id + ", name=" + name + ", orders=" + orders + "]";
	}
	public CutomerEntity(String id,String name)
	{
		this.id=id;
		this.name=name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	
	
	
	
	

}
