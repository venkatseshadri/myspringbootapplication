package org.venkattest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"org.venkattest"})
public class SpringBootApp {

	public static void main(String args[])
	{
		SpringApplication.run(SpringBootApp.class, args);
	}
	
}
	