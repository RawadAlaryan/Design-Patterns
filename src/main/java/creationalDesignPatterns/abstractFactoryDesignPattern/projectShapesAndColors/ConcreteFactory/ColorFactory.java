package creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.ConcreteFactory;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractFactory.AbstractFactory;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractProduct.Color;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractProduct.Shape;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.ConcreteProduct.Blue;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.ConcreteProduct.Green;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.ConcreteProduct.Red;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) { return null; }

    @Override
    public Color getColor(String color) {
        if(color == null) { return null; }
        if(color.equalsIgnoreCase("RED")) { return new Red(); } 
        else if(color.equalsIgnoreCase("GREEN")) { return new Green(); } 
        else if(color.equalsIgnoreCase("BLUE")) { return new Blue(); }
        return null;
    }
}
