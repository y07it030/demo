package com.example.demo.JPA;

import java.util.Set;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Authors")
@Component
public class Authors {

	public Authors() {

	}
	public Authors(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "name")
	private String name;

	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "authors")
	private Set<Book> books;

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

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
}
