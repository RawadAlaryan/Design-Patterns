package structuralDesignPatterns.adapterDesignPattern.projectShapeAdapter.Adaptee;

public class Line {
    public void drawLine(int x1, int y1, int x2, int y2) {
        System.out.println("\tLine from point A(" + x1 + ";" + y1 + "), to point B(" + x2 + ";" + y2 + ") is Drawn !");
    }
}
