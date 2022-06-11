package com.shubham.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void init() {
		logger.info("application started");
	}
	
	public static void main(String[] args) {
		logger.info("application executed");
		SpringApplication.run(SpringJenkinsApplication.class, args);
		
	}

}
