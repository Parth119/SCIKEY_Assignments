package com.example.gethello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.*")
@SpringBootApplication
public class GetHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetHelloWorldApplication.class, args);
	}

}
