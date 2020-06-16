package structuralDesignPatterns.bridgeDesignPattern.projectShapeColoring.Implementation;

import structuralDesignPatterns.bridgeDesignPattern.projectShapeColoring.Abstraction.ColorInterface;
import structuralDesignPatterns.bridgeDesignPattern.projectShapeColoring.Abstraction.Shape;

public class Rectangle extends Shape {
	public Rectangle(ColorInterface c) { super(c); }

    // Implementer-specific method
    @Override
    public void drawShape(int border) {
        System.out.print("This Rectangle is colored with:\t");
        color.fillWithColor(border);
    }

    // abstraction-specific method
    @Override
    public void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length " + increment + " times.");
        border = border * increment;
        drawShape(border);
    }
}
