package structuralDesignPatterns.adapterDesignPattern.projectAreaCalculator.ConcreteAdapter;

import structuralDesignPatterns.adapterDesignPattern.projectAreaCalculator.Adaptee.AreaCalculatorInterface;
import structuralDesignPatterns.adapterDesignPattern.projectAreaCalculator.Adaptee.Calculator;
import structuralDesignPatterns.adapterDesignPattern.projectAreaCalculator.Main.Rectangle;
import structuralDesignPatterns.adapterDesignPattern.projectAreaCalculator.Main.Triangle;

public class AreaCalculatorAdapter implements AreaCalculatorInterface {
    Calculator calculator;
    Triangle triangle;

    public AreaCalculatorAdapter(Triangle myTriangle) {
    	triangle = myTriangle;
    }

    public double getArea(Rectangle r) {
        calculator = new Calculator();
        Rectangle rectangle = new Rectangle();
        rectangle.length = triangle.base;
        rectangle.width = 0.5 * triangle.height;
        return calculator.getArea(rectangle);
    }
}
