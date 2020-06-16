package structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Facade;

import structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Main.BookType;

public class Book {
	private String bookTitle;
	private String auther;
	private int year;
	private int isbn;
	private boolean availability;
	private BookType genre;
	
	
	
	public Book(String bookTitle, String auther, int year, int isbn, BookType genre) {
		super();
		this.bookTitle = bookTitle;
		this.auther = auther;
		this.year = year;
		this.isbn = isbn;
		this.genre = genre;
		this.availability = true;
	}
	public String getBookTitle() { return bookTitle; }
	public void setBookTitle(String bookTitle) { this.bookTitle = bookTitle; }
	public String getAuther() { return auther; }
	public void setAuther(String auther) { this.auther = auther; }
	public int getYear() { return year; }
	public void setYear(int year) { this.year = year; }
	public int getIsbn() { return isbn; }
	public void setIsbn(int isbn) { this.isbn = isbn; }
	public boolean isAvailability() { return availability; }
	public void setAvailability(boolean availability) { this.availability = availability; }
	public BookType getGenre() { return genre; }
	public void setGenre(BookType genre) { this.genre = genre; }
}
