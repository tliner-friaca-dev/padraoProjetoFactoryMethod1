package br.com.projeto.factoryMethod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryMethodApplication.class, args);

		System.out.println("----------------------");
		System.out.println("ENTROU NA APLICAÇÃO!!!");
		System.out.println("----------------------");

	}

}
