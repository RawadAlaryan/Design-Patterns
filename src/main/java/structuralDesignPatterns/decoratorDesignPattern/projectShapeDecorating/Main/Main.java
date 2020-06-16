package structuralDesignPatterns.decoratorDesignPattern.projectShapeDecorating.Main;

import structuralDesignPatterns.decoratorDesignPattern.projectShapeDecorating.Component.Shape;
import structuralDesignPatterns.decoratorDesignPattern.projectShapeDecorating.ConcreteComponent.Circle;
import structuralDesignPatterns.decoratorDesignPattern.projectShapeDecorating.ConcreteComponent.Rectangle;
import structuralDesignPatterns.decoratorDesignPattern.projectShapeDecorating.ConcreteDecorator.RedShapeDecorator;

//Decorator Design Pattern Shape Decorating.
//Decorating Shapes with Color Decorators.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Decorator Design Pattern Shape Decorating.");
    	System.out.println("Decorating Shapes with Color Decorators:\n");
    	
    	Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
