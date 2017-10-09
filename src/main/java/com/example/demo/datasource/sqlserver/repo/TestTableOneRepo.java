package com.example.demo.datasource.sqlserver.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.datasource.sqlserver.domain.TestTableOne;

@Repository
public interface TestTableOneRepo extends CrudRepository<TestTableOne, Long> {

}
