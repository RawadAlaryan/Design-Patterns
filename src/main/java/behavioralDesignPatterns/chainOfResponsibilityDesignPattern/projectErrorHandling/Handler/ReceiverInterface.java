package behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectErrorHandling.Handler;

import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectErrorHandling.Main.Message;

public interface ReceiverInterface {
    boolean processMessage(Message msg);
    void setNextChain(ReceiverInterface nextChain);
}
