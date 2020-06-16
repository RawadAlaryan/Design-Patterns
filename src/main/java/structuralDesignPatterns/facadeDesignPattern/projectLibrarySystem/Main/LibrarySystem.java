package structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Main;

import java.util.List;

import structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Facade.Book;
import structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Facade.BookGenre;
import structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Subsystem.Fiction;
import structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Subsystem.NonFiction;
import structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Subsystem.Technology;

public class LibrarySystem {
	private BookGenre fiction;
	private BookGenre nonFiction;
	private BookGenre technology; 
	 
	public LibrarySystem() {
		this.fiction = new Fiction();
		this.nonFiction = new NonFiction();
		this.technology = new Technology();
	}
	
	public void addBookByGenre(Book book) {
		switch(book.getGenre()) {
			case FICTION				: 	((Fiction)fiction).add(book);						break; 
			case NONFICTION	: 	((NonFiction)nonFiction).add(book);		break;
			case TECHNOLOGY	: 	((Technology)technology).add(book);		break;
		}		
	}
	
	public void borrowBookByTitle(BookType genre, String bookTitle) {
		List<Book> books = null;
		switch(genre) {
			case FICTION				: books = this.fiction.getBookList();				break; 
			case NONFICTION	: books = this.nonFiction.getBookList();		break;
			case TECHNOLOGY	: books = this.technology.getBookList();		break;
		}
		Book book = findBookByTitle(books, bookTitle);
		book.setAvailability(false);
		System.out.println("\tBook with title: " + book.getBookTitle() + " has been borrowed.");
	}
	
	public Book findBookByTitle(List<Book> books, String bookTitle) {
		for(Book book : books) {
			if(book.getBookTitle().equals(bookTitle)) { return book; }
		}
		return null;
	}
}
