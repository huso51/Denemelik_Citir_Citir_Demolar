package com.java8;

public class Student {
	public boolean is(int i,int b) {
		return i>b;
	}
	
	public boolean is2(int i,int b) {
		if(i>b) return true;
		else return false;
	}
	
	public char is3(int i,int b) {
		if(i>b) return 't';
		else if(i==b) return 'e';
		else return 'f';
	}
}
