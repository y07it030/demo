package com.example.demo.OnetoOne;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PassportRepository extends JpaRepository<Passport,String> {

}
