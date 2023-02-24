package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.worker.MyWorker;

@Component
public class MyUser {
	
	@Autowired
	MyWorker worker;
	
	
	
	
	public MyWorker getWorker() {
		return worker;
	}




	public void setWorker(MyWorker worker) {
		this.worker = worker;
	}




	public MyUser(MyWorker worker) {
		super();
		this.worker = worker;
	}




	public void doUse()
	{
		worker.doWork();
	}

}
