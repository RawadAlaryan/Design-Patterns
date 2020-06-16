package structuralDesignPatterns.bridgeDesignPattern.projectShapeColoring.Implementation;

import structuralDesignPatterns.bridgeDesignPattern.projectShapeColoring.Abstraction.ColorInterface;

public class GreenColor implements ColorInterface {
    @Override
    public void fillWithColor(int border) {
        System.out.print("Green color with " + border + " inch border.");
    }
}
