package structuralDesignPatterns.decoratorDesignPattern.projectShapeDecorating.ConcreteComponent;

import structuralDesignPatterns.decoratorDesignPattern.projectShapeDecorating.Component.Shape;

public class Circle implements Shape {
    @Override
    public void draw() { System.out.println("Shape: Circle"); }
}
