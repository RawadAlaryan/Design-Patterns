package behavioralDesignPatterns.mediatorDesignPattern.projectAuctionApplication.Colleague;

import behavioralDesignPatterns.mediatorDesignPattern.projectAuctionApplication.Mediator.Mediator;

public abstract class Buyer {
    // this class holds the buyer
    protected Mediator mediator;
    private String name;
    private int price;
    
    public String getName() { return name; }
	
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
    
    public Buyer(Mediator med, String name)  {
        this.mediator = med;
        this.name = name;
    }

    public abstract void bid(int price);
    public abstract void cancelTheBid();
    public abstract void auctionHasEnded();
}
