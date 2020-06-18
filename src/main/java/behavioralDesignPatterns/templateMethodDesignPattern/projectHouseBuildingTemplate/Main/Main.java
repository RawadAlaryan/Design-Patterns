package behavioralDesignPatterns.templateMethodDesignPattern.projectHouseBuildingTemplate.Main;

import behavioralDesignPatterns.templateMethodDesignPattern.projectHouseBuildingTemplate.ConcreteSubclass.GlassHouse;
import behavioralDesignPatterns.templateMethodDesignPattern.projectHouseBuildingTemplate.ConcreteSubclass.WoodenHouse;
import behavioralDesignPatterns.templateMethodDesignPattern.projectHouseBuildingTemplate.Template.HouseTemplate;

//Template Method Design Pattern House Building Template.
public class Main {

	public static void main(String[] args) {
		System.out.println("Template Method Design Pattern House Building Template.\n");

		System.out.println("Building a Wooden House:");
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();	 //Using template method.

        System.out.println("\nBuilding a Glass House:");
        houseType = new GlassHouse();
        houseType.buildHouse();	 //Using template method.
	}
}
