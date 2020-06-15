package creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.ConcreteFactory;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractFactory.AbstractFactory;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractProduct.Color;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractProduct.Shape;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.ConcreteProduct.Circle;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.ConcreteProduct.Rectangle;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.ConcreteProduct.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null) { return null; }
        if(shapeType.equalsIgnoreCase("CIRCLE")) { return new Circle(); }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")) { return new Rectangle(); }
        else if(shapeType.equalsIgnoreCase("SQUARE")) { return new Square(); }
        return null;
    }

    @Override
    public Color getColor(String color) { return null; }
}
