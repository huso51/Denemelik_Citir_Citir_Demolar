package com.huseyinaydin;

import java.util.Timer;
import java.util.TimerTask;

class Task1 extends TimerTask{
	Timer timer;
	Task1 task1;
	
	public Task1(Timer timer) {
		this.timer = timer;
		this.task1 = this;
	}
	
	static int i = 0;
	@Override
	public void run() {
		System.out.println("buz gibi hava index : " + i);
		if(i == 5) {
			System.err.println("durdu!".toUpperCase());
			timer.cancel();
			task1.cancel();
		}
		i++;
	}
}

class TimeMachine extends Timer{
	@Override
	public void schedule(TimerTask task, long delay, long period) {
		System.err.println("Zaman makinesi kuruldu!".toUpperCase());
		super.schedule(task, delay, period);
	}
}

public class Main {

	public static void main(String[] args) {
		Hayat hayat = new Hayat();
		hayat.nefes();
		
		Hava hava = new Oksijen();
		hava.derinNefes();
		
		Hava hava2 = new Hava() {
			@Override
			public void derinNefes() {
				System.out.println("havamý aldým");
			}
		};
		
		TimeMachine timer = new TimeMachine();
		/*TimerTask timerTask = new TimerTask() {
			
			@Override
			public void run() {
				hava2.derinNefes();
			}
		};*/
		Task1 task1 = new Task1(timer);
		timer.schedule(task1, 0,1000);
	}
}
