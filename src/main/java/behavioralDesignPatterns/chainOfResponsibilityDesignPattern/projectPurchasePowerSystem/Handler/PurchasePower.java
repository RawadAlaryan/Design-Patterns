package behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectPurchasePowerSystem.Handler;

import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectPurchasePowerSystem.Main.PurchaseRequest;

public abstract class PurchasePower {
    protected static final double BASE = 1000;
    protected PurchasePower successor;

    public void setSuccessor(PurchasePower successor) { this.successor = successor; }
    public PurchasePower getSuccessor() { return successor; }
    
    abstract protected double getAllowable();
    
    abstract protected String getRole();

    public void processRequest(PurchaseRequest request ) {
        if (request.getAmount() < this.getAllowable()) {
        	System.out.println("\t" + this.getRole() + " will approve $" + request.getAmount());
        }
        else if (successor != null) { 
        	System.out.println("\t" + this.getRole() + " can not approve $" + request.getAmount() + ". Passing Responsibility to " + successor.getRole());
        	successor.processRequest(request); 
        }
    }
}
