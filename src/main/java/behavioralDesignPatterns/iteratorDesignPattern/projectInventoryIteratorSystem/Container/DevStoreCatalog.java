package behavioralDesignPatterns.iteratorDesignPattern.projectInventoryIteratorSystem.Container;

import behavioralDesignPatterns.iteratorDesignPattern.projectInventoryIteratorSystem.Iterator.DevStoreIterator;
import behavioralDesignPatterns.iteratorDesignPattern.projectInventoryIteratorSystem.Iterator.Product;

public class DevStoreCatalog implements Catalog {
    private static final int MAX_ITEMS = 4;
    private int numberOfProducts = 0;
    Product[] catalog;

    public DevStoreCatalog() {
        catalog = new Product[MAX_ITEMS];
        //Add a few products to catalog:
        addItem("C++ is NOT dead. Yet!", "T-Shirt", 39.99);
        addItem("Java Rocks. Yes", "Silky mouse-pad", 19.99);
        addItem("Java Design Patterns", "Book - A must!", 139.99);
        addItem("Web Development Cookbook", "The best Web Development cookbook - 2018", 49.99);
    }


    public void addItem(String name, String description, double price) {
         Product product = new Product(name, description, price);
         if (numberOfProducts >= MAX_ITEMS) { System.out.println("Catalog is Full - can't add products."); }
         else {
             catalog[numberOfProducts] = product;
             numberOfProducts = numberOfProducts + 1;
         }
    }

    public DevStoreIterator createIterator() { return  new DevStoreIterator(catalog); }
}
