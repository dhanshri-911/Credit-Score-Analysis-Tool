package com.example.data_collection_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataCollectionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataCollectionServiceApplication.class, args);
		System.out.println("Data collection service");
	}

}
