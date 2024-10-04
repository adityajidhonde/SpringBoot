package com.example.databaseh2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.databaseh2.model.Alien;

@SpringBootApplication
public class Databaseh2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Databaseh2Application.class, args);

		Alien a1 = context.getBean(Alien.class);
		a1.setId(111);
		a1.setName("Aditya");
		a1.setTech("Java");

		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(a1);
		System.out.println(repo.findall());
	}

}
