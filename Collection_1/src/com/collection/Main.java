package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Collection<Integer> integerCollection = new ArrayList<>();
		integerCollection.add(5);
		integerCollection.add(3);
		integerCollection.add(8);
		integerCollection.add(4);
		integerCollection.add(7);
		integerCollection.stream().forEach(i->System.out.println(i));
		
		System.out.println("----------");
		
		Set<Integer> integerSet = new HashSet<>();
		integerSet.add(1);
		integerSet.add(3);
		integerSet.add(8);
		integerSet.add(5);
		
		integerSet.stream().forEach(i->System.out.println(i));
		
		System.out.println("----------");
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(8);
		treeSet.add(5);
		
		treeSet.stream().forEach(i->System.out.println(i));
		
		System.out.println("----------");
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "A");
		hashMap.put(2, "B");
		hashMap.put(3, "C");
		
		System.out.println(hashMap.get(2));
		
		System.out.println("----------");
		
		Collection<Integer> collection = new ArrayList<>();
		collection.add(5);
		collection.add(1);
		collection.add(2);
		collection.add(3);
		collection.add(9);
		
		List<Integer> integers = new ArrayList<>();
		//integers.add(1, 2);
		
		collection.forEach(System.out::println);
		
		A a = new B();
	}

}
