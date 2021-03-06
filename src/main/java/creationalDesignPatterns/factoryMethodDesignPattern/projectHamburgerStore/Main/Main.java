package creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.Main;

import creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.ConcreteSubFactory.MontrealHamburgerStore;
import creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.ConcreteSubFactory.TorontoHamburgerStore;
import creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.Factory.HamburgerStore;
import creationalDesignPatterns.factoryMethodDesignPattern.projectHamburgerStore.Product.Hamburger;

//Factory Method Design Pattern Hamburger Store.
//Hamburger Store defines a Factory Method for creating different Hamburgers (Cheese, Veggie, TorontoStyle, MontrealStyle) in its Franchise-Stores (TorontoStore, MontrealStore).
public class Main {
	public static void main(String[] args) {
		System.out.println("Factory Method Design Pattern Hamburger Store.");
		System.out.println("Hamburger Store defines a Factory Method for creating different Hamburgers (Cheese, Veggie, TorontoStyle, MontrealStyle) in its Franchise-Stores (TorontoStore, MontrealStore):\n");
		HamburgerStore torontoBurgerStore = new TorontoHamburgerStore();
		System.out.println("The Toronto Hamburger Store is Open for Orders!");
		HamburgerStore montrealBurgerStore = new MontrealHamburgerStore();
		System.out.println("The Montreal Hamburger Store is Open for Orders!\n");

		// Let's take some orders from our clients in Toronto:
		System.out.println("Placing an Order for a Toronto-Style Burger:");
		Hamburger torontoStyleHamburger = torontoBurgerStore.orderHamburger("Toronto Style Burger");
		System.out.println("\tOrder for " + torontoStyleHamburger.getType() + " is ready!\n");
		System.out.println("Placing an Order for a Veggie Burger:");
		Hamburger veggieHamburger = torontoBurgerStore.orderHamburger("Veggie Burger");
		System.out.println("\tOrder for " + veggieHamburger.getType() + " is ready!\n");

		// Let's take some orders from our clients in Montreal:
		System.out.println("Placing an Order for a Montreal-Style Burger:");
		Hamburger montrealStyleHamburger = montrealBurgerStore.orderHamburger("Montreal Style Burger");
		System.out.println("\tOrder for " + montrealStyleHamburger.getType() + " is ready!\n");
		System.out.println("Placing an Order for a Cheese Burger:");
		Hamburger cheeseHamburger = montrealBurgerStore.orderHamburger("Cheese Burger");
		System.out.println("\tOrder for " + cheeseHamburger.getType() + " is ready!\n");
	}
}
