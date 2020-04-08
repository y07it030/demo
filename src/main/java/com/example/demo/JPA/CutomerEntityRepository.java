package com.example.demo.JPA;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CutomerEntityRepository extends JpaRepository<CutomerEntity,String>{

	/*
	 * @Query("select c.id,o.id,o.name from CutomerEntity c left outer join c.orders o"
	 * ) List<String[]> findByJoin();
	 */
}
