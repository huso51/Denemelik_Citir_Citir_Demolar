package com.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		System.out.println(set.add(3));
		System.out.println(set.add(2));
		System.out.println(set.add(5));
		System.out.println(set.add(2));
		
		System.out.println("-----------");
		
		for(Integer i : set) {
			System.out.println(i);
		}
		
		System.out.println("-----------");
		
		Set<Integer> set2 = new TreeSet<>();
		System.out.println(set2.add(3));
		System.out.println(set2.add(2));
		System.out.println(set2.add(5));
		System.out.println(set2.add(2));
		
		for(Integer i : set2) {
			System.out.println(i);
		}
	}

}
