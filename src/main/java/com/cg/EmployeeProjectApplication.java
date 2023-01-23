package com.cg;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmployeeProjectApplication {

	public static Logger logger=LoggerFactory.getLogger(EmployeeProjectApplication.class);
	
	@PostConstruct
	public void intt() {
		logger.info("Application started...");
	}
	public static void main(String[] args) {
		SpringApplication.run(EmployeeProjectApplication.class, args);
	}

}
