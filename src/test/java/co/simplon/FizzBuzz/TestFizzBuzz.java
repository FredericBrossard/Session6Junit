package co.simplon.FizzBuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.somplon.FizzBuzz.FizzBuzz;

//D�velopper une fonction qui prend en param�tres 2 entiers. Cette fonction retournera sous forme 
//de chaine de caracat�res tous les nombres entre min et max. Les multiples de 3 seront 
//remplac�s par Fizz, les multiples de 5 par Buzz et les multiples de 15 par FizzBuzz.

public class TestFizzBuzz {
	@Test
	public void TestNull() {
		assertEquals(null, FizzBuzz.fizzBuzz(0, 0));
	};

	@Test
	public void TestnNonNull() {
		assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19Buzz", FizzBuzz.fizzBuzz(1, 20));
	};
	
}
