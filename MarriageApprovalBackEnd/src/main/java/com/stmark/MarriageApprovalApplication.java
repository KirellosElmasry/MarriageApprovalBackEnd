package com.stmark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication(scanBasePackages={"com.stmark.controller"})
public class MarriageApprovalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarriageApprovalApplication.class, args);
	}

}
