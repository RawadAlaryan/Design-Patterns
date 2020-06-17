package behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.Main;

import java.util.Scanner;

import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.ConcreteHandler.FiftyDollarDispenser;
import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.ConcreteHandler.TenDollarDispenser;
import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.ConcreteHandler.TwentyDollarDispenser;
import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectATMMoneyDispenser.Handler.DispenseChain;

//Chain Of Responsibility Design Pattern ATM Money Dispenser.
//ATM Dispenser System using a Chain of BankNotes Handlers to process a money transaction request.
public class Client {
    private DispenseChain dispenseChainOne;

    public Client() {
        //Initialize the Chain Of Responsibility:
        this.dispenseChainOne = new FiftyDollarDispenser();
        DispenseChain dispenseChainTwo = new TwentyDollarDispenser();
        DispenseChain dispenseChainThree = new TenDollarDispenser();

        //Set the Chain Of Responsibility:
        dispenseChainOne.setNextChain(dispenseChainTwo);
        dispenseChainTwo.setNextChain(dispenseChainThree);
    }
	
    public static void main(String[] args) {
    	System.out.println("Chain Of Responsibility Design Pattern ATM Money Dispenser.");
    	System.out.println("ATM Dispenser System using a Chain of BankNotes Handlers to process a money transaction request:\n");
    	
        Client atmDispensor = new Client();
        Scanner inputScanner = null;
        
        while(true) {
        	int amount = 0;
            System.out.print("\n\nEnter amount to dispense:\t");
            inputScanner = new Scanner(System.in);
            amount = inputScanner.nextInt();

            if (amount % 10 != 0) { 
            	System.out.println("Amount should be in multiple of 10s."); 		
                inputScanner.close();
            	return; 
            }
            
            //Process the Money Transaction Request starting by DispenseChain c1:
            Currency currency = new Currency(amount);
            atmDispensor.dispenseChainOne.dispense(currency);
        }
    }
}
