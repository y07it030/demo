package com.example.demo.JPA;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JPADAO extends JpaRepository<MyEntity, Long> {

	// 1st way using Property name
	MyEntity findById(long id);

//2.1 way using query postional parameters
	@Query("select h from MyEntity h where h.name=?1 and h.id=?2 ")
	List<MyEntity> findByIdAndValue(String name, String id);

	// 2.2 way using named parameters
	@Query("select h1 from MyEntity h1 where h1.name=:fname and h1.id=:fid ")
	Optional<MyEntity> findByIdAndValueNamed(@Param("fname") String fname,@Param("fid") String fid);
}
