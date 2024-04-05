package com.suchiit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.suchiit.entity.StudentEntity;
import com.suchiit.repo.StudentRepo;

@SpringBootApplication
public class SpringBootFirstApp6Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(SpringBootFirstApp6Application.class, args);
	StudentRepo daoimpl= context.getBean(StudentRepo.class);
	StudentEntity stuEn=new StudentEntity();
	stuEn.setSname("rani");
	
	stuEn.setSadd("Hyd");
	StudentEntity saveEnt=daoimpl.save(stuEn);
	if(saveEnt!=null)
		System.out.println("Data Inserted Successfully");
	else
		System.out.println("Data not Inserted Successfully");
	}

}
