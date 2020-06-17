package behavioralDesignPatterns.strategyDesignPattern.projectOnlineShoppingPaymentSystem.Context;

import java.util.ArrayList;
import java.util.List;

import behavioralDesignPatterns.strategyDesignPattern.projectOnlineShoppingPaymentSystem.Strategy.Payment;

public class ShoppingCart {

    List<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<Product>();
    }

    public void addProduct(Product product) { productList.add(product); }

    public void removeProduct(Product product) { productList.remove(product); }

    public int calculateTotal() {
        int sum = 0;
        for (Product product : productList) { sum += product.getPrice(); }
        return sum;
    }

    public void payUsing( Payment paymentStrategy) {
         int amount = calculateTotal();
         paymentStrategy.pay(amount);
    }
}
