package com.example.demo.OnetoOne;

import java.util.Set;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Passport {
	/*
	 * @GenericGenerator(name = "f1", strategy = "foreign", parameters = {
	 * 
	 * @Parameter(name = "property", value = "person") })
	 * 
	 * @GeneratedValue(generator = "f1")
	 */
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "name")
	private String name;
	/*
	 * @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 * 
	 * @JoinColumn(name = "PERSON_FK",unique = true)
	 */
	
	
	/*
	 * @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	 * 
	 * @PrimaryKeyJoinColumn(name = "f1")
	 */
	/* private Person person; */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Passport() {

	}

	public Passport(String id,String name) {

		this.name = name;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/*
	 * public Person getPerson() { return person; }
	 * 
	 * public void setPerson(Person person) { this.person = person; }
	 */

}
