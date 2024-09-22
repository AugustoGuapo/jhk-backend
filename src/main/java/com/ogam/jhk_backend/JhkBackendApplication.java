package com.ogam.jhk_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JhkBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(JhkBackendApplication.class, args);
	}

}
