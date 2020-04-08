package com.example.demo.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.OnetoOne.*;

import java.util.*;

import java.util.*;

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.SERIALIZABLE)
public class ServiceDataJPA {

	@Autowired
	JPADAO jPADAO;
	@Autowired
	CutomerEntityRepository cutomerEntityRepository;
	@Autowired
	OrderRepository or;
	@Autowired
	Optional<MyEntity> myEntity;
	@Autowired
	BookRepository be;
	@Autowired
	AuthorsRepository ar;
	@Autowired
	PersonRepository pr;
	@Autowired
	PassportRepository prr;

	public void nOneProblem() {
		Person p1 = new Person("20", "Lucky");
		Passport pa1 = new Passport("1","INDIA");
		Passport pa2 = new Passport("2","AUSTRALIA");
		Passport pa3 = new Passport("3","BAHRAIN");
		Set<Passport> pass = new HashSet();
		pass.add(pa1);
		pass.add(pa2);
		pass.add(pa3);
		p1.setPassports(pass);
		pr.save(p1);

	}
	
	public void solveNProblem() {
     Optional<Person> op=pr.findById("20");//pr.getDetailsOfPassports();
	System.out.println("The n values " );
        System.out.println(op.get().getId()+"--"+op.get().getName());
	}

	
	

	/*
	 * public void getOneToOneRelation() { Person p1 = new Person("20", "Lucky");
	 * Person p2 = new Person("30", "Vishnu"); Person p3 = new Person("40",
	 * "Harika");
	 * 
	 * Passport pa1 = new Passport("INDIA"); Passport pa2 = new
	 * Passport("AUSTRALIA"); Passport pa3 = new Passport("BAHRAIN");
	 * 
	 * p1.setPassportNumber(pa1); p2.setPassportNumber(pa2);
	 * p3.setPassportNumber(pa3);
	 * 
	 * 
	 * // pr.save(p1); pr.save(p2); pr.save(p3);
	 * 
	 * 
	 * pa1.setPerson(p1); pa2.setPerson(p2); pa3.setPerson(p3);
	 * 
	 * 
	 * prr.save(pa1); prr.save(pa2); prr.save(pa3);
	 * 
	 * }
	 */

	/*
	 * public void deleteAuthorByID() { Optional<Book> newBooks =
	 * be.findById("100"); Book book = newBooks.get(); Set<Authors> newAuthors =
	 * book.getAuthors();
	 * 
	 * Optional<Authors> actualAuthors = ar.findById("y07it029"); Authors
	 * actualAuthor = actualAuthors.get();
	 * 
	 * newAuthors.remove(actualAuthor);
	 * 
	 * }
	 * 
	 * public void addAuthorByID() { Optional<Book> b = be.findById("120"); Book
	 * book = b.get(); Set<Authors> allAuthorsofBook1 = book.getAuthors();
	 * 
	 * allAuthorsofBook1.add(new Authors("140", "New Language"));
	 * book.setAuthors(allAuthorsofBook1); be.save(book); }
	 */
	/*
	 * public void getManyToManyRelations() { Book b1 = new Book("100",
	 * "Core Java"); Book b2 = new Book("120", "Python"); Book b3 = new Book("130",
	 * "Hadoop");
	 * 
	 * Authors a1 = new Authors("y07it030", "harsha"); Authors a2 = new
	 * Authors("y07it029", "harika"); Authors a3 = new Authors("y07it028",
	 * "wilson"); Set<Authors> auth = new HashSet(); auth.add(a1); auth.add(a2);
	 * auth.add(a3);
	 * 
	 * b1.setAuthors(auth); b2.setAuthors(auth); b3.setAuthors(auth);
	 * 
	 * Set<Book> book = new HashSet();
	 * 
	 * book.add(b1); book.add(b2); book.add(b3);
	 * 
	 * a1.setBooks(book); a2.setBooks(book); a3.setBooks(book);
	 * 
	 * be.save(b1); be.save(b2); be.save(b3); ar.save(a1); ar.save(a2); ar.save(a3);
	 * 
	 * }
	 */

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

		/*
		 * CutomerEntity ce = new CutomerEntity("200", "harsha");
		 * 
		 * Order od1 = new Order("1", "Iphone"); Order od2 = new Order("2", "TvSet");
		 * Order od3 = new Order("3", "ComputerSet"); Set<Order> orders = new HashSet();
		 * orders.add(od1); orders.add(od2); orders.add(od3); orders.add(new
		 * Order("1000", "removedTwo")); ce.setOrders(orders);
		 * cutomerEntityRepository.save(ce); od1.setCe(ce); od2.setCe(ce);
		 * od3.setCe(ce); or.save(od1); or.save(od2); or.save(od2);
		 * System.out.println("Delete started"); or.deleteById("1");
		 * System.out.println("delete done");// or.flush();
		 */		  Pageable pageable =
		  PageRequest.of(Pageindex, 5, Sort.by("name")); Page<MyEntity> page =
		  jPADAO.findAll(pageable); List<MyEntity> lisPage = page.getContent(); int len
		  = lisPage.size(); while (len-- > 0) { System.out.println("Data for each page"
		  + lisPage.get(len).getId() + " " + lisPage.get(len).getName()); } return
		  page;
		 
	
	}



	
	/*
	 * public void getJoinQueries() { List<String[]> li =
	 * cutomerEntityRepository.findByJoin(); Iterator i = li.iterator(); while
	 * (i.hasNext()) { String[] str = (String[]) i.next();
	 * System.out.println("Join Queries"); for (String str1 : str) {
	 * System.out.print(str1); } } }
	 */
	/*
	 * public void getChildJoinQueries() { List<String[]> li = or.findByJoin();
	 * Iterator i = li.iterator(); System.out.println("Child  Queries"); while
	 * (i.hasNext()) { String[] str = (String[]) i.next(); for (String str1 : str) {
	 * System.out.print(str1); } }
	 * 
	 * }
	 */

}
