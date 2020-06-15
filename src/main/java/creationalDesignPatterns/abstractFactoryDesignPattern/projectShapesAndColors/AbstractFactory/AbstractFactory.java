package creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractFactory;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractProduct.Color;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractProduct.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}






