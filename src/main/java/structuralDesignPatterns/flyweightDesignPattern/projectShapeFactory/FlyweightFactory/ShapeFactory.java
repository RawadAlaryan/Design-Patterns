package structuralDesignPatterns.flyweightDesignPattern.projectShapeFactory.FlyweightFactory;

import java.util.HashMap;

import structuralDesignPatterns.flyweightDesignPattern.projectShapeFactory.ConcreteFlyweight.Circle;

public class ShapeFactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<String, Circle>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
        }
        return circle;
    }
}
