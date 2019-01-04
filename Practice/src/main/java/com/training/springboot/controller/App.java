package com.training.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages="com.training")
@EntityScan("com.training.model")

@EnableSwagger2
public class App {
	public static void main(String args[]){
		SpringApplication.run(App.class);
	}
}
