package com.example.demo.OnetoOne;

import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.stereotype.Component;

import com.example.demo.JPA.Authors;

@Component
@Entity
public class Person {
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "name")
	private String name;

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="person_fk")
	@Fetch(FetchMode.SUBSELECT) //	@Fetch(FetchMode.SUBSELECT) or	@Fetch(FetchMode.JOIN)
	private Set<Passport> passports;
	
	public Set<Passport> getPassports() {
		return passports;
	}

	public void setPassports(Set<Passport> passports) {
		this.passports = passports;
	}

	public Person() {

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

	public Person(String id, String name) {
		this.id = id;
		this.name = name;
	}

}
