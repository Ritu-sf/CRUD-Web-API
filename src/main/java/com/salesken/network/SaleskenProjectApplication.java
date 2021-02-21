package com.salesken.network;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.salesken")
@SpringBootApplication
public class SaleskenProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaleskenProjectApplication.class, args);
	}

}
