package structuralDesignPatterns.adapterDesignPattern.projectInventorySystem.Main;

import structuralDesignPatterns.adapterDesignPattern.projectInventorySystem.Adaptee.OutsiderItem;
import structuralDesignPatterns.adapterDesignPattern.projectInventorySystem.Client.Inventory;
import structuralDesignPatterns.adapterDesignPattern.projectInventorySystem.ConcreteAdapter.ItemAdapter;

//Adapter Design Pattern Inventory System (with Adapter for adding items from third-party stores).
//Inventory System uses a Concrete Item Adapters from the Item Interface for entering third-party items (OutsiderItem).
public class Main {
    public static void main(String[] args) {
    	System.out.println("Adapter Design Pattern Inventory System (with Adapter for accepting products from third-party stores).");
        System.out.println("Inventory System uses a Concrete Item Adapters from the Item Interface for entering third-party items (OutsiderItem):\n");
        
    	//Starting Inventory System Application:
    	System.out.println("Starting Inventory System Application.");
    	Inventory inventory = new Inventory();
    	    	
    	//Receiving some OutsiderItems from third-party stores:
    	System.out.println("Receiving some OutsiderItems from third-party stores to Inventory List.");
    	OutsiderItem cellphone = new OutsiderItem("Samsung Galaxy X", 1000);
    	OutsiderItem tablet = new OutsiderItem("I-Pad Pro", 500);
    	
    	//Inventory adding some OutsiderItems from third-party stores:
    	System.out.println("\nAdding some OutsiderItems from third-party stores:");
    	System.out.println("\tInventory System needs access to OutsiderItems' Names and Prices. Using an ItemAdapter:");
    	ItemAdapter itemAdapter = null;
    	
    	itemAdapter = new ItemAdapter(cellphone);
    	inventory.addItemToInventory(itemAdapter);
    	
    	itemAdapter = new ItemAdapter(tablet);
    	inventory.addItemToInventory(itemAdapter);
    	
    	System.out.println("\nRemoving some OutsiderItems from third-party stores from Inventory List:");
    	System.out.println("\tInventory System needs access to OutsiderItems' Names and Prices. Using an ItemAdapter:");
    	itemAdapter = new ItemAdapter(cellphone);
    	inventory.removeItemFromInventory(itemAdapter);
    }
}
