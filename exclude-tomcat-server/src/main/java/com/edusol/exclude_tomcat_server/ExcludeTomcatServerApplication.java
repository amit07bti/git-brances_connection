package com.edusol.exclude_tomcat_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcludeTomcatServerApplication {

	public static void main(String[] args) {
		// Default: Tomcat enabled if spring-boot-starter-web is present
		SpringApplication.run(ExcludeTomcatServerApplication.class, args);

		System.out.println("🚀 Spring Boot app started WITH Tomcat server!");
	}
}
