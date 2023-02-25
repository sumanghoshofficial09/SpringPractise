package com.example.demo.worker;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("worker2")
public class Worker2 implements IWorker{

	@Override
	public void doWork() {
		System.out.println("worker 2 is working");
		
	}

}
