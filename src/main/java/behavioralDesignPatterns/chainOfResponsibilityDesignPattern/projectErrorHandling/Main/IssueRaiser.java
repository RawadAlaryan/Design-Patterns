package behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectErrorHandling.Main;

import behavioralDesignPatterns.chainOfResponsibilityDesignPattern.projectErrorHandling.Handler.ReceiverInterface;

class IssueRaiser {
    public ReceiverInterface setFirstReceiver;

    public IssueRaiser(ReceiverInterface firstReceiver) {
        this.setFirstReceiver = firstReceiver;
    }

    public void raiseMessage(Message msg) {
        if (setFirstReceiver != null) { setFirstReceiver.processMessage(msg); }
    }
}
