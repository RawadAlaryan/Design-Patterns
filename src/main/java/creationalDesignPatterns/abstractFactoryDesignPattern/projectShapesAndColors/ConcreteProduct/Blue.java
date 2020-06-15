package creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.ConcreteProduct;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractProduct.Color;

public class Blue implements Color {
    @Override
    public void fill() { System.out.println("Filling with Blue Color."); }
}
