package structuralDesignPatterns.adapterDesignPattern.projectAreaCalculator.Adaptee;

import structuralDesignPatterns.adapterDesignPattern.projectAreaCalculator.Main.Rectangle;

public class Calculator implements AreaCalculatorInterface {
    Rectangle rectangle;

    public double getArea(Rectangle rectangle) {
        this.rectangle = rectangle;
        return rectangle.length * rectangle.width;
    }
}
