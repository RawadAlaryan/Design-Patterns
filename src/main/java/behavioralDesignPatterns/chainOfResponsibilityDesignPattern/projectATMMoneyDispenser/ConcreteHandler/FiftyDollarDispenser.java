package behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.ConcreteHandler;

import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.Handler.DispenseChain;
import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.Main.Currency;

public class FiftyDollarDispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) { chain = nextChain; }

    @Override
    public void dispense(Currency currency) {				
        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;				
            System.out.println("Dispensing " + num + " of 50$ notes");
            if (remainder != 0 ) { this.chain.dispense(new Currency(remainder)); }
            else { return; }
        }
    }
}