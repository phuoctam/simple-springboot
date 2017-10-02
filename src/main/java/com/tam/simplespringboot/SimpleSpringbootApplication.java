package com.tam.simplespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
//@ComponentScan("com.tam.simplespringboot")
@SpringBootApplication(scanBasePackages = {"com.tam.simplespringboot"})
public class SimpleSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringbootApplication.class, args);
	}
}
