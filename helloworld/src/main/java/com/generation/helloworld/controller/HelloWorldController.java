package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorldId() {
		return "Hello World!";
	}
	
	
	@GetMapping("/bsm")
	public String Bsms() {
		return "BSM:"
				+"\nComunicação"
				+"\nProatividade"
				+"\nOrientação ao Detalhe"
				+"\nTrabalho em Equipe"
				+"\nOrientação ao Futuro"
				+"\nResponsabilidade Pessoal"
				+"\nMentalidade de Crescimento"
				+"\nPersistência";
	}
	
	@GetMapping("/objetivo")
	public String objetivosSemanal() {
		return "Objetivos:"
				+"\nMelhorar Linkedin"
				+"\nContinuar Projeto integrador"
				+"\nEstudar Spring Boot";
	}

}
