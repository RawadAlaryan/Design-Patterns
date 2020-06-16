package structuralDesignPatterns.compositeDesignPattern.projectCompanyHierarchy.Main;

import structuralDesignPatterns.compositeDesignPattern.projectCompanyHierarchy.Component.Employee;
import structuralDesignPatterns.compositeDesignPattern.projectCompanyHierarchy.Composite.Directory;
import structuralDesignPatterns.compositeDesignPattern.projectCompanyHierarchy.Leaf.Developer;
import structuralDesignPatterns.compositeDesignPattern.projectCompanyHierarchy.Leaf.Manager;

//Composite Design Pattern Company Hierarchy.
public class Main {
	public static void main(String[] args) {
		System.out.println("Composite Design Pattern Company Hierarchy.\n");
		
        Employee developer1 = new Developer(100, "Jason Fedin", "Pro Developer");
        Employee developer2 = new Developer(101, "Myra Fedin", "Entry level Developer");
        Employee developer3 = new Developer(102, "Tom", "Developer");
        
        Manager engineerManager = new Manager(500, "Mike", "Eng. Manager", 25000);
	        engineerManager.addEmployee(developer1);
	        engineerManager.addEmployee(developer2);
	        engineerManager.addEmployee(developer3);
        
        Manager generalManager = new Manager (501, "Mark", "G. Manager", 50000);
        	generalManager.addEmployee(engineerManager);
                
        Directory engineerDirectory = new Directory();
	        engineerDirectory.addEmployee(developer1);
	        engineerDirectory.addEmployee(developer2);
	        engineerDirectory.addEmployee(developer3);
                
        Directory companyDirectory = new Directory();
        companyDirectory.addEmployee(generalManager);
        System.out.println("Company's Directory:");
        companyDirectory.showEmployeeDetails();
	}
}
