package com.language;

public class CLang implements Language, Runnable{

	@Override
	public void showMessage() {
		System.out.println("C Program is Running");		
	}

	@Override
	public void run() {
		showMessage();
	}

}
