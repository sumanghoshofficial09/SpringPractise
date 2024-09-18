/****
 * 
 * 
 * 
 * how to define custom bean name using function 
 * 
 * 
 */

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.configuration.SpringBeanDemoConfigurarion;
import com.example.demo.pojos.Student;

@SpringBootApplication
public class SpringBeanDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanDemo1Application.class, args);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.register(SpringBeanDemoConfigurarion.class);
		context.refresh();
		Student stud=  (Student) context.getBean("myStudent");
		
		System.out.println(stud.getName());
	}
	
	@Bean
	public Student  myStudent()
	{
		return new Student(1, "tryMyLuck");
	}

}
