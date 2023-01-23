package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.EmployeeProjectApplication;



@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeProjectApplicationTests {

	public static Logger logger=LoggerFactory.getLogger(EmployeeProjectApplication.class);
	
	
	@Test
	public void contextLoads() {
		logger.info("test case executing");
		assertEquals(true,true);
	}

}
