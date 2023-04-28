package com.ssafy.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring12SbbApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Spring12SbbApplication.class, args);
		
		for(String name : context.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
