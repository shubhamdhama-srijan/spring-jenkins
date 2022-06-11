package com.shubham.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	public static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("test case executing...");
		logger.info("test case executing second time...");
		logger.info("test case executing third time...");
		assertEquals(true, true);
	}

}
