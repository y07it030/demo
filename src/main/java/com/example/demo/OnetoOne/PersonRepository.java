package com.example.demo.OnetoOne;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonRepository extends JpaRepository<Person,String> {

	/*
	 * @Query("select o.id,o.name,p.name from Person p join p.passports o ")
	 * List<String> getDetailsOfPassports();
	 */

}

