package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Consumer;
import java.util.function.Predicate;

interface A {
	void show(String f);

	default void write() {
		System.out.println("interface text!");
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				slowWrite();
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				fastWrite();
			}
		});
		Thread thread3 = new Thread(() -> {
			thread.start();
			while (thread.isAlive() != true) {
				thread2.start();
				break;
			}
		});
		thread3.start();
		
		Thread thread4 = new Thread(()->System.out.println("selam"));
	}

	static void slowWrite() {
		Timer timer = new Timer();
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				String values = "slow interface text.!";
				for (int i = 0; i < values.length(); i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.print(values.charAt(i));
				}
				System.out.println("\nBitti!");
				timer.cancel();
			}
		};
		timer.schedule(timerTask, 0, 500);
	}

	static void fastWrite() {
		Timer timer = new Timer();
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				String values = "fast interface text.!";
				for (int i = 0; i < values.length(); i++) {
					try {
						Thread.sleep(120);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(values.charAt(i));
				}
				System.out.println("\nBitti!");
				timer.cancel();
			}
		};
		timer.schedule(timerTask, 0, 110);
	}
}

class C implements A {
	@Override
	public void show(String f) {
		System.out.println("marabayin!");
	}
}

public class Main {

	public static void main(String[] args) {
		int r = 0;
		// ++r;
		System.out.println(r++ + ++r);
		System.out.println(r);
		C c = new C();
		c.write();

		List<Integer> values = new ArrayList<>(Arrays.asList(1, 2, 3));
		/*
		 * for (int i = 0; i < values.size(); i++) { values.add(i); }
		 */
		// values = Arrays.asList(1,2,3,4,56,7,9);
		values.forEach(i -> System.out.println(i));
		values.stream().forEach(i -> System.out.println("a"));
		values.stream().forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});

		values.stream().filter(new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return false;
			}
		});

		System.out.println("*/*/*/*/*/*/*//*/");
		Optional<Integer> optional = values.stream().filter(abdul -> {
			System.out.println(abdul);
			//abdul = 10;
			if (abdul == 1)
				return true;
			else
				return false;
		}).findFirst();

		System.out.println(optional);

		System.out.println("***************");
		Consumer<Integer> consumer = System.out::println;
		Consumer<Integer> consumer2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer arg0) {
				System.out.println(arg0);
			}
		};

		values.stream().forEach(consumer2);
		System.out.println("***************");

		A a = abdulcabbarbingabbarguruguruguddusþebelebettinnaptýnnettinkýrmançizanenerdenkatýlýyorsunkeke -> {
			System.out.println(
					abdulcabbarbingabbarguruguruguddusþebelebettinnaptýnnettinkýrmançizanenerdenkatýlýyorsunkeke);
			System.out.println("hi ");
		};
		a.show("selam");
	}
}
