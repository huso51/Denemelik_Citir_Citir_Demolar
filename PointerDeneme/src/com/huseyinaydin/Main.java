package com.huseyinaydin;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		uygula(x);
		System.out.println(x);
		
		A a = new A();
		uygula(a.getDeger());
		System.out.println(a.getDeger());
	}
	
	private static void uygula(int deger) {
		deger = 3;
	}
	
	private static void uygula(A a) {
		a.setDeger(2);
	}

}
