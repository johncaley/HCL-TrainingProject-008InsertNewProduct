package com;

public class Book {

	private int bookID;
	private String title;
	private String author;
	private double price;
	private boolean inStock;
	
	public Book() {
		
	}
	
	public Book(String title, String author, String price) {
		this.title = title;
		this.author = author;
		this.price = Double.parseDouble(price);
		this.inStock = true;
	}
	
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	public String getBookID() {
		return String.valueOf(bookID);
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
		
	public String getAuthor() {
		return author;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getPrice() {
		return String.valueOf(price);
	}
	
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	
	public String getInStock() {
		return String.valueOf(inStock);
	}
}
