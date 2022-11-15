package com.j10;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		var a = 10;
		var c = 'A';
		var random = new Random();
		System.out.println(a + " " + c + " " + random.nextFloat() + " " + Float.MAX_VALUE + " " + Float.MAX_EXPONENT);
	}

}
