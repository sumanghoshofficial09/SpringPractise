package com.example.demo.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.configuration.MyConfiguration;
import com.example.demo.user.MyUser;

@SpringBootApplication

public class ConfigurationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationDemoApplication.class, args);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
	context.register(MyConfiguration.class);
	context.refresh();
		MyUser user = context.getBean(MyUser.class);
		
		user.doUse();
	}

}
