package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.config.MyConfiguration;
import com.example.demo.user.MyUser;

@SpringBootApplication
public class SpringProfileDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProfileDemoApplication.class, args);
		
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
		
		
		context.register(MyConfiguration.class);
		//context.getEnvironment().setActiveProfiles("worker2");
		
		context.refresh();
		
		MyUser  myser = context.getBean(MyUser.class);
		
		myser.doUse();
	}

}
