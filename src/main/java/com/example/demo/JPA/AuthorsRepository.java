package com.example.demo.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AuthorsRepository extends JpaRepository<Authors,String> {

}
