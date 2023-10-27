package com.language;

import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) {
		
		JavaLang j = new JavaLang();
		CLang c = new CLang();
		Thread th1 = new Thread(j);
		Thread th2 = new Thread(c);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter:\n1 for Java\n2 for C");
		int option = scan.nextInt();
		
		if (option == 1) {
			th1.setPriority(1);
			th2.setPriority(2);
			
			th1.start();
			th2.start();
		} else if (option == 2) {
			th1.setPriority(2);
			th2.setPriority(1);
			
			th1.start();
			th2.start();
		}

	}

}
