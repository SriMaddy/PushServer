package com.example.demo.datasource.mysql.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.datasource.mysql.domain.MySql;

@Repository
public interface MySqlRepo extends CrudRepository<MySql, Long> {

}
