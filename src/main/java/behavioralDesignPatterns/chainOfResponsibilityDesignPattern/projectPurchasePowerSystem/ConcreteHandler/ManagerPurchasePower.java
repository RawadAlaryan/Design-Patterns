package behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectPurchasePowerSystem.ConcreteHandler;

import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectPurchasePowerSystem.Handler.PurchasePower;

public class ManagerPurchasePower extends PurchasePower {

	@Override
    protected double getAllowable() { return BASE * 10; }

    @Override
    protected String getRole() { return "Manager"; }
}
