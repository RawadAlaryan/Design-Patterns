package creationalDesignPatterns.builderDesignPattern.projectMealBuilder.Builder;

public class Pepsi extends ColdDrink {
    @Override
    public float price() { return 1.50f; }

    @Override
    public String name() { return "Pepsi"; }
}
