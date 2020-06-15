package creationalDesignPatterns.builderDesignPattern.projectPizzaBuilder.Main;

import creationalDesignPatterns.builderDesignPattern.projectPizzaBuilder.Builder.MexicanPizzaBuilder;
import creationalDesignPatterns.builderDesignPattern.projectPizzaBuilder.Builder.Pizza;
import creationalDesignPatterns.builderDesignPattern.projectPizzaBuilder.Builder.PizzaBuilder;

//Builder Design Pattern Pizza Builder.
//Building a customized Pizza by using the PizzaBuilder Class.
public class Main {
	  public static void main(String[] args) {
		  System.out.println("Builder Design Pattern Pizza Builder.");
		  System.out.println("Building a customized Pizza by using the PizzaBuilder Class:\n");

	        Waiter waiter = new Waiter();
	        PizzaBuilder mexicanPizzabuilder = new MexicanPizzaBuilder();
	        
	        waiter.setPizzaBuilder( mexicanPizzabuilder);
	        waiter.constructPizza();
	        Pizza pizza = waiter.getPizza();
	        System.out.println("The Customized Pizza is ready!");
	        System.out.println(pizza);
	  }
}
