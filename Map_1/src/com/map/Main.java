package com.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "1 ₺");
		map.put(2, "10 ₺");
		map.put(3, "2 $");
		map.put(4, "6 €");
		map.put(null, "a");
		map.put(null, "w");
		// map.put(5, null);

		System.out.println(map.get(5));

		if (map.get(5) != null)
			System.out.println("dolu");
		else
			System.out.println("boş");
		
		System.out.println("-----------");
		
		Set<Integer> keys = map.keySet();
		
		for(Integer k : keys) {
			System.out.println(map.get(k));
		}
		
		Set<Entry<Integer, String>> entry = map.entrySet();
		for(Entry<Integer, String> e : entry) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}

		Map<Integer, String> map2 = new Hashtable<>();//thread safe and synchronized
		map2.put(null, "A");
	}

}
