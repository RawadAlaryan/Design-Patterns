package structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Main;

import structuralDesignPatterns.facadeDesignPattern.projectLibrarySystem.Facade.Book;

//Facade Design Pattern Library System.
//Using a BookGenre Facade of different BookGenres Subsystems (Fiction, Non-fiction, Technology) to add, borrow Books.
public class Main {

	public static void main(String[] args) {
		System.out.println("Facade Design Pattern Library System.");
		System.out.println("Using a BookGenre Facade of different BookGenres Subsystems (Fiction, Non-fiction, Technology) to add, borrow Books:\n");
		LibrarySystem librarySystem = new LibrarySystem();
		
		//Adding Books to Library System:
		System.out.println("Adding Books to Library System:");
		librarySystem.addBookByGenre(new Book("Dive into Design Patterns", "Alexander Shvets", 2018, 13572468, BookType.TECHNOLOGY));
		
		//Borrowing a Book from LibrarySystem:
		System.out.println("\nBorrowing a Book from LibrarySystem:");
		librarySystem.borrowBookByTitle(BookType.TECHNOLOGY, "Dive into Design Patterns");
	}
}
