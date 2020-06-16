package structuralDesignPatterns.bridgeDesignPattern.projectShapeColoring.Abstraction;

public abstract class Shape {
    protected ColorInterface color;

    public Shape (ColorInterface c) { this.color = c; }

    public abstract void drawShape(int border);
    public abstract void modifyBorder(int border, int increment);
}
