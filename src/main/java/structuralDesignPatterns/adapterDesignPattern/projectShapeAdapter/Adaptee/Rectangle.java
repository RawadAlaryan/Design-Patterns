package structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.Adaptee;

public class Rectangle {
    public void drawRectangle(int x, int y, int width, int height) {
        System.out.println("\tRectangle with coordinate left-down point (" + x + ";" + y + "), width: " + width + ", height: " + height + " is Drawn !");
    }
}
