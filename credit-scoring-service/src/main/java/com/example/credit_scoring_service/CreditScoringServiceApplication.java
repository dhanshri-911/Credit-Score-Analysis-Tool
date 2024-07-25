package com.example.credit_scoring_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreditScoringServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditScoringServiceApplication.class, args);
		System.out.println("Welcome to Credit Scoring Service application");
	}

}
