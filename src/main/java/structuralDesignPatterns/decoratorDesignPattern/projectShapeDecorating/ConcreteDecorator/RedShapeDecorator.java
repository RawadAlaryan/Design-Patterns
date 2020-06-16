package structuralDesignPatterns.decoratorDesignPattern.projectShapeDecorating.ConcreteDecorator;

import structuralDesignPatterns.decoratorDesignPattern.projectShapeDecorating.Component.Shape;
import structuralDesignPatterns.decoratorDesignPattern.projectShapeDecorating.Decorator.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
