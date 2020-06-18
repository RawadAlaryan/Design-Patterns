package behavioralDesignPatterns.templateMethodDesignPattern.projectOrderProcessTemplate.Template;

public abstract class OrderProcessTemplate {
    public boolean isGift;

    public abstract void doSelect();
    public abstract void doPayment();

    public final void giftWrap() { System.out.println("\tGift wrap successfull."); }

    public abstract void doDelivery();

    //The actual template method:
    public final void processOrder(boolean isGift) {
        doSelect();
        doPayment();
        if (isGift) { giftWrap(); }
        doDelivery();
    }
}