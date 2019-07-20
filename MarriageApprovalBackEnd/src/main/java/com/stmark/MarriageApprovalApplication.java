package com.stmark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MarriageApprovalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarriageApprovalApplication.class, args);
	}

}
