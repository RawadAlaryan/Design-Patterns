package creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.ConcreteProduct;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractProduct.Shape;

public class Square implements Shape {
    @Override
    public void draw() { System.out.println("Drawing a Square Shape."); }
}
