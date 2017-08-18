package com.example.demo.datasource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.datasource.sqlserver.domain.SQLServer;
import com.example.demo.datasource.sqlserver.repo.SQLServerRepo;
import com.example.demo.datasource.mysql.domain.MySql;
import com.example.demo.datasource.mysql.repo.MySqlRepo;
import com.google.gson.Gson;

@RestController
@RequestMapping("/dualdb")
public class DualDBController {

	@Autowired
	private MySqlRepo mysqlRepo;

	@Autowired
	private SQLServerRepo sqlServerRepo;

	@RequestMapping(value = "/saveInTest1DB", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MySql> saveNameInMySqlDB(@RequestBody String body) {
		Gson gson = new Gson();
		MySql mySql = gson.fromJson(body, MySql.class);
		mySql = mysqlRepo.save(mySql);
		return new ResponseEntity<>(mySql, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/saveInTest2DB", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SQLServer> saveNameInSqlServerDB(@RequestBody String body) {
		Gson gson = new Gson();
		SQLServer sqlServerDB = gson.fromJson(body, SQLServer.class);
		sqlServerDB = sqlServerRepo.save(sqlServerDB);
		return new ResponseEntity<>(sqlServerDB, HttpStatus.CREATED);
	}

}
