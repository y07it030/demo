package com.example.demo.JPA;

import java.util.List;
import java.util.Optional;

import javax.persistence.NamedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface JPADAO extends JpaRepository<MyEntity, String> {

	// 1st way using Property name
	Optional<MyEntity> findById(long id);

//2.1 way using query postional parameters
	@Query("select h from MyEntity h where h.name=?1 and h.id=?2 ")
	List<MyEntity> findByIdAndValue(String name, String id);

	// 2.2 way using named parameters
	@Query("select h1 from MyEntity h1 where h1.name=:fname and h1.id=:fid ")
	Optional<MyEntity> findByIdAndValueNamed(@Param("fname") String fname, @Param("fid") String fid);

	List<MyEntity> findByMyID(String id);
	List<String> firstNativeQuery(String id);
	
	//Using query to execute native query of sql
	@Query(value="select * from harsha h where h.id=?1",nativeQuery=true)
	List<String> findMyNativeQuery(String id);
}
