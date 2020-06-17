package behavioralDesignPatterns.commandDesignPattern.projectStockMarket.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectStockMarket.Command.Order;
import behavioralDesignPatterns.commandDesignPattern.projectStockMarket.Receiver.Stock;


public class SellStock implements Order {
    private Stock myStock;

    public SellStock(Stock someStock) { this.myStock = someStock; }

    public void execute() { myStock.sell(); }
}
