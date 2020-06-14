package creationalDesignPatterns;

public class FactoryMethodImplementationWithConcreteCreator {

	public static void main(String[] args) {
        //Factory Method Implementation with Concrete Creator:
        System.out.println("Factory Method Implementation with Concrete Creator:");
        ShapeFactory shapeFactory = new ShapeFactory();

        //Get an object of Circle and call its draw method.
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        //Get an object of Rectangle and call its draw method.
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        //Get an object of Square and call its draw method.
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
	}

	
	
	//Factory Method Implementation with Concrete Creator:
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

	
	static class ShapeFactory {
	    //Use getShape method to get object of type shape:
	    public Shape getShape(String shapeType) {
	        if (shapeType == null) { return null; }
	        else if (shapeType.equalsIgnoreCase("CIRCLE")) { return new Circle(); }
	        else if (shapeType.equalsIgnoreCase("RECTANGLE")) { return new Rectangle(); }
	        else if (shapeType.equalsIgnoreCase("SQUARE")) { return new Square(); }
	        return null;
	    }
	}

	
}
