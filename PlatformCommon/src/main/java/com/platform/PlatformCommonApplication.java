package com.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlatformCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformCommonApplication.class, args);
		System.out.println("Application started..");
	}

}
