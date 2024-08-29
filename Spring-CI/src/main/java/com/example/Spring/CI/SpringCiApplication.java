package com.example.Spring.CI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCiApplication implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		logger.info("It is second logger");
	}

	public static final Logger logger = LoggerFactory.getLogger(SpringCiApplication.class);
	public static void main(String[] args) {
		logger.info("SpringCiApplication started");
		SpringApplication.run(SpringCiApplication.class, args);
	}

}
