package structuralDesignPatterns.proxyDesignPattern.projectBankServicesRemoteProxy.Proxy;

import java.util.ArrayList;
import java.util.List;

import structuralDesignPatterns.proxyDesignPattern.projectBankServicesRemoteProxy.RealSubject.RealBank;
import structuralDesignPatterns.proxyDesignPattern.projectBankServicesRemoteProxy.Subject.Bank;

public class ProxyBank implements Bank {
    private RealBank bank = new RealBank();
    private static List<String> bannedClients;

    /**
    Static Block (also called Static Clause): 
    	Used for static initializations of a class. 
    	Code inside static block is executed only once; the first time you make an object of this class or the first time you access a static member of this class. 
    */
    static {
         bannedClients =  new ArrayList<String>();
         bannedClients.add("Sam");
         bannedClients.add("Julie");
    }

    @Override
    public void withdrawMoney(String clientName) throws Exception {
        if (bannedClients.contains(clientName)) {
            throw new Exception("\t" + clientName + " Access Denied!\t" + clientName + " is banned!");
        }
        System.out.println("\tRequest is being made by the Proxy Bank.");
        bank.withdrawMoney(clientName);
    }
}
