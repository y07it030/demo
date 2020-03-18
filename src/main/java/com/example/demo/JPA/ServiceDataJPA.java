package com.example.demo.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ServiceDataJPA {

	@Autowired
	JPADAO jPADAO;
	@Autowired
	MyEntity myEntity;

	public void getTheJpaDbDetails() {
		// getting the values using property name
		myEntity = jPADAO.findById(6);
		System.out.println(myEntity.getId() + myEntity.getName());

		// Getting the values using @Query

		List li = jPADAO.findByIdAndValue("harshavardhan", "8");
		Iterator i = li.iterator();
		while (i.hasNext()) {
			myEntity = (MyEntity) i.next();
			System.out.println("Iterating the list" + myEntity.getId() + "" + myEntity.getName());
		}
		
		Optional<MyEntity> li1 = jPADAO.findByIdAndValueNamed("harshavardhan", "9");
		if (li1.isPresent()) {
			//System.out.println(li1.get().getId());
		} else {
			li1.orElse(new MyEntity());
		}
		// Optional lik=Optional.ofNullable(li1);
		// System.out.println("Iterating the list"+lik.orElse("no such value"));

	}

}
