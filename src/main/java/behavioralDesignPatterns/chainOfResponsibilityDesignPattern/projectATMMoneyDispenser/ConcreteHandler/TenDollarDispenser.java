package behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.ConcreteHandler;

import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.Handler.DispenseChain;
import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.Main.Currency;

public class TenDollarDispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) { this.chain = nextChain; }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int num = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;
            System.out.println("Dispensing " + num + " of 10$ notes.");
            if (remainder != 0) this.chain.dispense(new Currency(remainder));
        } 
        else { return; }
    }
}
