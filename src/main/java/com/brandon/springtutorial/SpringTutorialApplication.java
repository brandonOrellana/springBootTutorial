package com.brandon.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringTutorialApplication {

	//@Autowired
	//RepoAlumno alumno;
	public static void main(String[] args) {
		SpringApplication.run(SpringTutorialApplication.class, args);
	}
	/*@Bean
	public CommandLineRunner demo(RepoAlumno alumno){
		return (arg) ->{
			System.err.println("algo");
			System.out.println(alumno.getNombre());
		};
	}*/
}
