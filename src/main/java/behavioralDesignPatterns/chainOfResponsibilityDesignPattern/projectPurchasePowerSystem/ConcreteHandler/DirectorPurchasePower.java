package behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectPurchasePowerSystem.ConcreteHandler;

import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectPurchasePowerSystem.Handler.PurchasePower;

public class DirectorPurchasePower extends PurchasePower {
    @Override
    protected double getAllowable() { return BASE * 20; }

    @Override
    protected String getRole() { return "Director"; }
}
