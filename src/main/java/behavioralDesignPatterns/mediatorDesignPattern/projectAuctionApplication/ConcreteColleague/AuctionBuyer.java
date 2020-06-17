package behavioralDesignPatterns.mediatorDesignPattern.projectAuctionApplication.ConcreteColleague;

import behavioralDesignPatterns.mediatorDesignPattern.projectAuctionApplication.Colleague.Buyer;
import behavioralDesignPatterns.mediatorDesignPattern.projectAuctionApplication.Mediator.Mediator;

public class AuctionBuyer extends Buyer {
    //Implementation of the bidding process.  
	//There is an option to bid and an option to  cancel the bidding.
    public AuctionBuyer(Mediator mediator,  String name)   {
        super(mediator, name);
    }

    @Override
    public void bid(int price)  { this.setPrice(price); }

    @Override
    public void cancelTheBid() { this.setPrice(-1); }

    @Override
    public void auctionHasEnded() {
        System.out.println("Received message that the auction is over: " + getName());
    }
}
