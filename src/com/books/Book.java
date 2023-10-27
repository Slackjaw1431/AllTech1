package com.books;

public class Book {

	private String bookId;
	private String title;
	private String author;
	private String category;
	private float bookPrice;

	public Book() {
	}

	public Book(String bookId, String title, String author,
			String category, float bookPrice) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.bookPrice = bookPrice;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId2) {
		this.bookId = bookId2;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title
				+ ", author=" + author + ", category="
				+ category + ", bookPrice=" + bookPrice
				+ "]";
	}

}
