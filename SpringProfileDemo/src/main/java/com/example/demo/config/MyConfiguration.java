package com.example.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan({"com.example.demo.user","com.example.demo.worker"})
public class MyConfiguration {

}

