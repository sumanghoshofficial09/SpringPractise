package com.example.appprops.appprops;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.appprops.appprops.calculator.Calculator;

@SpringBootApplication
public class ApppropsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApppropsApplication.class, args);
	}


	@Bean
	public ApplicationRunner  calculatorRunner(Calculator calculator, @Value("${lhs}") int lhs, @Value("${rhs}") int rhs, @Value("${operator}") char operator)
	{
		return args -> System.out.println(lhs + " " + operator + " " + rhs + " = " +calculator.performCalcultation(lhs, rhs, operator));
	}
}
