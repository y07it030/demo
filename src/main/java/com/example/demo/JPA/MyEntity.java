package com.example.demo.JPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "harsha")
@NamedQuery(name = "MyEntity.findByMyID", query = "select h from MyEntity h where h.id=?1")
@NamedNativeQuery(name="MyEntity.firstNativeQuery", query="select * from harsha where id=?")
public class MyEntity {
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "name")
	private String name;

	public MyEntity() {

	}

	public MyEntity(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
