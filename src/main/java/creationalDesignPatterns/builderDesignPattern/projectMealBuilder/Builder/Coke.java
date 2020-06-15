package creationalDesignPatterns.builderDesignPattern.projectMealBuilder.Builder;

public class Coke extends ColdDrink {
    @Override
    public float price() { return 1.75f; }

    @Override
    public String name() { return "Coke"; }
}
