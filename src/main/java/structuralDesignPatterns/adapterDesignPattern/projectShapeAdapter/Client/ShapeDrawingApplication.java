package structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.Client;

import structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.Adaptee.Line;
import structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.Adaptee.Rectangle;
import structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.ConcreteAdapter.LineAdapter;
import structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.ConcreteAdapter.RectangleAdapter;
import structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.InterfaceAdapter.Shape;

public class ShapeDrawingApplication {
	private Shape shape;
	
	public void drawLine(int x1, int y1, int x2, int y2) {
		System.out.println("\tDrawing a Line.");
		shape = new LineAdapter(new Line());
		shape.drawShape(x1, y1, x2, y2);
	}
	
	public void drawCircle(int x1, int y1, int x2, int y2){
		System.out.println("\tDrawing a Rectangle.");
		shape = new RectangleAdapter(new Rectangle());
		shape.drawShape(x1, y1, x2, y2);		
	}
}
