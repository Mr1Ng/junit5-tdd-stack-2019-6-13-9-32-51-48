package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
	Game game = new Game();

	@Test
	public void should_return_1_when_input_1() {
		int i = 3;

		String result = game.fizzBuzz(i);
		Assertions.assertEquals("fizz", result);
	}

	@Test
	public void should_return_5_when_input_5() {
		int i = 5;

		String result = game.fizzBuzz(i);
		Assertions.assertEquals("buzz", result);
	}


	@Test
	public void should_return_7_when_input_7() {
		int i = 7;

		String result = game.fizzBuzz(i);
		Assertions.assertEquals("whizz", result);
	}
	@Test
	public void should_return_15_when_input_15() {
		int i = 15;

		String result = game.fizzBuzz(i);
		Assertions.assertEquals("fizzbuzz", result);
	}
	@Test
	public void should_return_21_when_input_21() {
		int i = 21;

		String result = game.fizzBuzz(i);
		Assertions.assertEquals("fizzwhizz", result);
	}
	@Test
	public void should_return_35_when_input_35() {
		int i = 35;

		String result = game.fizzBuzz(i);
		Assertions.assertEquals("buzzwhizz", result);
	}
	@Test
	public void should_return_105_when_input_105() {
		int i = 105;

		String result = game.fizzBuzz(i);
		Assertions.assertEquals("fizzbuzzwhizz", result);
	}
}
