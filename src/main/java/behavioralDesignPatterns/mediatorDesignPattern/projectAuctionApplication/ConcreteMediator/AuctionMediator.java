package behavioralDesignPatterns.mediatorDesignPattern.projectAuctionApplication.ConcreteMediator;

import java.util.ArrayList;

import behavioralDesignPatterns.mediatorDesignPattern.projectAuctionApplication.Colleague.Buyer;
import behavioralDesignPatterns.mediatorDesignPattern.projectAuctionApplication.Mediator.Mediator;

public class AuctionMediator implements Mediator {
    //This class implements the mediator interface and holds all the buyers in an arraylist.  
	//We can add buyers and find the highest bidder
    private ArrayList<Buyer> buyers;

    public AuctionMediator() { buyers = new ArrayList<Buyer>(); }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.getName() + " was added to the buyers list.");
    }

    @Override
    public void findHighestBidder() {
        int maxBid = 0;
        Buyer winner = null;
        for (Object a : buyers) {
            Buyer b = (Buyer) a;
            if (b.getPrice() > maxBid) {
                maxBid = b.getPrice();
                winner = b;
            }
        }
        System.out.println("The auction winner is " + winner.getName() +  ". He paid " + winner.getPrice() + "$ for the item.");
        for (Object a : buyers) {
            Buyer b = (Buyer) a;
            b.auctionHasEnded();
        }
    }
}
