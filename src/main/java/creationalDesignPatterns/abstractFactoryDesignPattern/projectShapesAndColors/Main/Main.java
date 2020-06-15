package creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.Main;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractFactory.AbstractFactory;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractFactory.FactoryProducer;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractProduct.Color;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractProduct.Shape;

//Abstract Factory Design Pattern Shapes and Colors.
//Using multiple Factory Shape and Color Classes to manufacture different Colors (Red, Green, Blue) and Shapes (Rectangle, Circle, Square).
public class Main {
    public static void main(String [] args) {
		System.out.println("Abstract Factory Design Pattern Shapes and Colors.");
		System.out.println("Using multiple Factory Shape and Color Classes to manufacture different Colors (Red, Green, Blue) and Shapes (Rectangle, Circle, Square):\n");
    	
    	//get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Shape Circle
        shape1.draw();

        //get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Shape Rectangle
        shape2.draw();

        //get an object of Shape Square
        Shape shape3 = shapeFactory.getShape("SQUARE");
        //call draw method of Shape Square
        shape3.draw();

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Color Red
        Color color1 = colorFactory.getColor("RED");

        //call fill method of Red
        color1.fill();

        //get an object of Color Green
        Color color2 = colorFactory.getColor("Green");

        //call fill method of Green
        color2.fill();

        //get an object of Color Blue
        Color color3 = colorFactory.getColor("BLUE");

        //call fill method of Color Blue
        color3.fill();
    }
}
