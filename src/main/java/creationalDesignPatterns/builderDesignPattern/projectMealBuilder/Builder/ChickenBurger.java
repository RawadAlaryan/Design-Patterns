package creationalDesignPatterns.builderDesignPattern.projectMealBuilder.Builder;

public class ChickenBurger extends Burger {
    @Override
    public float price() { return 4.50f; }

    @Override
    public String name() { return "Chicken Burger"; }
}
