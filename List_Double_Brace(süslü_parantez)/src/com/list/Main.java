package com.list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>() {
			@Override
			public void add(int index, String element) {
				// TODO Auto-generated method stub
				super.add(index, element);
			}
			@Override
			public boolean add(String e) {
				// TODO Auto-generated method stub
				return super.add(e + " _Selam!");
			}
			{
				add("A");
				add("B");
				add("C");
				add("D");
			}
		};
		
		for(String s : list) {
			System.out.println(s);
		}
	}

}
