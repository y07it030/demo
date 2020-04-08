package com.example.demo.JPA;

import java.util.Set;

import javax.persistence.*;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.tools.classfile.Type.MethodType;

@Entity
@Table(name = "Book")
@Component
public class Book {

	public Book() {

	}

	public Book(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "name")
	private String name;
	@JoinTable(name = "Book_Author", joinColumns = {
			@JoinColumn(name = "Book_FK") }, inverseJoinColumns = @JoinColumn(name = "Author_FK"))
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Authors> authors;
	


	public Set<Authors> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Authors> authors) {
		this.authors = authors;
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
