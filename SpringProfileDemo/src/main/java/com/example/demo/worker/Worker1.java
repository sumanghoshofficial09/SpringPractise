package com.example.demo.worker;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("worker1")
public class Worker1 implements IWorker {

	@Override
	public void doWork() {

		System.out.println("worker 1 is working");
		
	}
	
	

}
