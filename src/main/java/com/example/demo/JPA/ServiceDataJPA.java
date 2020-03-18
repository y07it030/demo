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
	Optional<MyEntity> myEntity;

	public void getTheJpaDbDetails() {
		// getting the values using property name
		myEntity = jPADAO.findById("6");
		System.out.println(myEntity.get().getId() + myEntity.get().getName());

		// Getting the values using @Query

		List li = jPADAO.findByIdAndValue("harshavardhan", "8");
		Iterator i = li.iterator();
		while (i.hasNext()) {
			myEntity = (Optional<MyEntity>) i.next();
			System.out.println("Iterating the list" + myEntity.get().getId() + "" + myEntity.get().getName());
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
