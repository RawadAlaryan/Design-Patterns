package behavioralDesignPatterns.templateMethodDesignPattern.projectOrderProcessTemplate.Main;

import behavioralDesignPatterns.templateMethodDesignPattern.projectOrderProcessTemplate.ConcreteSubclass.NetOrder;
import behavioralDesignPatterns.templateMethodDesignPattern.projectOrderProcessTemplate.ConcreteSubclass.StoreOrder;
import behavioralDesignPatterns.templateMethodDesignPattern.projectOrderProcessTemplate.Template.OrderProcessTemplate;

//Template Method Design Pattern Order Process Template.
public class Main {

	public static void main(String[] args) {
		System.out.println("Template Method Design Pattern Order Process Template.\n");

		System.out.println("Starting a Net-Order:");
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(true);

        System.out.println("\n------ We changed the template from NetOrder to StoreOrder ------\n");

        System.out.println("\nStarting a Store-Order:");
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
	}
}
