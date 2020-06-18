package behavioralDesignPatterns.templateMethodDesignPattern.projectOrderProcessTemplate.ConcreteSubclass;

import behavioralDesignPatterns.templateMethodDesignPattern.projectOrderProcessTemplate.Template.OrderProcessTemplate;

public class NetOrder extends OrderProcessTemplate {
    @Override
    public void doSelect()  {
        System.out.println("\tItem added to online shopping cart.");
        System.out.println("\tGet gift wrap preference.");
        System.out.println("\tGet delivery address.");
    }

    @Override
    public void doPayment() {
        System.out.println("\tOnline Payment through Netbanking, card or Pay pal.");
    }

    @Override
    public void doDelivery(){
        System.out.println("\tShip the item through post office to delivery address.");
    }
}
