package com.example.demo.datasource.sqlserver.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.datasource.sqlserver.domain.Timezone;

@Repository
public interface TimeZoneRepo extends CrudRepository<Timezone, String> {

}
