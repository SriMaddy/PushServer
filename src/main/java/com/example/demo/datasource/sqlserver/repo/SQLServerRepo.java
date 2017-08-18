package com.example.demo.datasource.sqlserver.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.datasource.sqlserver.domain.SQLServer;

@Repository
public interface SQLServerRepo extends CrudRepository<SQLServer, Long> {

}
