package behavioralDesignPatterns.iteratorDesignPattern.projectInventoryIteratorSystem.Client;

import behavioralDesignPatterns.iteratorDesignPattern.projectInventoryIteratorSystem.Container.Catalog;
import behavioralDesignPatterns.iteratorDesignPattern.projectInventoryIteratorSystem.Iterator.IteratorInterface;
import behavioralDesignPatterns.iteratorDesignPattern.projectInventoryIteratorSystem.Iterator.Product;

public class InventorySystem {
    Catalog geekyStoreCatalog;
    Catalog devStoreCatalog;

    public InventorySystem(Catalog geekyStoreCatalog, Catalog devStoreCatalog) {
        this.geekyStoreCatalog = geekyStoreCatalog;
        this.devStoreCatalog = devStoreCatalog;
    }


    public void showCatalogs() {
        IteratorInterface geekyStoreIterator = geekyStoreCatalog.createIterator();
        System.out.println("Printing Geeky Catalog: ");
        printCatalog(geekyStoreIterator);

        System.out.println("\nPrinting Dev Catalog: ");
        IteratorInterface devStoreIterator = devStoreCatalog.createIterator();
        printCatalog(devStoreIterator);

    }

    private void printCatalog(IteratorInterface iterator) {
        while (iterator.hasNext()) {
            Product product = (Product)iterator.next();
            System.out.print("\tProduct: " + product.getName());
            System.out.print("\tDescription: " + product.getDescription());
            System.out.println("\tPrice: " + product.getPrice());
        }
    }
}
