package com;

import java.sql.*;

public class Book {

	private int bookID;
	private String title;
	private String author;
	private double price;
	private boolean inStock;
	
	
	public Book(String id) {
		
		Connection myCon = null;
		Statement myStatement = null;
		try {
			String SQLQuery = "SELECT * FROM Books WHERE bookID = " + id;
			
			myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookDB", "root", "");
			
			myStatement = myCon.createStatement();
			
			ResultSet myResults = myStatement.executeQuery(SQLQuery);
			
			bookID = myResults.getInt("bookID");
			title = myResults.getString("title");
			author = myResults.getString("author");
			price = myResults.getDouble("price");
			inStock = myResults.getBoolean("inStock");
			
			myResults.close();
			myStatement.close();
			myCon.close();
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getBookID() {
		return String.valueOf(bookID);
	}
	
	public String getTitle() {
		return title;
	}
		
	public String getAuthor() {
		return author;
	}
	
	public String getPrice() {
		return String.valueOf(price);
	}
	
	public String getInStock() {
		return String.valueOf(inStock);
	}
	
}
