package com.linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(8);
		linkedList.add(3);
		linkedList.add(6);
		linkedList.stream().forEach(System.out::println);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(9);
		list.add(5);
		list.add(6);
		list.add(2);
		
		/*Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});*/
		
		/*Comparator<Integer> comparator = (o1,o2) ->{
			return o1.compareTo(o2);
		};*/
		
		Collections.sort(list,(o1,o2) ->{
			return o1.compareTo(o2);
		});
		
		list.forEach(System.out::println);
		
		System.out.println("-------------");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
