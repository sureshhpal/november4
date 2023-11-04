package com.JENKINSEXAMPLE.JENKINSEXAMPLE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkinsexampleApplication {

	public static Logger logger=LoggerFactory.getLogger(JenkinsexampleApplication.class);
	
	@PostConstruct
	public void init()
	{
		logger.info("Application started");;
	}
	public static void main(String[] args) {
		logger.info("Application Executed");;
		SpringApplication.run(JenkinsexampleApplication.class, args);
		System.out.println("main ");
		
	}

}
