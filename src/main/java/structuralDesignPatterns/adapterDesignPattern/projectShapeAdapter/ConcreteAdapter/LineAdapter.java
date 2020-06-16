package structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.ConcreteAdapter;

import structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.Adaptee.Line;
import structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.InterfaceAdapter.Shape;

//We use Composition for Adapter Design Pattern. 
//We use an Object from Line Adaptee inside this Adapter Class.
public class LineAdapter implements Shape {
    private Line adapteeLine;

    public LineAdapter(Line line) { this.adapteeLine = line; }

    public Line getAdapteeLine() { return adapteeLine; }

	@Override
    public void drawShape(int x1, int y1, int x2, int y2) { adapteeLine.drawLine(x1, y1, x2, y2); }
}
