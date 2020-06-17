package behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectPurchasePowerSystem.Main;

import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectPurchasePowerSystem.ConcreteHandler.CEOPurchasePower;
import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectPurchasePowerSystem.ConcreteHandler.DirectorPurchasePower;
import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectPurchasePowerSystem.ConcreteHandler.ManagerPurchasePower;


//Chain Of Responsibility Design Pattern Purchase Power System.
//Purchase Power System using a Chain of Handlers (Manager, Director, CEO) to process a PurchaseRequest for approval.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Chain Of Responsibility Design Pattern Purchase Power System.");
    	System.out.println("Purchase Power System using a Chain of Handlers (Manager, Director, CEO) to process a PurchaseRequest for approval:\n");
    	
    	CEOPurchasePower ceoPurchasePower = new CEOPurchasePower();
        DirectorPurchasePower directorPurchasePower = new DirectorPurchasePower();
        ManagerPurchasePower managerPurchasePower = new ManagerPurchasePower();

        directorPurchasePower.setSuccessor(ceoPurchasePower);
        managerPurchasePower.setSuccessor(directorPurchasePower);

        System.out.println("\nPurchase Request of 50000 for Buying a new Server.");
        System.out.println("Waiting for purchase approval by starting from the lowest in Purchase Power Chain of Responsibility:");
        PurchaseRequest request = new PurchaseRequest(50000, "New Server");
        managerPurchasePower.processRequest(request);
    }
}
