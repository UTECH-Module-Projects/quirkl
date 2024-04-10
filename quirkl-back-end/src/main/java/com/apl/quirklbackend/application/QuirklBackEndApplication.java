package com.apl.quirklbackend.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.apl.quirklbackend")
public class QuirklBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuirklBackEndApplication.class, args);
	}

}
