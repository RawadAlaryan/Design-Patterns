package creationalDesignPatterns;

public class FactoryMethodImplementationWithAbstractCreator {

	public static void main(String[] args) {
		//Factory Method Implementation with Abstract Creator:
		System.out.println("Factory Method Implementation with Abstract Creator:");
        
		//Get an object of Circle and call its draw method.
        Shape circle = new CircleFactory().getShape();
        circle.draw();
        
        //Get an object of Rectangle and call its draw method.
        Shape rectangle = new RectangleFactory().getShape();
        rectangle.draw();
        
        //Get an object of Square and call its draw method.
        Shape square = new SquareFactory().getShape();
        square.draw();
	}

	
	//Factory Method Implementation with Abstract Creator:
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

	
	//Base Abstract Class Factory:
	static abstract class AbstractShapeFactory {
		protected abstract Shape factoryMethod();
	    public Shape getShape() { return factoryMethod(); }
	    //Other helper methods
	}

	//Factory Subclasses:
	static class RectangleFactory extends AbstractShapeFactory {
	    protected Shape factoryMethod() { return new Rectangle(); }
	}
	static class SquareFactory extends AbstractShapeFactory {
	    protected Shape factoryMethod() { return new Square(); }
	}
	static class CircleFactory extends AbstractShapeFactory {
	    protected Shape factoryMethod() { return new Circle(); }
	}

	
}
