package com.books;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		BookStore bookStore = new BookStore();

		Scanner scan = new Scanner(System.in);
		int input = 0;

		while (input != 5) {
			menu();
			input = scan.nextInt();

			if (input == 1) {
				
				try {
					bookStore.addBook();
				}
				catch(InvalidBookException e) {
					System.out.println(e);
				}

			} else if (input == 2) {
				System.out.println(
						"Enter book Title to search:");
				String title = scan.next();
				bookStore.getBookbyTitle(title);

			} else if (input == 3) {
				System.out.println(
						"Enter book author to search:");
				String author = scan.next();
				bookStore.getBookbyAuthor(author);

			} else if (input == 4) {
				System.out.println(bookStore.displayAll());

			} else {

			}
		}

	}

	public static void menu() {
		System.out.println("1. Add Book");
		System.out.println("2. Search by Title");
		System.out.println("3. Search by Author");
		System.out.println("4. Display All");
		System.out.println("5. Exit");
	}

}
