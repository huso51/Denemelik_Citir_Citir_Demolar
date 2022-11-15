package com.huseyinaydin.duplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainImpl {

	public static void main(String[] args) {
		List<Integer> sayiTekrarliListe = new ArrayList<Integer>(Arrays.asList(0, 0, 1, 2, 3, 0));
		sayiTekrarliListe.stream().forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer arg0) {
				System.out.println(arg0);
			}
		});

		System.out.println("----------");
		Stream<Integer> stream = sayiTekrarliListe.stream();

		List<Integer> sayiTekrarsizListe = stream.distinct().collect(Collectors.toList());
		sayiTekrarsizListe.stream().forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer arg0) {
				System.out.println(arg0);
			}
		});

		System.out.println("----------");
		List<Integer> listWithDuplicates = new ArrayList<Integer>(Arrays.asList(0, 0, 1, 2, 3, 0));
		listWithDuplicates.stream().forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer arg0) {
				System.out.println(arg0);
			}
		});
		System.out.println("----------");
		List<Integer> listWithoutDuplicates = new ArrayList<Integer>(new HashSet<>(listWithDuplicates));
		listWithoutDuplicates.stream().forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer arg0) {
				System.out.println(arg0);
			}
		});
	}

}
