package behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectErrorHandling.ConcreteHandler;

import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectErrorHandling.Handler.ReceiverInterface;
import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectErrorHandling.Main.Message;

public class EmailErrorHandler implements ReceiverInterface  {
    private ReceiverInterface nextReceiver;

    public void setNextChain(ReceiverInterface nextReceiver) { this.nextReceiver = nextReceiver; }

    public boolean processMessage(Message msg)  {
        if (msg.text.contains("Email"))  {
            System.out.println("EmailErrorHandler processed "+ msg.priority + "priority issue: "+ msg.text);
            return true;
        }
        else { if (nextReceiver != null) { nextReceiver.processMessage(msg); } }
        return false;
    }
}
