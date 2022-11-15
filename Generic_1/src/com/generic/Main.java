package com.generic;

import java.util.ArrayList;
import java.util.List;

final class C extends Number{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Container<T extends Number> {
	private int size = 0;
	private Object[] objects;
	private ArrayList<? extends T> arrayList;

	public Container(int size) {
		super();
		this.size = size;
		objects = new Object[size];

	}

	public void add(T t) {
		// System.out.println("gelen " + t);
		for (int i = 0; i < objects.length; i++) {
			// System.out.println("i " + i);
			if (objects[i] == null) {
				objects[i] = t;
				// System.out.println("Eklendi");
				break;
			}
		}
	}

	public Object get(int index) {
		return objects[index];
	}

	public void setArrayList(ArrayList<? extends T> arrayList) {
		this.arrayList = arrayList;
		if (this.arrayList != null)
			System.out.println("null deðil");
		//C c = new C();
		this.arrayList.add(null);
		this.arrayList.stream().forEach(i->System.out.println(i));
	}
}

public class Main {

	public static void main(String[] args) {
		Container<Number> container = new Container<>(8);
		container.add(7);
		container.add(5);
		System.out.println(container.get(0));
		System.out.println(container.get(1));
		container.setArrayList(new ArrayList<C>());

		List<? super Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
	}

}
