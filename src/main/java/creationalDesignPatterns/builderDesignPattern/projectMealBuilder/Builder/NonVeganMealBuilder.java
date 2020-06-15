package creationalDesignPatterns.builderDesignPattern.projectMealBuilder.Builder;

public class NonVeganMealBuilder implements MealBuilderInterface {
    private Meal nonVeganMeal = new Meal();

    @Override
    public void buildBurger() { nonVeganMeal.addItem(new ChickenBurger()); }

    @Override
    public void buildDrink() { nonVeganMeal.addItem(new Pepsi()); }

    @Override
    public Meal getMeal() { return nonVeganMeal; }
}
