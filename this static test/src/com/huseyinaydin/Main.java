package com.huseyinaydin;

import com.huseyinaydin.Selam.Selam;

public class Main {

	public static void main(String[] args) {
		Selam selam = new Selam();
		selam.setSayi(10);
		System.out.println(selam.getSayi());
		
		Selam selam2 = new Selam();
		selam2.setSayi(11);
		System.out.println(selam2.getSayi());
		System.out.println(selam.getSayi());
	}

}
