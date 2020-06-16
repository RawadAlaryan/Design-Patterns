package structuralDesignPatterns.adapterDesignPattern.projectAreaCalculator.Adaptee;

import structuralDesignPatterns.adapterDesignPattern.projectAreaCalculator.Main.Rectangle;

public interface AreaCalculatorInterface {
    // Target interface
    public double getArea(Rectangle rectangle);
}

