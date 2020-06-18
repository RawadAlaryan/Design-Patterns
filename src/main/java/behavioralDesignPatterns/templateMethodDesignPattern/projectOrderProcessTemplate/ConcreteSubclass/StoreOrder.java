package behavioralDesignPatterns.templateMethodDesignPattern.projectOrderProcessTemplate.ConcreteSubclass;

import behavioralDesignPatterns.templateMethodDesignPattern.projectOrderProcessTemplate.Template.OrderProcessTemplate;

public class StoreOrder extends OrderProcessTemplate {

    @Override
    public void doSelect() {
        System.out.println("\tCustomer chooses the item from shelf.");
    }

    @Override
    public void doPayment() {
        System.out.println("\tCustomer pays at counter through cash/POS.");
    }

    @Override
    public void doDelivery()  {
        System.out.println("\tItem delivered to in delivery counter.");
    }
}
