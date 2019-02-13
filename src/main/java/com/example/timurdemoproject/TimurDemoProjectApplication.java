package com.example.timurdemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimurDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimurDemoProjectApplication.class, args);
	}

	public void test(){
		System.out.println("not hello");
	}

}

