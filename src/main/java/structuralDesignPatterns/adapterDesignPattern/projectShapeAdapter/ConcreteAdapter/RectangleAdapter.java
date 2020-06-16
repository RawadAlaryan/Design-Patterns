package structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.ConcreteAdapter;

import structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.Adaptee.Rectangle;
import structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.InterfaceAdapter.Shape;

//We use Composition for Adapter Design Pattern. 
//We use an Object from Rectangle Adaptee inside this Adapter Class.
public class RectangleAdapter implements Shape {
    private Rectangle adapteeRectangle;

    public RectangleAdapter(Rectangle rectangle) { this.adapteeRectangle = rectangle; }

    public Rectangle getAdapteeRectangle() { return adapteeRectangle; }

	@Override
    public void drawShape(int x1, int y1, int x2, int y2) {
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int width = Math.abs(x2 - x1);
        int height = Math.abs(y2 - y1);
        adapteeRectangle.drawRectangle(x, y, width, height);
    }
}
