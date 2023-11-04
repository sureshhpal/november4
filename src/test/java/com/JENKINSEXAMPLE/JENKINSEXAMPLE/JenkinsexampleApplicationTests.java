package com.JENKINSEXAMPLE.JENKINSEXAMPLE;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsexampleApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(JenkinsexampleApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("test case executed ");
		assertEquals(true, true);
		
	}

}
