package com.example.demo.worker;

import org.springframework.stereotype.Component;

@Component
public class MyWorker {
	
	public void doWork()
	{
		System.out.println("worker is working");
	}

}
