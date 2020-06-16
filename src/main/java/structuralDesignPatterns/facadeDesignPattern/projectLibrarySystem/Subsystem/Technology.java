package structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Subsystem;

import java.util.ArrayList;
import java.util.List;

import structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Facade.Book;
import structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Facade.BookGenre;

public class Technology implements BookGenre {
	private List<Book> technologyBooks = new ArrayList<Book>();
	
	public List<Book> getTechnologyBooks() { return technologyBooks; }

	public void add(Book book) { 
		technologyBooks.add(book); 	
		System.out.println("\tBook with title: " + book.getBookTitle() + " is added to Library System.");	
	}
	
	@Override
	public List<Book> getBookList() { return technologyBooks; }
}
