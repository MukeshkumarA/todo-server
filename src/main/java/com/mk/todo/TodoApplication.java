package com.mk.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		String str = System.getenv("DATASOURCE_URL");
		System.out.println(str);
		SpringApplication.run(TodoApplication.class, args);
	}

}
