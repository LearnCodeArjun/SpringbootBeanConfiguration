package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.main.bean.Emp;
import com.main.bean.Student;

@SpringBootApplication
public class SpringbootBeanConfigurationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringbootBeanConfigurationApplication.class, args);
		Student student=container.getBean(Student.class);
		System.out.println(student);
		student.createStudent();
		
		Emp emp=container.getBean(Emp.class);
		System.out.println(emp);
		emp.empdisplay();
	}

}
