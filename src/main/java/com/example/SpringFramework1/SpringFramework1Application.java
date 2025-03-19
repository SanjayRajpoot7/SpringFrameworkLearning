package com.example.SpringFramework1;

import com.example.SpringFramework1.model.Alien;
import com.example.SpringFramework1.repository.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFramework1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringFramework1Application.class, args);

		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(100);
		alien1.setName("Sanjay");
		alien1.setTech("Java");

		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien1);

		System.out.println(repo.findAll());

	}
}
