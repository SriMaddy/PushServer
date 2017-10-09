package com.example.demo.datasource.mysql.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.datasource.mysql.domain.TokenBean;

@Repository
public interface TokenRepository extends CrudRepository<TokenBean, Long> {

}
