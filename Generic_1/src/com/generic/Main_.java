package com.generic;

import java.util.ArrayList;
import java.util.List;

public class Main_ {

	public static void main(String[] args) {
		List<? super Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		
		/*List<? extends Integer> integers = new ArrayList<>();
		integers.add(1);*/
		ArrayList<Z> arrayList2 = new ArrayList<>();
		arrayList2.add(new Z());
		
		ArrayList<X> arrayList3 = new ArrayList<>();
		arrayList3.add(new X());
		B<X> b = new B();
		b.show(arrayList2);
		b.show(arrayList3);
	}

}
class BilinmeyenSinif{
	
}
class A{
	
}
class B<T extends X> extends A{
	public void show(ArrayList<? super Z> arrayList) {//buraya(generic type) ya Z gelecek ya da Z nin süper sýnýfý gelecek
		for (Object object : arrayList) {
			X x = (X) object;
			x.hi();
		}
		System.out.println("Selam");
	}
}
class X{
	public void hi() {
		System.out.println("Hi");
	}
}
class Z extends X{
	
}