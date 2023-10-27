package com.language;

public class JavaLang implements Language, Runnable {

	@Override
	public void showMessage() {
		System.out.println("Java Program is Running");
	}

	@Override
	public void run() {
		showMessage();
	}

}
