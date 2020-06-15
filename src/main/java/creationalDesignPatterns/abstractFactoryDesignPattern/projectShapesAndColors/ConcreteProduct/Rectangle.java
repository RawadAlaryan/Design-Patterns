package creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.ConcreteProduct;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractProduct.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() { System.out.println("Drawing a Rectangle Shape."); }
}
