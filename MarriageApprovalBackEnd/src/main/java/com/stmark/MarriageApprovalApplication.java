package com.stmark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.stmark"})
public class MarriageApprovalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarriageApprovalApplication.class, args);
	}

}
