package com.thread;

import java.util.ArrayList;
import java.util.List;

public class Test implements Runnable  {

	static List<Item> items = new ArrayList<>();

	public static void main(String[] args) {
		Test test = new Test();
		Thread th1 = new Thread(test);	
		
		th1.setName("th1");
		th1.start();
		
		System.out.println("Thread: " + Thread.currentThread().getName());

		for (int i = 0; i < 5; i++) {
			Item item = new Item(i, "Item " + i);
			items.add(item);
			System.out.println("Adding item");
		}
		test.run();

	}

	@Override
	public void run() {
		System.out.println("Thread: " + Thread.currentThread().getName());

		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i));
		}
		
	}


}
