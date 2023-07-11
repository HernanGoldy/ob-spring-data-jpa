package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObspringdatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObspringdatajpaApplication.class, args);
		CocheRepository repositorio = context.getBean(CocheRepository.class);

		System.out.println("find");
		System.out.println(repositorio.count());

		// crear y almacenar un coche en una base de datos
		Coche toyota = new Coche(null, "Toyota", "Prius", 2010);
		repositorio.save(toyota);

		// recuperar un coche por id
		repositorio.findAll();
		System.out.println(repositorio.findAll());
	}

}
