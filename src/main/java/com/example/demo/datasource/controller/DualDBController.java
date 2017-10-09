package com.example.demo.datasource.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.datasource.mysql.domain.MySql;
import com.example.demo.datasource.mysql.repo.MySqlRepo;
import com.example.demo.datasource.sqlserver.domain.TestTableOne;
import com.example.demo.datasource.sqlserver.domain.Timezone;
import com.example.demo.datasource.sqlserver.repo.TestTableOneRepo;
import com.example.demo.datasource.sqlserver.repo.TimeZoneRepo;
import com.google.gson.Gson;

@RestController
@RequestMapping("/dualdb")
public class DualDBController {

	@Autowired
	private MySqlRepo mysqlRepo;
	
	@Autowired
	private TestTableOneRepo testTableOneRepo;
	
	@Autowired
	private TimeZoneRepo timeZoneRepo;

	@RequestMapping(value = "/saveInTest1DB", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MySql> saveNameInMySqlDB(@RequestBody String body) {
		Gson gson = new Gson();
		MySql mySql = gson.fromJson(body, MySql.class);
		mySql = mysqlRepo.save(mySql);
		return new ResponseEntity<>(mySql, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/saveInProductionDBTestTableOne", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TestTableOne> saveNameInProductionDBTestTableOne(@RequestBody String body) {
		Gson gson = new Gson();
		TestTableOne tbl1 = gson.fromJson(body, TestTableOne.class);
		tbl1 = testTableOneRepo.save(tbl1);
		return new ResponseEntity<>(tbl1, HttpStatus.CREATED);
	}
	
	/*@RequestMapping(value = "/saveInProductionDBTimezone", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Timezone> saveNameInProductionDBTimezone(@RequestBody String body) {
		Gson gson = new Gson();
		Timezone tbl1 = gson.fromJson(body, Timezone.class);
		tbl1.setGmtOffset((int)tbl1.getGmtOffset());
		tbl1 = timeZoneRepo.save(tbl1);
		return new ResponseEntity<>(tbl1, HttpStatus.CREATED);
	}*/
}
