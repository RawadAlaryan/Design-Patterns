package behavioralDesignPatterns.commandDesignPattern.projectStockMarket.ConcreteCommand;

import behavioralDesignPatterns.commandDesignPattern.projectStockMarket.Command.Order;
import behavioralDesignPatterns.commandDesignPattern.projectStockMarket.Receiver.Stock;

public class BuyStock implements Order {
    private Stock myStock;

    public BuyStock(Stock someStock) { myStock = someStock; }

    public void execute() { myStock.buy(); }
}
