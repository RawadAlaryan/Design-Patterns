package creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.ConcreteProduct;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractProduct.Shape;

public class Circle implements Shape {
    @Override
    public void draw() { System.out.println("Drawing a Circle Shape."); }
}