package com.insurance.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.insurance"})
public class InsurancePortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsurancePortalApplication.class, args);
	}

}
