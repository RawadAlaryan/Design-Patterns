package behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.Handler;

import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.Main.Currency;

public interface DispenseChain {
    public void setNextChain(DispenseChain nextChain);
    public void dispense(Currency currency);
}
