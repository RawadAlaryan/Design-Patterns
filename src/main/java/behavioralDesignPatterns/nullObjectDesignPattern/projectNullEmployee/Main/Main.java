package behavioralDesignPatterns.nullObjectDesignPattern.projectNullEmployee.Main;

import behavioralDesignPatterns.nullObjectDesignPattern.projectNullEmployee.Client.EmployeesDataBase;
import behavioralDesignPatterns.nullObjectDesignPattern.projectNullEmployee.DependencyBase.Employee;

//Null Object Design Pattern Null Employee.
//Using a NullEmployee object representation instead of null-pointer exceptions.
public class Main {
	public static void main(String[] args) {
		System.out.println("Null Object Design Pattern Null Employee.");
		System.out.println("Using a NullEmployee object representation instead of null-pointer exceptions:\n");
		
		Employee emp1 = EmployeesDataBase.getClient("Edward"); 
		Employee emp2 = EmployeesDataBase.getClient("Chris"); 
		Employee emp3 = EmployeesDataBase.getClient("Mary"); 
		Employee emp4 = EmployeesDataBase.getClient("Carla"); 
	  
		//Retrieving info about Employees in Database:
		System.out.println("Retrieving info about Employees in Database:");
		System.out.println(emp1.getName()); 
		System.out.println(emp2.getName()); 
		System.out.println(emp3.getName()); 
		System.out.println(emp4.getName()); 
	}
}
