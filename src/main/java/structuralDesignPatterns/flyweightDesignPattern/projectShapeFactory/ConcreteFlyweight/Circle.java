package structuralDesignPatterns.flyweightDesignPattern.projectShapeFactory.ConcreteFlyweight;

import structuralDesignPatterns.flyweightDesignPattern.projectShapeFactory.FlyweightFactory.Shape;

public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) { this.color = color; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    //Getters and Setters:
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }

    @Override
    public void draw() {
        System.out.printf("Circle Drawing:\tColor: " + color +"\t\tx: " + "%3d" + "\ty: " + "%3d" + "\tradius: " + radius + "\n", x, y);
    }
}
