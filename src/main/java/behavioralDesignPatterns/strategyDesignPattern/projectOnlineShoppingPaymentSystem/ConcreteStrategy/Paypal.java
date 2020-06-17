package behavioralDesignPatterns.strategyDesignPattern.projectOnlineShoppingPaymentSystem.ConcreteStrategy;

import behavioralDesignPatterns.strategyDesignPattern.projectOnlineShoppingPaymentSystem.Strategy.Payment;

public class Paypal implements Payment{

    private String email;
    private String password;

	public Paypal(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
 	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }

    @Override
    public void pay(int amount) {
        System.out.println( amount + " $ paid with Paypal from email: " + email + ".");
    }
}
