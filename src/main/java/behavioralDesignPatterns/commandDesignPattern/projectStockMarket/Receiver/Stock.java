package behavioralDesignPatterns.commandDesignPattern.projectStockMarket.Receiver;

public class Stock {
    private String name = "Google";
    private int quantity = 1000;

    public void buy() { System.out.println("Stock [ Name: "+name+ " , Quantity: " + quantity +" ]\tis bought."); }

    public void sell() { System.out.println("Stock [ Name: "+name+" , Quantity: " + quantity +" ]\tis sold."); }
}
