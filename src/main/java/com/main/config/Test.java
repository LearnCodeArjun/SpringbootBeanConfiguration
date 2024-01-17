package com.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.main.bean.Emp;
import com.main.bean.Student;

@Configuration
public class Test {
	
	@Bean
	public Student student() {
		return new Student();
	}
	
	
	@Bean
	public Emp emp() {
		return new Emp();
	}

}
