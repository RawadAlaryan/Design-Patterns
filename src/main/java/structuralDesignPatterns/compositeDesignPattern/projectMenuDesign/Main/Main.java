package structuralDesignPatterns.compositeDesignPattern.projectMenuDesign.Main;

import structuralDesignPatterns.compositeDesignPattern.projectMenuDesign.Component.MenuComponent;
import structuralDesignPatterns.compositeDesignPattern.projectMenuDesign.Composite.Menu;
import structuralDesignPatterns.compositeDesignPattern.projectMenuDesign.Leaf.MenuItem;

//Composite Design Pattern Menu Design.
public class Main {
	public static void main(String[] args) {
		System.out.println("Composite Design Pattern Menu Design.");
		
		MenuComponent allTutorials = new Menu("Tutorials", "/tutorials");
		MenuComponent spring = new Menu("Spring", "/spring");
		MenuComponent versioning = new Menu("Version Management", "/versioning");
		MenuComponent git = new Menu("Git", "/git");
		MenuComponent svn = new MenuItem("SVN", "/svn");
		
		allTutorials.add(spring);
			spring.add(new MenuItem("Spring Core", "/core"));
			spring.add(new MenuItem("Spring Boot", "/boot"));
		allTutorials.add(versioning);
			versioning.add(svn);
			versioning.add(git);
				git.add(new MenuItem("Introduction to Git", "/intro"));
				git.add(new MenuItem("Github Integration", "/github"));
	       
		allTutorials.displayMenu();
	}
}
