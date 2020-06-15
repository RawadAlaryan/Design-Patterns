package creationalDesignPatterns.builderDesignPattern.projectMealBuilder.Builder;

public class VeganBurger extends Burger {
    @Override
    public float price() { return 3.50f; }

    @Override
    public String name() { return "Vegan Burger"; }
}
