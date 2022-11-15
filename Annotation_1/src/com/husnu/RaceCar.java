package com.husnu;

public class RaceCar extends Car {

	@OtherAnnotation(deger1 = 44,isim1 = "Abc")
	@Override
	public void write(final int... d) {
		super.write(d);
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
	}

}
