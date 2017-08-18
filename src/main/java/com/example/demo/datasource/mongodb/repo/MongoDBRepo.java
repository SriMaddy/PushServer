package com.example.demo.datasource.mongodb.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.datasource.mongodb.domain.MongoDB;

@Repository
public interface MongoDBRepo extends CrudRepository<MongoDB, Long> {

}
