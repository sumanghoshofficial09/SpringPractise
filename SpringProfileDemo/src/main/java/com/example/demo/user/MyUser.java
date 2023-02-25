package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.worker.IWorker;

@Component
public class MyUser {
	
	@Autowired
	IWorker  worker;
	
	
	
	public MyUser(IWorker worker) {
		
		this.worker = worker;
	}



	public void doUse()
	{
		worker.doWork();
	}
	
	
	

}
