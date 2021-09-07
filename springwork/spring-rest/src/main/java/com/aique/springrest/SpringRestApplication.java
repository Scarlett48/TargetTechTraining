package com.aique.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.aique.springrest"})
// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class SpringRestApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringRestApplication.class, args);
	}

}
