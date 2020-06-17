package behavioralDesignPatterns.strategyDesignPattern.projectOnlineShoppingPaymentSystem.ConcreteStrategy;

import behavioralDesignPatterns.strategyDesignPattern.projectOnlineShoppingPaymentSystem.Strategy.Payment;

public class CreditCard implements Payment{

    private String name;
    private String cardNumber;

    public CreditCard(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }
    
    public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getCardNumber() { return cardNumber; }
	public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " $ paid with Card from " + name + ".");
    }
}
