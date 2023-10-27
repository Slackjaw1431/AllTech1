package com.books;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore {

	private List<Book> books;

	public BookStore() {
		books = new ArrayList<>();
	}

	public void addBook() throws InvalidBookException {
		Book book = new Book();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter book id:");
		String bookId = scan.next();
		if (bookId.length() < 4
				|| bookId.charAt(0) != 'B') {
			throw new InvalidBookException(
					"BookID must start with B and be at least length of 4");
		} else {
			book.setBookId(bookId);
		}
		System.out.println("Enter book Title:");
		book.setTitle(scan.next());

		System.out.println("Enter book Author:");
		book.setAuthor(scan.next());

		System.out.println("Enter book Category:");
		String category = scan.next();
		if (category.equals("Science")
				|| category.equals("Fiction")
				|| category.equals("Technology")
				|| category.equals("Other")) {
			book.setCategory(category);
		} else {
			throw new InvalidBookException(
					"Category must be Science, Fiction, Technology, or Other");
		}

		System.out.println("Enter book Price:");
		float price = scan.nextFloat();
		if (price < 0.00) {
			throw new InvalidBookException("Price too low");
		} else {
			book.setBookPrice(price);
		}
		books.add(book);
	}

	public void getBookbyTitle(String title) {
		for (int i = 0; i < books.size(); i++) {
			Book book = (Book) books.get(i);
			if (book.getTitle().equals(title)) {
				System.out.println(book.toString());
				break;
			}
		}
	}

	public void getBookbyAuthor(String author) {
		for (int i = 0; i < books.size(); i++) {
			Book book = (Book) books.get(i);
			if (book.getAuthor().equals(author)) {
				System.out.println(book.toString());
				break;
			}
		}
	}

	public List<Book> displayAll() {
		return books;
	}

}
