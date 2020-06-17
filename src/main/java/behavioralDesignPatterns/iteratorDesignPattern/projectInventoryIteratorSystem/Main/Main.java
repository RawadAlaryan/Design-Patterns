package behavioralDesignPatterns.iteratorDesignPattern.projectInventoryIteratorSystem.Main;

import behavioralDesignPatterns.iteratorDesignPattern.projectInventoryIteratorSystem.Client.InventorySystem;
import behavioralDesignPatterns.iteratorDesignPattern.projectInventoryIteratorSystem.Container.Catalog;
import behavioralDesignPatterns.iteratorDesignPattern.projectInventoryIteratorSystem.Container.DevStoreCatalog;
import behavioralDesignPatterns.iteratorDesignPattern.projectInventoryIteratorSystem.Container.GeekyStoreCatalog;

//Iterator Method Design Pattern Inventory Iterator System.
//Inventory System uses different Iterator Implementations to show Products from different Catalogs.
public class Main {
    public static void main(String[] args) {
        System.out.println("Iterator Method Design Pattern Inventory Iterator System.");
    	System.out.println("Inventory System uses different Iterator Implementations to show Products from different Catalogs:\n");
    	Catalog devStoreCatalog = new DevStoreCatalog();
        Catalog geekyStoreCatalog = new GeekyStoreCatalog();

        InventorySystem generalOwner = new InventorySystem(geekyStoreCatalog, devStoreCatalog);
        generalOwner.showCatalogs();
    }
}
