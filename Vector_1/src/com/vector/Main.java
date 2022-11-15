package com.vector;

import java.util.Vector;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		
		//Vector %100 threadsafe(güvenli kanal) slow ArrayList %50 not threadsafe(güvenli kanal) fast
		Vector<Integer> vector = new Vector<>();//eklenen eleman 11 adet olduðunda kapasite 20 çýkýyor 11 den az olunca 10 çýkýyor!
		vector.add(6);
		vector.add(5);
		vector.add(5);
		vector.add(6);
		vector.add(5);
		vector.add(5);
		vector.add(6);
		vector.add(5);
		vector.add(5);
		vector.add(5);
		vector.add(5);
		
		vector.add(6);
		vector.add(5);
		vector.add(5);
		vector.add(6);
		vector.add(5);
		vector.add(5);
		vector.add(6);
		vector.add(5);
		vector.add(5);
		vector.add(5);
		vector.add(5);
		
		vector.add(6);
		vector.add(5);
		vector.add(5);
		vector.add(6);
		vector.add(5);
		vector.add(5);
		vector.add(6);
		vector.add(5);
		vector.add(5);
		vector.add(5);
		vector.add(5);
		
		vector.add(6);
		vector.add(5);
		vector.add(5);
		vector.add(6);
		vector.add(5);
		vector.add(5);
		vector.add(6);
		vector.add(5);
		vector.add(5);
		vector.add(5);
		vector.add(5);
		System.out.println(vector.capacity());
		
		vector.stream().forEach(System.out::println);
		/*Consumer<Integer> consumer = System.out::println;
		vector.stream().forEach(consumer);
		vector.stream().forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer arg0) {
				// TODO Auto-generated method stub
				
			}
		});*/
	}

}
