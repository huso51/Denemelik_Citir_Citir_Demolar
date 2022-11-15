package com.huseyinaydin;

import java.io.Serializable;

public class A implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int deger;

	public A(int deger) {
		super();
		this.deger = deger;
	}

	public A() {
		super();
	}

	public int getDeger() {
		return deger;
	}

	public void setDeger(int deger) {
		this.deger = deger;
	}
	
}
