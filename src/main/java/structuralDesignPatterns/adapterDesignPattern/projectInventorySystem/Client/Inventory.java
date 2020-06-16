package structuralDesignPatterns.adapterDesignPattern.projectInventorySystem.Client;

import java.util.ArrayList;
import java.util.List;

import structuralDesignPatterns.adapterDesignPattern.projectInventorySystem.InterfaceAdapter.ItemInterface;

public class Inventory {
	private List<ItemInterface> inventoryList;
 
    public Inventory() { this.inventoryList = new ArrayList<ItemInterface>(); }
 
    public void addItemToInventory(ItemInterface item) { 
    	this.inventoryList.add(item);
    	System.out.println("\tAdding item with name: " + item.getItemName() + " and price: " + item.getItemPrice() + " dollars to Inventory List.");
    }
 
    public void removeItemFromInventory(ItemInterface item) { 
    	this.inventoryList.remove(item); 
    	System.out.println("\tRemoving item with name: " + item.getItemName() + " and price: " + item.getItemPrice() + " dollars from Inventory List.");
    }
}
