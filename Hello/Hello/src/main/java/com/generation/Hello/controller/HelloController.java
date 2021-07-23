package com.generation.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/hello")

public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello World."
				+ "As mentalidades adquiridas são atenção ao detalhe e persistencia."
				+ " Já os objetivos para essa semana são, terminar os passos do integrador "
				+ "e utilizar mais alguns métodos para evoluir como dev";
	}
	

}
