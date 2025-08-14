package com.example.Calculadora_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Calculadora3ApplicationTests {
	
	@Autowired
	private CalculadoraController CalculadoraController;

	@Test
	void testSomar() {
		int resultado = CalculadoraController.somar(7, 5);
		assertEquals(12,resultado);
	}
	
	@Test
	void testSub() {
		int resultado = CalculadoraController.sub(7, 5);
		assertEquals(2,resultado);
	}
	
	@Test
	void testDiv() {
		int resultado = CalculadoraController.div(15, 5);
		assertEquals(3,resultado);
	}
	
	@Test
	void testMulti() {
		int resultado = CalculadoraController.multi(7, 5);
		assertEquals(35,resultado);
	}
	
	@Test
	void testQuadrada() {
		int resultado = CalculadoraController.quadrada(2);
		assertEquals(4,resultado);
	}

}
