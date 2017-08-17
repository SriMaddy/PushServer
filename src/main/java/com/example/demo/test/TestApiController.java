package com.example.demo.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestApiController {
	
	@RequestMapping(value = "", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TestBean> getTestAPIValue() {
		TestBean bean = new TestBean();
		bean.setTestValue("Test API Success");
		return new ResponseEntity<>(bean, HttpStatus.OK);
	}

}
