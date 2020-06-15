package creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.ConcreteProduct;

import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractProduct.Color;

public class Red implements Color {
    @Override
    public void fill() { System.out.println("Filling with Red Color."); }
}

