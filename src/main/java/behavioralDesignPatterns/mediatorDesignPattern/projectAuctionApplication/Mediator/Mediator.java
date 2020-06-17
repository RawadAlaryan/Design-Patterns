package behavioralDesignPatterns.mediatorDesignPattern.projectAuctionApplication.Mediator;

import behavioralDesignPatterns.mediatorDesignPattern.projectAuctionApplication.Colleague.Buyer;

public interface Mediator {
    public void addBuyer(Buyer buyer);
    public void findHighestBidder();
}


