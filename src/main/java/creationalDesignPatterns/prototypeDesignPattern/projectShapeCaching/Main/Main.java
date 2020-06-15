package creationalDesignPatterns.prototypeDesignPattern.projectShapeCaching.Main;

import creationalDesignPatterns.prototypeDesignPattern.projectShapeCaching.Prototype.Shape;
import creationalDesignPatterns.prototypeDesignPattern.projectShapeCaching.Prototype.ShapeCache;

//Prototype Design Pattern Shape Caching.
//Using a Shape Cache to clone other shapes.
public class Main {
    public static void main(String[] args) {
    	System.out.println("Prototype Design Pattern Shape Caching.");
    	System.out.println("Using a Shape Cache to clone other shapes:\n");
    	
        ShapeCache.loadCache();

        Shape clonedCircleShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Cloned Circle Shape:\t" + clonedCircleShape.getType());

        Shape clonedSquareShape = (Shape) ShapeCache.getShape("2");
        System.out.println("Cloned Square Shape:\t" + clonedSquareShape.getType());

        Shape clonedRectangleShape = (Shape) ShapeCache.getShape("3");
        System.out.println("Cloned Rectangle Shape:\t" + clonedRectangleShape.getType());
    }
}
