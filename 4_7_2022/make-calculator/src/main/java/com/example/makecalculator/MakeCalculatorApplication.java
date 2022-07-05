package com.example.makecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.*")
@SpringBootApplication
public class MakeCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MakeCalculatorApplication.class, args);
	}

}
