package behavioralDesignPatterns.templateMethodDesignPattern.projectEssayWritingTemplate.Main;

import behavioralDesignPatterns.templateMethodDesignPattern.projectEssayWritingTemplate.Subclass.LongEssay;
import behavioralDesignPatterns.templateMethodDesignPattern.projectEssayWritingTemplate.Subclass.ShortEssay;
import behavioralDesignPatterns.templateMethodDesignPattern.projectEssayWritingTemplate.Template.EssayTemplate;

//Template Method Design Pattern Essay Writing Template.
//Following an Essay Template for writing, implemented inside different Essay Sub classes.
public class Main {

	public static void main(String[] args) {
		System.out.println("Template Method Design Pattern Essay Writing Template.");
		System.out.println("Following an Essay Template for writing, implemented inside different Essay Sub classes:\n");
		
		//Writing a Short Essay:
		System.out.println("Writing a Short Essay:");
		EssayTemplate shortEssay = new ShortEssay("Programming with Java");
		shortEssay.writeEssay();
		
		//Writing a Long Essay:
		System.out.println("\nWriting a Long Essay:");
		EssayTemplate longEssay = new LongEssay("Java OOP");
		longEssay.writeEssay();
	}
}
