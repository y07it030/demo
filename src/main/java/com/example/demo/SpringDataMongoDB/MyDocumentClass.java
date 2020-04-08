package com.example.demo.SpringDataMongoDB;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

//This class is the document entity class similar to parent entity class in spring data jpa.

@Component
@Document(collection="hello")
public class MyDocumentClass {
@Id
private Integer id;
private String name;


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
