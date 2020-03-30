package com.example.demo.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.*;

@Service
public class ServiceDataJPA {

	@Autowired
	JPADAO jPADAO;
	@Autowired
	Optional<MyEntity> myEntity;

	public Page<MyEntity> getTheJpaDbDetails(int Pageindex) {
		// getting the values using property name
		myEntity = jPADAO.findById("6");
		if (myEntity.isPresent()) {
			System.out.println(myEntity.get().getId() + myEntity.get().getName());
		} else {
			System.out.println(myEntity.orElse(new MyEntity()));
		}

		// Getting the values using @Query

		List li = jPADAO.findByIdAndValue("harshavardhan", "8");
		Iterator i = li.iterator();
		while (i.hasNext()) {
			myEntity = (Optional<MyEntity>) i.next();
			System.out.println("Iterating the list" + myEntity.get().getId() + "" + myEntity.get().getName());
		}

		Optional<MyEntity> li1 = jPADAO.findByIdAndValueNamed("harshavardhan", "9");
		if (li1.isPresent()) {
			// System.out.println(li1.get().getId());
		} else {
			li1.orElse(new MyEntity());
		}
		// Optional lik=Optional.ofNullable(li1);
		// System.out.println("Iterating the list"+lik.orElse("no such value"));
//Named Query

		List<MyEntity> namedQueryList = jPADAO.findByMyID("manga");

		for (MyEntity me : namedQueryList) {
			System.out.println(me.getId() + "" + me.getName());
		}
		List<String> namedNativeQueryList = jPADAO.firstNativeQuery("lucky");
		for (String me : namedNativeQueryList) {
			System.out.println(me);
		}

		List<String> nativeQuery = jPADAO.findMyNativeQuery("8");
		nativeQuery.forEach(System.out::println);
		
		Pageable pageable = PageRequest.of(Pageindex, 3,Sort.by("name"));
		Page<MyEntity> page = jPADAO.findAll(pageable);
		List<MyEntity> lisPage = page.getContent();
		int len = lisPage.size();
		while (len-- > 0) {
			System.out.println("Data for each page" + lisPage.get(len).getId()+" "+lisPage.get(len).getName());
		}
		return page;

	}

}
