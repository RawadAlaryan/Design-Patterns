package structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.Main;

import structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.Client.ShapeDrawingApplication;

//Adapter Design Pattern Shape Adapters.
//ShapeDrawing Application uses a Concrete Shape Adapters (LineAdapter, RectangleAdapter) from the Shape Interface instead of using an old Adaptee (Line, Rectangle).
public class Main {
    public static void main(String[] args) {
    	System.out.println("Adapter Design Pattern Shape Adapters.");
        System.out.println("Client uses a Concrete Shape Adapter (LineAdaoter, RectangleAdapter) from the Shape Interface instead of using an old Adaptee (Line, Rectangle):\n");
        
    	//Starting a ShapeDrawingApplication:
    	System.out.println("Starting a Shape-Drawing-Application:");
    	ShapeDrawingApplication drawingApplication = new ShapeDrawingApplication();
    	    	
    	//Drawing Shapes using ShapeAdapters:
    	System.out.println("\nDrawing a Line using ShapeAdapters:");
    	int x1 = 10, 			y1 = 20;
    	int x2 = 30, 			y2 = 60;
    	drawingApplication.drawLine(x1, y1, x2, y2);
    	
    	System.out.println("\nDrawing a Circle using ShapeAdapters:");
    	drawingApplication.drawCircle(x1, y1, x2, y2);
    }
}
