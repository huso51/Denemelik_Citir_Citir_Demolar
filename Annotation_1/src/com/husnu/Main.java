package com.husnu;

import java.lang.reflect.Method;

@MyAnnotation(deger1 = 4, isim1 = "Hüseyin")
public class Main {

	public static void main(String[] args) {
		final Car car = new Car();
		final java.lang.reflect.Method[] methods = car.getClass().getMethods();
		final Method method = methods[0];
		final MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
		System.out.println(myAnnotation.deger1() + " - " + myAnnotation.isim1());
		final RaceCar raceCar = new RaceCar();
		final java.lang.reflect.Method[] methods2 = raceCar.getClass().getMethods();
		for (int i = 0; i < methods2.length; i++)
			System.out.println(methods2[i] + " " + i);
		final Method method2 = methods2[0];
		System.err.println(method2);
		final OtherAnnotation otherAnnotation = method2.getClass().getAnnotation(OtherAnnotation.class);
		//if (otherAnnotation != null)
		System.out.println(otherAnnotation.deger1());
		raceCar.write(44, 4, 5, 7, 8, 9, 7);
	}

}
