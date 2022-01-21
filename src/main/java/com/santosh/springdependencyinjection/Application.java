package com.santosh.springdependencyinjection;

import com.santosh.springdependencyinjection.bean.ProjectBean;
import com.santosh.springdependencyinjection.bean.ProjectConstructorDIBean;
import com.santosh.springdependencyinjection.bean.ProjectFieldSetterBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private ProjectBean projectBean;
	@Autowired
	private ProjectConstructorDIBean projectConstructorDIBean;
	@Autowired
	private ProjectFieldSetterBean projectFieldSetterBean;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		projectBean.save(1, "Ecommerce app");
		projectConstructorDIBean.save(2, "Online ticketing app");
		projectFieldSetterBean.save(3, "Food delivery app");
	}
}
