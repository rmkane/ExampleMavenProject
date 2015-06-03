package com.example.app;

import java.util.UUID;

import org.apache.log4j.Logger;

/**
 * http://www.mkyong.com/maven/how-to-create-a-java-project-with-maven/
 */
public class App {
	public static final Logger LOG = Logger.getLogger(App.class);
	
	public static void main(String[] args) {
		LOG.info("Starting application...");
		
		App obj = new App();

		System.out.printf("Unique ID : %s%n", obj.generateUniqueKey());
		
		LOG.info("Exiting application...");
	}

	public String generateUniqueKey() {
		return UUID.randomUUID().toString();
	}
}
