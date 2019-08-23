package com.thoughtworks.tdd;

public class Game {
	public String fizzBuzz(int i) {
		if(i%3==0 && i%5==0 && i%7==0) {
			return "fizzbuzzwhizz";
		}if(i%3==0 && i%5==0) {
			return "fizzbuzz";
		}if(i%3==0 && i%7==0) {
			return "fizzwhizz";
		}if(i%5==0 && i%7==0) {
			return "buzzwhizz";
		}
		if (i==3) {
			return "fizz";
		}if(i==5){
			return "buzz";
		}if(i==7) {
			return "whizz";
		}
		return String.valueOf(i);
	}
}
