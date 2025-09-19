package com.edusol.exclude_tomcat_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcludeTomcatServerApplication {

	public static void main(String[] args) {

		SpringApplication app= new SpringApplication(ExcludeTomcatServerApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

}
