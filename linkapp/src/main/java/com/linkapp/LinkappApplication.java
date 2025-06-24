package com.linkapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LinkappApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkappApplication.class, args);
		System.err.println("Started");
	}

}
