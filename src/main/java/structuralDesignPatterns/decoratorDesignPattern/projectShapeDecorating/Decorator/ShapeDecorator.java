package structuralDesignPatterns.decoratorDesignPattern.projectShapeDecorating.Decorator;

import structuralDesignPatterns.decoratorDesignPattern.projectShapeDecorating.Component.Shape;

public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
