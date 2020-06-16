package structuralDesignPatterns.proxyDesignPattern.projectBankServicesRemoteProxy.Main;

import structuralDesignPatterns.proxyDesignPattern.projectBankServicesRemoteProxy.Proxy.ProxyBank;
import structuralDesignPatterns.proxyDesignPattern.projectBankServicesRemoteProxy.Subject.Bank;

//Proxy Design Pattern Bank Services - Remote Proxy Type.
//Using a ProxyBank instead of Real Bank to manage bank services.
public class Main {
	public static void main(String[] args) {
		System.out.println("Proxy Design Pattern Bank Services - Remote Proxy Type.");
		System.out.println("Using a ProxyBank instead of Real Bank to manage bank services.\n");
		
		 Bank bank = new ProxyBank();
		 try {
			 System.out.println("Client Rawad wants to withdraw Money:");
			 bank.withdrawMoney("Rawad");
			 
			 System.out.println("\nClient Julie wants to withdraw Money:");
			 bank.withdrawMoney("Julie");
		 } 
		 catch (Exception e) { System.out.println(e.getMessage()); }
	}
}
