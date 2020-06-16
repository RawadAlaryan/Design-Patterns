package structuralDesignPatterns.bridgeDesignPattern.projectShapeColoring.Implementation;

import structuralDesignPatterns.bridgeDesignPattern.projectShapeColoring.Abstraction.ColorInterface;

public class RedColor implements ColorInterface {
    @Override
    public void fillWithColor(int border) {
        System.out.print("Red color with " + border + " inch border.");
    }
}
