package creationalDesignPatterns.prototypeDesignPattern.projectCarCloning.Prototype;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
    protected String modelName;
    public int price;

    public String getModelName() { return modelName; }
    public void setModelName(String modelName) { this.modelName = modelName; }

    public static int setPrice() {
        int price = 0;
        Random r = new Random();
        int p = r.nextInt(100000);
        price = p;
        return price;
    }

    public BasicCar clone() {
        BasicCar clone = null;
        try { clone = (BasicCar)super.clone(); } 
        catch (CloneNotSupportedException e) { e.printStackTrace(); }
        return clone;
    }
}










