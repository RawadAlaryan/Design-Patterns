package structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Subsystem;

import java.util.ArrayList;
import java.util.List;

import structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Facade.Book;
import structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Facade.BookGenre;

public class Fiction implements BookGenre {
	private List<Book> fictionBooks = new ArrayList<Book>();
	
	public List<Book> getFictionBooks() { return fictionBooks; }

	public void add(Book book) { 
		fictionBooks.add(book); 	
		System.out.println("\tBook with title: " + book.getBookTitle() + " is added to Library System.");	
	}
	
	@Override
	public List<Book> getBookList() { return fictionBooks; }
}
