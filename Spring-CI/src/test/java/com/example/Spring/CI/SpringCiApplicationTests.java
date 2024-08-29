package com.example.Spring.CI;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCiApplicationTests {
	public static final Logger logger = LoggerFactory.getLogger(SpringCiApplication.class);
	@Test
	void contextLoads() {
		logger.info("It is test class");
	}

}
