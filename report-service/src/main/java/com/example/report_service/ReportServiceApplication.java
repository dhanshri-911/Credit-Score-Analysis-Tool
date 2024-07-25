package com.example.report_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReportServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportServiceApplication.class, args);
		System.out.println("Report service");
	}

}