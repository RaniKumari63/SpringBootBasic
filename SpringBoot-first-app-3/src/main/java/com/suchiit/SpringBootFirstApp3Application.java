package com.suchiit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootFirstApp3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringBootFirstApp3Application.class, args);
	Alient a=context.getBean(Alient.class);
	a.show();
	}

}
