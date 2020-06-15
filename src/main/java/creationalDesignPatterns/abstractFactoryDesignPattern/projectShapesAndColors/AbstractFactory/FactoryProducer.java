package creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.AbstractFactory;



import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.ConcreteFactory.ColorFactory;
import creationalDesignPatterns.abstractFactoryDesignPattern.projectShapesAndColors.ConcreteFactory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("SHAPE")) { return new ShapeFactory(); }
        else if(choice.equalsIgnoreCase("COLOR")) { return new ColorFactory(); }
        return null;
    }
}
