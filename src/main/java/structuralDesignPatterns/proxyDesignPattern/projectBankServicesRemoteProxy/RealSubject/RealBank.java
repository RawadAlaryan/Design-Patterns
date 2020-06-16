package structuralDesignPatterns.proxyDesignPattern.projectBankServicesRemoteProxy.RealSubject;

import structuralDesignPatterns.proxyDesignPattern.projectBankServicesRemoteProxy.Subject.Bank;

public class RealBank implements Bank {
    @Override
    public void withdrawMoney(String clientName) throws Exception {
        System.out.println("\t" + clientName + " is withdrawing from the ATM.");
    }
}
