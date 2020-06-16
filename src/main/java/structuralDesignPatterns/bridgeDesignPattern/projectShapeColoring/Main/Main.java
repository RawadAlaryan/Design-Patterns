package structuralDesignPatterns.bridgeDesignPattern.projectShapeColoring.Main;

import structuralDesignPatterns.bridgeDesignPattern.projectShapeColoring.Abstraction.ColorInterface;
import structuralDesignPatterns.bridgeDesignPattern.projectShapeColoring.Abstraction.Shape;
import structuralDesignPatterns.bridgeDesignPattern.projectShapeColoring.Implementation.GreenColor;
import structuralDesignPatterns.bridgeDesignPattern.projectShapeColoring.Implementation.Rectangle;
import structuralDesignPatterns.bridgeDesignPattern.projectShapeColoring.Implementation.RedColor;
import structuralDesignPatterns.bridgeDesignPattern.projectShapeColoring.Implementation.Triangle;

//Bridge Design Pattern Shape Coloring.
//Client using a Bridge between Shapes and different Colors.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Bridge Design Pattern Shape Coloring.");
    	System.out.println("Client using a Bridge between Shapes and different Colors:\n");

        //Coloring Green to Triangle
        System.out.println("\nColoring Triangle:");
        ColorInterface green = new GreenColor();
        Shape triangleShape = new Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20, 3);

        //Coloring Red to Rectangle
        System.out.println("\n\nColoring Rectangle :");
        ColorInterface red = new RedColor();
        Shape rectangleShape = new Rectangle(red);
        rectangleShape.drawShape(50);
        rectangleShape.modifyBorder(50, 2);
    }
}
