package behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.ConcreteHandler;

import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.Handler.DispenseChain;
import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.Main.Currency;

public class TwentyDollarDispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) { this.chain = nextChain; }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 20) {
        	int num = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Dispensing " + num + " of 20$ notes.");
            if (remainder != 0) { this.chain.dispense(new Currency(remainder)); }
        } 
        else { return; }
    }
}
