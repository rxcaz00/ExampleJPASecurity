package com.uabc.database.example.examplejpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExamplejpaApplication {
	/*
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(ExamplejpaApplication.class);
	}
	 */

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ExamplejpaApplication.class,args);
	}
}
