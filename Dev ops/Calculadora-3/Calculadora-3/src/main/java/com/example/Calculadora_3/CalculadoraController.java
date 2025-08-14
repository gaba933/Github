package com.example.Calculadora_3;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculadoraController {
	
	
	@GetMapping("/somar")
	public int somar(@RequestParam int a, @RequestParam int b) {
		return a + b;
	}
	
	@GetMapping("/sub")
	public int sub(@RequestParam int a, @RequestParam int b) {
		return a - b;
	}
	
	@GetMapping("/div")
	public int div(@RequestParam int a, @RequestParam int b) {
		return a / b;
	}
	
	@GetMapping("/multi")
	public int multi(@RequestParam int a, @RequestParam int b) {
		return a * b;
	}
	
	@GetMapping("/quadrada")
	public int quadrada(@RequestParam int a) {
		return a * a;
	}
}
