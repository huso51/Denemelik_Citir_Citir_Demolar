package com.java8;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = simpleDateFormat.format(new Date());
		
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String strLocalDate = localDate.format(dateTimeFormatter);
		
		LocalDate localDate2 = LocalDate.of(1994, 9, 11);
		
		System.out.println(localDate2.format(dateTimeFormatter));
		System.out.println(strLocalDate);
		System.out.println(strDate);
		System.out.println(localDate);
		
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HH/mm/ss");
		LocalTime localTime = LocalTime.now();
		String strLocalTime = localTime.format(dateTimeFormatter2);
		System.out.println(strLocalTime);
		
		LocalTime localTime2 = LocalTime.now(ZoneId.of("Turkey"));
		String strLocalTime2 = localTime.format(dateTimeFormatter2);
		System.out.println(strLocalTime2);
		
		Instant instant = Instant.now();
		System.out.println(instant);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		System.out.println(new Student().is2(2, 2));
		System.out.println(new Student().is3(1, 2));
	}
}
