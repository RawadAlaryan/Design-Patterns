package behavioralDesignPatterns.commandDesignPattern.projectStockMarket.Main;

import behavioralDesignPatterns.commandDesignPattern.projectStockMarket.ConcreteCommand.BuyStock;
import behavioralDesignPatterns.commandDesignPattern.projectStockMarket.ConcreteCommand.SellStock;
import behavioralDesignPatterns.commandDesignPattern.projectStockMarket.Invoker.Broker;
import behavioralDesignPatterns.commandDesignPattern.projectStockMarket.Receiver.Stock;

//Command Design Pattern Stock Market.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Command Design Pattern Stock Market.\n");
    	    	
        Stock googleStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(googleStock);
        SellStock sellStockOrder = new SellStock(googleStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
