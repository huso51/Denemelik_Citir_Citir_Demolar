package java_8_new_streapapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		values.parallelStream().forEach(i -> System.out.println(i));
		System.out.println("-----------");
		values.parallelStream().forEach(i -> System.out.println(i));
		System.out.println("----------");
		values.stream().forEach(i -> System.out.println(i));
		System.out.println("-----------");
		values.stream().forEach(System.out::println);
		System.out.println("-----------");
		System.out.println(values.stream().filter(i -> {
			return true;
		}).findFirst().get());
		System.out.println(values.stream().filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				if (t == 3) {
					System.out.println("göt");
					return true;
				}
				else
					return false;
			}
		}).findAny().orElse(3));
		Stream<Integer> stream = values.stream();
		stream.forEach(System.out::println);
		stream.close();
		stream.forEach(System.out::println);
	}

}
