package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cmepps.Calculadora;

class CalculadoraTest {

	private int a, b;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
		a = 5;
		b = 3;
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void testSuma() {
		int expected = 8;
		int actual = Calculadora.suma(a, b);
		assertEquals(expected, actual);
	}

	@Test
	void testResta() {
		int expected = 2;
		int actual = Calculadora.resta(a, b);
		assertEquals(expected, actual);
	}

	@Test
	void testMultiplica() {
		int expected = 15;
		int actual = Calculadora.multiplica(a, b);
		assertEquals(expected, actual);
	}

	@Test
	void testDivide() {
		int expected = 1;
		int actual = Calculadora.divide(a, b);
		assertEquals(expected, actual);
	}

	@Test
	void testDividePorCero() {
		b = 0;
		int expected = -1;
		int actual = Calculadora.divide(a, b);
		assertEquals(expected, actual);
	}
	
}
