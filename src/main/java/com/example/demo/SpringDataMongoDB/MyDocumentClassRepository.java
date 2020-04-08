package com.example.demo.SpringDataMongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyDocumentClassRepository extends MongoRepository<MyDocumentClass,Integer>{

}
