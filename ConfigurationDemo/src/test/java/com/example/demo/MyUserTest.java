package com.example.demo;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.user.MyUser;
import com.example.demo.worker.MyWorker;

@RunWith(MockitoJUnitRunner.class)
public class MyUserTest  {

	@InjectMocks
	
	MyUser myuser;
	
	@Mock
	MyWorker  worker;
	
	@BeforeEach
	void init_mocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testMyUserActivity()
	{
		myuser.doUse();
	}
}
