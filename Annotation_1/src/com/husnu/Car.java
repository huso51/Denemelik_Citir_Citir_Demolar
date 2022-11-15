package com.husnu;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Random;

@Target({ElementType.CONSTRUCTOR,ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@interface OtherAnnotation {
	int deger1() default 3;
	String isim1() default "Hüsnü";
}
@OtherAnnotation
public class Car {
	private String carName;
	private String carModel;
	
	@MyAnnotation
	public Car(final String carName, final String carModel) {
		super();
		this.carName = carName;
		this.carModel = carModel;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	@MyAnnotation(deger1 = 28,isim1 = "Þebelebettin")
	public void write(final int ...d) {
		System.out.println("Selam kardeþ");
	}
	
	public int getRandomNumber() {
		return new Random().nextInt();
	}
}
