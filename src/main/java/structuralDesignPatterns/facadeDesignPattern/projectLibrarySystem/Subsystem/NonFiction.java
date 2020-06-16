package structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Subsystem;

import java.util.ArrayList;
import java.util.List;

import structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Facade.Book;
import structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Facade.BookGenre;

public class NonFiction implements BookGenre {
	private List<Book> nonfictionBooks = new ArrayList<Book>();

	public List<Book> getNonfictionBooks() { return nonfictionBooks; }

	public void add(Book book) { 
		nonfictionBooks.add(book); 	
		System.out.println("\tBook with title: " + book.getBookTitle() + " is added to Library System.");	
	}
	
	@Override
	public List<Book> getBookList() { return nonfictionBooks; }
}
