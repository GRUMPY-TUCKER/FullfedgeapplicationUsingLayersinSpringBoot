package com.rupam.springdemo;

import com.rupam.springdemo.model.Alien;
import com.rupam.springdemo.model.Laptop;
import com.rupam.springdemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.security.Provider;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {

		ApplicationContext context;
        context = SpringApplication.run(SpringdemoApplication.class, args);  //creates the container
        System.out.println("Hello World!");
		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
////		Alien alien = new Alien();
////		alien.code();
//		Alien alien = context.getBean(Alien.class); //get a place for the "alien" object inside the container
//		System.out.println(alien.getAge());
//		alien.code();
	}
}
