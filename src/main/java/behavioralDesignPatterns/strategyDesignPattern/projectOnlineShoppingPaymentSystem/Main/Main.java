package behavioralDesignPatterns.strategyDesignPattern.projectOnlineShoppingPaymentSystem.Main;

import behavioralDesignPatterns.strategyDesignPattern.projectOnlineShoppingPaymentSystem.ConcreteStrategy.CreditCard;
import behavioralDesignPatterns.strategyDesignPattern.projectOnlineShoppingPaymentSystem.ConcreteStrategy.Paypal;
import behavioralDesignPatterns.strategyDesignPattern.projectOnlineShoppingPaymentSystem.Context.Product;
import behavioralDesignPatterns.strategyDesignPattern.projectOnlineShoppingPaymentSystem.Context.ShoppingCart;

//Strategy Design Pattern Online Shopping Payment System.
//Payment is a generalized Strategy that is implemented by different types of Concrete Payments used by Context of ShoppingCart containing Products.
public class Main {

    public static void main(String[] args) {
    	System.out.println("Strategy Design Pattern Online Shopping Payment System:");
    	System.out.println("Payment is a generalized Strategy that is implemented by different types of Concrete Payments used by Context of ShoppingCart containing Products.\n");
        ShoppingCart shoppingCart = new ShoppingCart();

        Product pants = new Product("234", 25);
        shoppingCart.addProduct(pants);
        Product shirt = new Product("987", 15);
        shoppingCart.addProduct(shirt);

        //Payment Decisions:
        shoppingCart.payUsing(new Paypal("rawad@domain.com", "password"));
        shoppingCart.payUsing(new CreditCard("Rawad Alaryan", "0123456789"));
    }
}