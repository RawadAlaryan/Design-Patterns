package creationalDesignPatterns.factoryMethodDesignPattern;

public class FactoryMethodImplementationWithStaticMethodCreator {

	public static void main(String[] args) {
        //Factory Method Implementation with Static Method Creator:
        System.out.println("Factory Method Implementation with Static Method Creator:");
        
        //Get an object of Circle and call its draw method.
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        //Get an object of Rectangle and call its draw method.
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        //Get an object of Square and call its draw method.
        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();
	}

	
	//Interface:
	interface Shape { void draw(); }

	//Implementing Classes:
	static class Rectangle implements Shape {
	    @Override
	    public void draw() { System.out.println("Drawing A Rectangle."); }
	}
	static class Square implements Shape {
	   @Override
	   public void draw() { System.out.println("Drawing A Square."); }
	}
	static class Circle implements Shape {
	    @Override
	    public void draw() { System.out.println("Drawing A Circle."); }
	}

	
	
	//Factory Method Implementation with Static Method Creator
	static public class ShapeFactory {
	    //use getShape method to get object of type shape
	    public static Shape getShape(String shapeType){
	        if(shapeType == null) { return null; }
	        if(shapeType.equalsIgnoreCase("CIRCLE")) { return new Circle(); } 
	        else if(shapeType.equalsIgnoreCase("RECTANGLE")) { return new Rectangle(); } 
	        else if(shapeType.equalsIgnoreCase("SQUARE")) { return new Square(); }
	        return null;
	    }
	}
}
